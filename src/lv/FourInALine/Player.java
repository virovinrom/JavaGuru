package lv.FourInALine;
import java.util.Arrays;
import static lv.FourInALine.GameRun.*;

public abstract class Player {

    protected String sign;
    private static boolean endOfMoves;
    private boolean winner = false;
    protected int moveIndex;

    public String[][] move(String[][] field ){
        for (int i = VERTICAL - 1; i >= 0; i--){
            if (field[i][getMove()].equals("_")){
                field[i][getMove()] = getSign();
                i = 0;
            } else if (!Arrays.toString(field[0]).contains("_")){
                setEndOfMoves(true);
            }
        }
        return field;
    }
    public int inputMove(Player gamer, Field field){
        gamer.moveIndex = -1;
        while (gamer.moveIndex < 0 || gamer.moveIndex > HORIZONTAL - 1){
            System.out.println("Please select your move player " + gamer.getSign() + ", from 0 to 6");
            if(!field.verticalCheck(gamer.setMove())){
                gamer.moveIndex = -1;
                System.out.println("Please choose another column.");
            }
            gamer.setEndOfMoves(!field.horizontalCheck());
        }
        return  gamer.moveIndex;
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
    public String setSign(String str){
        return this.sign = str;
    }
    public String getSign() {
        return this.sign;
    }
    public int getMove() {
        return this.moveIndex;
    }
    public abstract int setMove();
}
