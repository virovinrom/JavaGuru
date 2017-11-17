package lv.FourInALine;

import java.util.Arrays;

import static lv.FourInALine.GameRun.*;

public class Field {
    private Mark[][] field = new Mark[VERTICAL][HORIZONTAL];
    private String line;

    Field(){
        for (int i = 0; i < VERTICAL; i++) {
            for (int j = 0; j < HORIZONTAL; j++) {
                field[i][j] = Mark.EMPTY;
            }
        }
    }
    public void printField(Mark[][] field){
        for (int i = 0; i < VERTICAL; i++) {
            System.out.println(Arrays.toString(field[i]));
        }
    }
    public boolean checkForWinning (Mark[][] field){
        if (!winCheckHorizontal(field) && !winCheckVertical(field)) {
            return false;
        }else{return true;}
    }
    public boolean verticalCheck(int moveIndex){
        return field[0][moveIndex].equals(Mark.EMPTY);
    }
    public boolean horizontalCheck(){
        boolean condition = false;
        for (int i = 0; i < HORIZONTAL; i++){
            if (field[0][i].equals(Mark.EMPTY)){
                condition = field[0][i].equals(Mark.EMPTY);
                i = HORIZONTAL;
            }
        }
         return condition;
    }
    public boolean winCheckHorizontal(Mark[][] field){
        for (int i = VERTICAL - 1; i >= 0; i--){
            line = "";
            for (int j = 0; j < HORIZONTAL; j++){
                line = line + field[i][j].toString();
            }
            if (lineCheck(line)) {i = 0;}
        }
        return lineCheck(line);
    }
    public boolean winCheckVertical(Mark[][] field){
        for (int i = 0; i < HORIZONTAL; i++){
            line = "";
            for (int j = 0; j < VERTICAL ; j++) {
                line = line + field[j][i].toString();
            }
            if (lineCheck(line)) {i = HORIZONTAL;}
        }
        return lineCheck(line);
    }

    public boolean lineCheck(String line){
        if (line.contains("XXXX")){
            return true;
        }else if (line.contains("OOOO")){
            return true;
        }else return false;
    }
    public Mark[][] getField() {
        return field;
    }
}
