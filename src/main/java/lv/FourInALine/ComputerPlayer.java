package lv.fourinaline;

import java.util.List;
import java.util.Random;

public class ComputerPlayer extends Player {
    @Override
    public int getMoveFromPlayer(Field field) {
        List<Integer> list = field.getFreeIndex();
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }

}
