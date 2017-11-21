package lv.fourinaline;

import java.util.Arrays;


import static lv.fourinaline.GameRun.*;
import static lv.fourinaline.Mark.*;

public class Field {
    private Mark[][] field = new Mark[VERTICAL][HORIZONTAL];

    public Field() {
        for (int i = 0; i < VERTICAL; i++) {
            for (int j = 0; j < HORIZONTAL; j++) {
                field[i][j] = EMPTY;
            }
        }
    }

    public void printField(Mark[][] field) {
        Arrays.stream(field)
                .map(Arrays::toString)
                .forEach(System.out::println);
    }

    public boolean checkForWinning(Mark[][] field) {
        if (!winCheckHorizontal(field) && !winCheckVertical(field)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean verticalCheck(int moveIndex) {
        return field[0][moveIndex] == EMPTY;
    }

    public boolean horizontalCheck() {
        boolean condition = false;
        int i = 0;
        while ((!condition) && (i < HORIZONTAL)) {
            if (field[0][i] == EMPTY) {
                condition = true;
            }
            i++;
        }
        return condition;
    }

    public boolean winCheckHorizontal(Mark[][] field) {
        String line = "";
        int i = VERTICAL - 1;
        while ((i >= 0) && (!lineCheck(line))) {
            line = "";
            for (int j = 0; j < HORIZONTAL; j++) {
                line = line + field[i][j].toString();
            }
            i--;
        }
        return lineCheck(line);
    }

    public boolean winCheckVertical(Mark[][] field) {
        String line = "";
        int i = 0;
        while ((i < HORIZONTAL) && (!lineCheck(line))) {
            line = "";
            for (int j = 0; j < VERTICAL; j++) {
                line = line + field[j][i].toString();
            }
            i++;
        }
        return lineCheck(line);
    }

    public boolean lineCheck(String line) {
        if (line.contains("XXXX")) {
            return true;
        } else if (line.contains("OOOO")) {
            return true;
        } else return false;
    }

    public Mark[][] getField() {
        return field;
    }
}
