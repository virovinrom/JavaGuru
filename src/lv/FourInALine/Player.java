package lv.FourInALine;
import static lv.FourInALine.GameRun.*;

public abstract class Player {

    protected Mark sign;

    private static boolean endOfMoves;
    private boolean winner = false;
    protected int moveIndex;

    public void move(Mark[][] field ){
        for (int i = VERTICAL - 1; i >= 0; i--){
            if (field[i][getMove()].equals(Mark.EMPTY)){
                field[i][getMove()] = getSign();
                i = 0;
            }
        }
    }

    public void moveCheck(Player gamer, Field field){
        gamer.moveIndex = -1;
        while (gamer.getMove() < 0 || gamer.getMove() > HORIZONTAL - 1 ){
            System.out.println("Please select your move player " + gamer.getSign() + ", from 0 to 6");
            try {
                if (!field.verticalCheck(gamer.setMove())) {
                    gamer.moveIndex = -1;
                    System.out.println("Please choose another column.");
                }
            }catch(ArrayIndexOutOfBoundsException exception) {
                gamer.moveIndex = -1;
                System.out.println("Wrong column index.");
            }
        }
    }
    public void setEndOfMoves(boolean endOfMoves) {
        this.endOfMoves = endOfMoves;
    }
    public void setWinner(boolean winner) {
        this.winner = winner;
    }
    public boolean getWinner() {
        return winner;
    }
    public boolean getEndOfMoves(){
        return endOfMoves;
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
    public abstract int setMove();
}

