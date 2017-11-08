package lv.FourInALine;

import java.util.Scanner;

public class UserPlayer extends Player {
    @Override
    public int setMove(){
        Scanner scanner = new Scanner(System.in);
        moveIndex = Integer.valueOf(scanner.nextLine());
        return moveIndex;
    }
}
