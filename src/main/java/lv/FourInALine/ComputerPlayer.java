package lv.fourinaline;

import java.util.List;
import java.util.Random;

public class ComputerPlayer extends Player {
    @Override
    public int setMove(List<Integer> list) {
        Random rand = new Random();

        return list.get(rand.nextInt(list.size()));
    }

}
