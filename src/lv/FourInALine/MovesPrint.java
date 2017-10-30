package lv.FourInALine;

import java.util.ArrayList;

public class MovesPrint{
    public boolean printList(ArrayList list){
        for (int i = 0; i < 6; i++) {
            System.out.println(list.get(i));
        }
        return true;
    }
}
