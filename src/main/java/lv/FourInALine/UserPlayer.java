package lv.fourinaline;

import java.util.List;
import java.util.Scanner;

import java.util.stream.Stream;

public class UserPlayer extends Player {
    @Override
    public int getMoveFromPlayer(List<Integer> list) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        while (!check) {
            moveIndex = Integer.valueOf(scanner.nextLine());
            check = Stream.of(list)
                    .anyMatch(s -> s.contains(moveIndex));
            if (!check) {
                System.out.println("Please choose another column.");
            }
        }
        return moveIndex;
    }
}

