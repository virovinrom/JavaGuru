package lv.fourinaline;

public abstract class Player {

    protected Mark sign;

    protected int moveIndex;

    public void setSign(Mark sign) {
        this.sign = sign;
    }

    public Mark getSign() {
        return this.sign;
    }

    public abstract int getMoveFromPlayer(Field field);
}
