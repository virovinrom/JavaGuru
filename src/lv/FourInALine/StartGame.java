package lv.FourInALine;


public class StartGame {
    public static void main(String[] args) {
        ListCreate listCreate = new ListCreate();
        listCreate.listCreate();

        GamerMove gamerOne = new Gamer();
        GamerMove gamerTwo = new Gamer();
        gamerOne.gamerSign("X");
        gamerTwo.gamerSign("O");

        System.out.println(gamerOne.sign + " move: ");
        gamerOne.move(listCreate.getListOfMoves());
        System.out.println(gamerTwo.sign + " move: ");
        gamerTwo.move(listCreate.getListOfMoves());
        System.out.println(gamerOne.theWinner());
    }
}
