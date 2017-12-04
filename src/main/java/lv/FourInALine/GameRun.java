package lv.fourinaline;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import static lv.fourinaline.Mark.*;

public class GameRun {
    protected static final int HORIZONTAL = 7;
    protected static final int VERTICAL = 6;

    private Field field = new Field();
    private Player gamerOne;
    private Player gamerTwo;
    private List<Player> listGamer = new ArrayList<>();


    public void start() {
        getParametersFromUser("first");
        getParametersFromUser("second");
        field.printField(field.getField());
        setGamerOne(listGamer.get(0));
        setGamerTwo(listGamer.get(1));
        getGamerOne().setSign(X);
        getGamerTwo().setSign(O);

        playerIteration();
        outputWinner();
    }

    public void playerIteration() {
        Player currentPlayer;
        while (field.getWinner() == null && !field.getDraw()) {
            currentPlayer = getGamerOne();
            runGame(currentPlayer);
            if (field.getWinner() == null) {
                currentPlayer = getGamerTwo();
                runGame(currentPlayer);
            }
        }
    }

    public void runGame(Player gamer) {
        gamer.move(gamer, field);
        field.checkForWinning(gamer);
        field.printField(field.getField());
        field.setDraw(!field.drawCheck());
    }

    public void outputWinner() {
        if (field.getDraw()){
            System.out.println("Draw");
        }else if (field.getWinner().equals(getGamerOne())) {
            System.out.println("The winner is the player with sign X");
        } else if (field.getWinner().equals(getGamerTwo())) {
            System.out.println("The winner is the player with sign O");
        }
    }

    public void getParametersFromUser(String playerNum) {
        int input = -1;
        while (input < 1 || input > 2) {
            System.out.println("Please select " + playerNum + " player: (Computer: \"1\"/ Human: \"2\")");
            Scanner scanner = new Scanner(System.in);
            input = Integer.valueOf(scanner.nextLine());
        }
        setParametersFromUser(input);
    }

    public void setParametersFromUser(int playerIndex) {
        if (playerIndex == 1) {
            listGamer.add(new ComputerPlayer());
        } else {
            listGamer.add(new UserPlayer());
        }
    }

    public void setGamerOne(Player player) {
        this.gamerOne = player;
    }

    public void setGamerTwo(Player player) {
        this.gamerTwo = player;
    }

    public Player getGamerOne() {
        return this.gamerOne;
    }

    public Player getGamerTwo() {
        return this.gamerTwo;
    }
}
