package lv.FourInALine;

import java.util.Arrays;

import static lv.FourInALine.GameRun.*;

public class Field {
    private String[][] field = new String[VERTICAL][HORIZONTAL];
    private String line = new String();
    public String[][] getField() {
        return field;
    }
    Field(){
        for (int i = 0; i < VERTICAL; i++) {
            for (int j = 0; j < HORIZONTAL; j++) {
                field[i][j] = "_";
            }
        }
    }
    public void printField(String[][] field){
        for (int i = 0; i < VERTICAL; i++) {
            System.out.println(Arrays.toString(field[i]));
        }
    }
    public boolean checkForWinning (String[][] field){
        if (!winCheckHorizontal(field) && !winCheckVertical(field)) {
            return false;
        }else{return true;}
    }
    public boolean verticalCheck(int moveIndex){
        return field[0][moveIndex].contains("_");
    }
    public boolean horizontalCheck(){
        return Arrays.toString(field[0]).contains("_");
    }
    public boolean winCheckHorizontal(String[][] field){
        for (int i = VERTICAL - 1; i >= 0; i--){
            line = "";
            for (int j = 0; j < HORIZONTAL; j++){
                line = line + field[i][j];
            }
            if (lineCheck(line)) {i = 0;}
        }
        return lineCheck(line);
    }
    public boolean winCheckVertical(String[][] field){
        for (int i = 0; i < HORIZONTAL; i++){
            line = "";
            for (int j = 0; j < VERTICAL ; j++) {
                line = line + field[j][i];
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
}
