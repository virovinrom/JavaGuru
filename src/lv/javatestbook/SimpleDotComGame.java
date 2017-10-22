package lv.javatestbook;

import java.util.ArrayList;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int random = (int)(Math.random() * 5);
        ArrayList<String> locations = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            locations.add(String.valueOf(random + i));
        }
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive){
            String guess = helper.getUserInput("Vvedite 4islo");
            String result = theDotCom.checkYourselfe(guess);
            numOfGuesses++;
            System.out.println(result);
            if (result.equals("Potopil")){
                isAlive = false;
                System.out.println("Vam potrebovalosj " + numOfGuesses + " popitok");
            }
        }
    }
}
