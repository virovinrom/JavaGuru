package lv.fourinaline;

import java.util.List;

import static lv.fourinaline.GameRun.*;
import static lv.fourinaline.Mark.*;

public abstract class Player {

    protected Mark sign;

    protected int moveIndex;

    public void move(Player gamer, Field field) {
        System.out.println("Please select your move player " + gamer.getSign() + ", from 0 to 6");
        gamer.getMoveFromPlayer(field.getFreeIndex());
        for (int i = VERTICAL - 1; i >= 0; i--) {
            if (field.getField()[i][moveIndex] == EMPTY) {
                field.getField()[i][moveIndex] = getSign();
                i = 0;
            }
        }
    }


    public void setSign(Mark sign) {
        this.sign = sign;
    }

    public Mark getSign() {
        return this.sign;
    }

    public abstract int getMoveFromPlayer(List<Integer> list);
}
