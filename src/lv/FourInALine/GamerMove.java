package lv.FourInALine;
import java.util.ArrayList;

public abstract class GamerMove {
        String sign;
        boolean theWinner = true;
        boolean endOfMoves;
        int index;
        public ArrayList<ArrayList<String>> move(ArrayList list ){
            MoveCheck moveCheck = new MoveCheck();
            for (int i = 5; i >= 0; i--){
                if (((ArrayList)list.get(i)).get(index).equals("_")){
                    ((ArrayList)list.get(i)).set(index, sign);
                    setTheWinner(moveCheck.check(list));
                    i = 0;
                } else if  (!((ArrayList) list.get(0)).contains("_")){
                    endOfMoves = true;
                }
            }
            return list;
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
        return sign = str;
    }
    public  boolean setTheWinner(boolean winner){
        return theWinner = winner;
    }
    public  boolean getTheWinner(){
        return theWinner;
    }
    public abstract int setIndex();
}
