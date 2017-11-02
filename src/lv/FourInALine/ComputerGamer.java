package lv.FourInALine;

import java.util.Random;

public class ComputerGamer extends GamerMove {
    public int setIndex(){
        Random rand = new Random();
        index = rand.nextInt(7);
        return index;
    }
}
