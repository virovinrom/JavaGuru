package lv.FourInALine;

public class ParametersOut {
    ListCreate listCreate;
    GamerMove[] gamer = new GamerMove[2];

    public void start(){
        setParametersFromUser(getParametersFromUser());
        runGame();
        outputWinner();
    }
    public void runGame(){
        while (gamer[0].getTheWinner() && gamer[1].getTheWinner() && !gamer[1].getEndOfMoves()){
            for (int i = 0; i < 2; i++){
                if (gamer[i].getTheWinner()){
                    System.out.println("Please select your move player " + gamer[i].sign + ", from 0 to 6");
                    gamer[i].inputCheck();
                    gamer[i].move(listCreate.getListOfMoves());
                    gamer[i].printList(listCreate.getListOfMoves());
                }
            }
        }
    }
    public void outputWinner(){
        if (!gamer[0].getTheWinner()){
            System.out.println("The winner is the player with sign X");
        }else if (!gamer[1].getTheWinner()){
            System.out.println("The winner is the player with sign O");
        }else {
            System.out.println("Draw");
        }
    }
    public int getParametersFromUser(){
        int input = -1;
        UserGamer userGamer = new UserGamer();
        while (input < 0 || input > 2){
            System.out.println("Please select players count: ");
            System.out.println("Computer vs Computer, enter \"0\" ");
            System.out.println("One player vs Computer, enter \"1\" ");
            System.out.println("Two player, enter \"2\" ");
            System.out.println("......");
            input = userGamer.setIndex();
        }
        return input;
    }
    public void setParametersFromUser(int playerIndex){
        listCreate = new ListCreate();
        listCreate.listCreate();
        if (playerIndex == 0){
            gamer[0] = new ComputerGamer();
            gamer[1] = new ComputerGamer();
        }else if (playerIndex == 1){
            gamer[0] = new ComputerGamer();
            gamer[1] = new UserGamer();
        }else if (playerIndex == 2){
            gamer[0] = new UserGamer();
            gamer[1] = new UserGamer();
        }
        gamer[0].setSign("X");
        gamer[1].setSign("O");
    }
}
