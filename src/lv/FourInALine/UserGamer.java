package lv.FourInALine;

import java.util.Scanner;

public class UserGamer extends GamerMove {
    public int setIndex(){
        Scanner scanner = new Scanner(System.in);
        index = Integer.valueOf(scanner.nextLine());
        return index;
    }
}
