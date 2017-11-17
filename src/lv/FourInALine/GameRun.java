package lv.FourInALine;
import java.util.List;
import java.util.ArrayList;

public class GameRun {
    protected static final int HORIZONTAL   = 7;
    protected static final int VERTICAL   = 6;

    private Field field = new Field();
    private Player gamerOne;
    private Player gamerTwo;
    private List<Player> listGamer = new ArrayList<Player>();

    public void start(){
        getParametersFromUser("first");
        getParametersFromUser("second");
        field.printField(field.getField());
        setGamerOne(listGamer.get(0));
        setGamerTwo(listGamer.get(1));
        getGamerOne().setSign(Mark.X);
        getGamerTwo().setSign(Mark.O);

        while (!getGamerOne().getWinner() && !getGamerTwo().getWinner() && !getGamerTwo().getEndOfMoves()){
            runGame(getGamerOne());
            if (!getGamerOne().getWinner()){runGame(gamerTwo);}
        }
        outputWinner();
    }
    public void runGame(Player gamer){
        gamer.moveCheck(gamer, field);
        gamer.move(field.getField());
        gamer.setWinner(field.checkForWinning(field.getField()));
        field.printField(field.getField());
        gamer.setEndOfMoves(!field.horizontalCheck());
    }

    public void outputWinner(){
        if (getGamerOne().getWinner()){
            System.out.println("The winner is the player with sign X");
        }else if (getGamerTwo().getWinner()){
            System.out.println("The winner is the player with sign O");
        }else {
            System.out.println("Draw");
        }
    }
    public void getParametersFromUser(String playerNum){
        int input = -1;
        UserPlayer userGamer = new UserPlayer();
        while (input < 1 || input > 2){
            System.out.println("Please select " + playerNum + " player: (Computer: \"1\"/ Human: \"2\")");
            input = userGamer.setMove();
        }
        setParametersFromUser(input);
    }
    public void setParametersFromUser(int playerIndex){
        if(playerIndex == 1){
            listGamer.add(new ComputerPlayer());
        }else {
            listGamer.add(new UserPlayer());
        }
    }

    public void setGamerOne(Player player){
        this.gamerOne = player;
    }
    public void setGamerTwo(Player player){
        this.gamerTwo = player;
    }
    public Player getGamerOne(){
        return this.gamerOne;
    }
    public Player getGamerTwo(){
        return this.gamerTwo;
    }
}
