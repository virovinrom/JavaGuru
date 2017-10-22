package lv.javatestbook;

import java.io.IOException;
import java.util.Scanner;

public class GameHelper {
    public String getUserInput(String promt){
        String inputLine = null;
        Scanner scaner = new Scanner(System.in);

        try{
            inputLine = (scaner.nextLine());
            if (inputLine.length() == 0) return null;
        } catch (Exception e){
            System.out.println(e);
        }
        return inputLine;
    }

}
