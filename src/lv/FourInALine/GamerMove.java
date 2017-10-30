package lv.FourInALine;
import java.util.ArrayList;
import java.util.Random;

public abstract class GamerMove {
    String sign;
    boolean theWinner;
    boolean print;
    public ArrayList<ArrayList<String>> move(ArrayList list ){
        Random rand = new Random();
        int index = rand.nextInt(6);
        for (int i = 5; i >= 0; i--){
            if (((ArrayList)list.get(i)).get(index).equals("")){
                ((ArrayList)list.get(i)).set(index, sign);
                theWinner = winCheck(list);
                i = 0;
            }
        }
        MovesPrint pr = new MovesPrint();
        pr.printList(list);
        return list;
    }

    public boolean winCheck(ArrayList list){
        String line = new String();
        StringBuilder sb = new StringBuilder();
        for (int i = 5; i >= 0; i--){
            for (int j = 0; j < 7; j++){
                line = line + (((ArrayList)list.get(i)).get(j));
            }
            if (!lineCheck(line)) {i = -1;}
        }
        return lineCheck(line);
    }
    public boolean lineCheck(String line){
        if (line.contains("XXXX")){
            return false;
        }else if (line.contains("OOOO")){
            return false;
        }else return true;
    }

    public abstract String gamerSign(String str);
    public abstract boolean theWinner();


}
