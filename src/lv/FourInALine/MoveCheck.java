package lv.FourInALine;

import java.util.ArrayList;

public class MoveCheck {
    private String line = new String();
    public boolean check (ArrayList list){
        if (!winCheckHorizontal(list) || !winCheckVertical(list)) {
            return false;
        }else{return true;}
    }

    public boolean winCheckHorizontal(ArrayList list){
        for (int i = 5; i >= 0; i--){
            line = "";
            for (int j = 0; j < 7; j++){
                line = line + (((ArrayList)list.get(i)).get(j));
            }
            if (!lineCheck(line)) {i = 0;}
        }
        return lineCheck(line);
    }
    public boolean winCheckVertical(ArrayList list){
        for (int i = 0; i < 7; i++){
            line = "";
            for (int j = 0; j < 6; j++) {
                line = line + (((ArrayList)list.get(j)).get(i));
            }
            if (!lineCheck(line)) {i = 7;}
        }
        return lineCheck(line);
    }
    public boolean lineCheck(String line){
        if (line.contains("XXXX")){
            return false;
        }else if (line.contains("OOOO")){
            return false;
        }else return true;
    }
}
