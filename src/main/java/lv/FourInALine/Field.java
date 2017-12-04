package lv.fourinaline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static lv.fourinaline.GameRun.*;
import static lv.fourinaline.Mark.*;

public class Field {
    private Mark[][] field = new Mark[VERTICAL][HORIZONTAL];
    private boolean draw;
    private Player winner;

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

    public void checkForWinning(Player player) {
        if (winCheckHorizontal() || winCheckVertical()) {
            setWinner(player);
        }
    }

    public List<Integer> getFreeIndex() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < field[0].length; i++) {
            if (field[0][i].equals(EMPTY)) {
                list.add(i);
            }
        }
        return list;
    }

    public boolean drawCheck() {
        List<Mark> list = Arrays.asList(field[0]);
        return Stream.of(list)
                .anyMatch(s -> s.contains(EMPTY));
    }

    public boolean winCheckHorizontal() {
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

    public boolean winCheckVertical() {
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
        if (line.contains("XXXX") || line.contains("OOOO")) {
            return true;
        } else return false;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Mark[][] getField() {
        return field;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }

    public boolean getDraw() {
        return draw;
    }
}
