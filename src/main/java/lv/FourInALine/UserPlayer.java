package lv.fourinaline;

import java.util.List;
import java.util.Scanner;

import java.util.stream.Stream;

public class UserPlayer extends Player {
    @Override
    public int getMoveFromPlayer(Field field) {
        List<Integer> list = field.getFreeIndex();
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        while (!check) {
            try {
                moveIndex = Integer.valueOf(scanner.nextLine());
                check = field.cheaterCheck(moveIndex);
                if (!check) {
                    System.out.println("Please choose another column.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please choose column");
            }
        }
        return moveIndex;
    }
}

