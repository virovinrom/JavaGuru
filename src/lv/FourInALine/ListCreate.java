package lv.FourInALine;

import java.util.ArrayList;

public class ListCreate {
    private ArrayList<ArrayList<String>> listOfMoves = new ArrayList<>();
    public void listCreate(){
        for (int i = 0; i < 6; i++) {
            listOfMoves.add(new ArrayList<>());
            for (int j = 0; j < 7; j++) {
                listOfMoves.get(i).add("");
            }
        }
    }

    public ArrayList<ArrayList<String>> getListOfMoves() {
        return listOfMoves;
    }
}
