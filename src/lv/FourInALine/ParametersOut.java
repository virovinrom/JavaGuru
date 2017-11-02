package lv.FourInALine;

public class ParametersOut {
    ListCreate listCreate;
    GamerMove gamerOne;
    GamerMove gamerTwo;

    public void start(){
        setParametersFromUser(getParametersFromUser());
        runGame();
        outputWinner();
    }
    public void runGame(){
        while (gamerOne.getTheWinner() && gamerTwo.getTheWinner() && !gamerTwo.getEndOfMoves()){
            System.out.println("Please select your move player " + gamerOne.sign + ", from 0 to 6");
            gamerOne.inputCheck();
            gamerOne.move(listCreate.getListOfMoves());
            gamerOne.printList(listCreate.getListOfMoves());
            if(gamerOne.getTheWinner()){
                System.out.println("Please select your move player " + gamerTwo.sign + ", from 0 to 6");
                gamerTwo.inputCheck();
                gamerTwo.move(listCreate.getListOfMoves());
                gamerTwo.printList(listCreate.getListOfMoves());
            }
        }
    }
    public void outputWinner(){
        if (!gamerOne.getTheWinner()){
            System.out.println("The winner is the player with sign X");
        }else if (!gamerTwo.getTheWinner()){
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
            gamerOne = new ComputerGamer();
            gamerTwo = new ComputerGamer();
        }else if (playerIndex == 1){
            gamerOne = new ComputerGamer();
            gamerTwo = new UserGamer();
        }else if (playerIndex == 2){
            gamerOne = new UserGamer();
            gamerTwo = new UserGamer();
        }
        gamerOne.setSign("X");
        gamerTwo.setSign("O");
    }
}
