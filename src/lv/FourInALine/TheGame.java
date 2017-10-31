package lv.FourInALine;

public class TheGame {
    ListCreate listCreate = new ListCreate();
    GamerMove gamerOne = new ComputerGamer();
    GamerMove gamerTwo = new ComputerGamer();

    public void start(){
        setParameters();
        runGame();
        outputWinner();
    }

    public void runGame(){
        while (gamerOne.getTheWinner() && gamerTwo.getTheWinner() && !gamerTwo.getEndOfMoves()){
            System.out.println(gamerOne.sign + " move: ");
            gamerOne.setIndex();
            gamerOne.move(listCreate.getListOfMoves());
            gamerOne.printList(listCreate.getListOfMoves());
            if(gamerOne.getTheWinner()){
                System.out.println(gamerTwo.sign + " move: ");
                gamerTwo.setIndex();
                gamerTwo.move(listCreate.getListOfMoves());
                gamerTwo.printList(listCreate.getListOfMoves());
            }
        }
    }
    public void outputWinner(){
        if (!gamerOne.getTheWinner()){
            System.out.println("The winner is the player X");
        }else if (!gamerTwo.getTheWinner()){
            System.out.println("The winner is the player O");
        }else {
            System.out.println("Draw");
        }
    }
    public void setParameters(){
        listCreate.listCreate();
        gamerOne.setSign("X");
        gamerTwo.setSign("O");
    }
}
