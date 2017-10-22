package lv.javatestbook;

import java.util.ArrayList;

public class SimpleDotCom {

    private ArrayList<String> locationCells;
    public String checkYourselfe(String stringGuess){
        //int guess = Integer.parseInt((stringGuess));
        int index = locationCells.indexOf(stringGuess);
        String result = "Mimo";
        if (index >= 0){
            locationCells.remove(index);
            if (locationCells.isEmpty()){
                result = "Potopil";
            }else {
                result = "Popal";
            }
        }
        return result;
    }
    public void setLocationCells(ArrayList<String> locs){
        locationCells = locs;
    }
}
