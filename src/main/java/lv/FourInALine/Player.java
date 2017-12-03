package lv.fourinaline;

import java.util.List;

import static lv.fourinaline.GameRun.*;
import static lv.fourinaline.Mark.*;

public abstract class Player {

    protected Mark sign;

    protected int moveIndex;

    public void move(Mark[][] field ){

        for (int i = VERTICAL - 1; i >= 0; i--){
            if (field[i][getMove()] == EMPTY){
                field[i][getMove()] = getSign();
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
    public int getMove() {
        return this.moveIndex;
    }
    public abstract int setMove(List<Integer> list );
}
