package lv.FourInALine;
import java.util.ArrayList;

public abstract class GamerMove {

    protected String sign;
    private boolean theWinner = true;
    private boolean endOfMoves;
    protected int index;

    public ArrayList<ArrayList<String>> move(ArrayList list ){
        MoveCheck moveCheck = new MoveCheck();
        for (int i = 5; i >= 0; i--){
            if (((ArrayList)list.get(i)).get(getIndex()).equals("_")){
                ((ArrayList)list.get(i)).set(getIndex(), getSign());
                setTheWinner(moveCheck.check(list));
                i = 0;
            } else if  (!((ArrayList) list.get(0)).contains("_")){
                setEndOfMoves(true);
            }
        }
        return list;
    }
    public void setEndOfMoves(boolean endOfMoves) {
        this.endOfMoves = endOfMoves;
    }
    public boolean getEndOfMoves(){
        return endOfMoves;
    }
    public void printList(ArrayList list){
        for (int i = 0; i < 6; i++) {
            System.out.println(list.get(i));
        }
    }
    public String setSign(String str){
        return this.sign = str;
    }
    public String getSign() {
        return this.sign;
    }
    public  boolean setTheWinner(boolean winner){
        return this.theWinner = winner;
    }
    public  boolean getTheWinner(){
        return this.theWinner;
    }
    public int getIndex() {
        return this.index;
    }
    public abstract int setIndex();
}
