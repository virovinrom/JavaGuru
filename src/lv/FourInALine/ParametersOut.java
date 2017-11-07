package lv.FourInALine;

import java.util.ArrayList;
import java.util.List;

public class ParametersOut {
    ListCreate listCreate;
    List<GamerMove> gamer = new ArrayList<>();
    public void start(){
        String[] playerNum = {"first", "second"};
        for (int i = 0; i < 2; i++){
            getParametersFromUser(playerNum[i]);
        }
        listCreate = new ListCreate();
        listCreate.listCreate();
        gamer.get(0).setSign("X");
        gamer.get(1).setSign("O");
        runGame();
        outputWinner();
    }
    public void runGame(){
        while (gamer.get(0).getTheWinner() && gamer.get(1).getTheWinner() && !gamer.get(1).getEndOfMoves()){
            for (int i = 0; i < 2; i++){
                if (gamer.get(i).getTheWinner()){
                    gamer.get(i).inputCheck();
                    gamer.get(i).move(listCreate.getListOfMoves());
                    gamer.get(i).printList(listCreate.getListOfMoves());
                }
            }
        }
    }
    public void outputWinner(){
        if (!gamer.get(0).getTheWinner()){
            System.out.println("The winner is the player with sign X");
        }else if (!gamer.get(1).getTheWinner()){
            System.out.println("The winner is the player with sign O");
        }else {
            System.out.println("Draw");
        }
    }
    public void getParametersFromUser(String playerNum){
        int input = -1;
        UserGamer userGamer = new UserGamer();
        while (input < 1 || input > 2){
            System.out.println("Please select " + playerNum + " player: (Computer: \"1\"/ Human: \"2\")");
            input = userGamer.setIndex();
        }
        setParametersFromUser(input);
    }
    public void setParametersFromUser(int playerIndex){
        if(playerIndex == 1){
            gamer.add(new ComputerGamer());
        }else {
            gamer.add(new UserGamer());
        }
    }
}
