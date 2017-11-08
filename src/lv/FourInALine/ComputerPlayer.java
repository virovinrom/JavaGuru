package lv.FourInALine;

import java.util.Random;

public class ComputerPlayer extends Player {
    @Override
    public int setMove(){
        Random rand = new Random();
        moveIndex = rand.nextInt(7);
        return moveIndex;
    }

}
