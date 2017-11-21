package lv.fourinaline;

public class StartGameMain {
    public static void main(String[] args) {
        GameRun game = new GameRun();
        game.start();
    }
}

//Player vs PC
/*
Please select players count:
Computer vs Computer, enter "0"
One player vs Computer, enter "1"
Two player, enter "2"
......
1
Please select your move player X
crf;tv
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, X]
Please select your move player O
0
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[O, _, _, _, _, _, X]
Please select your move player X
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[O, _, X, _, _, _, X]
Please select your move player O
0
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[O, _, _, _, _, _, _]
[O, _, X, _, _, _, X]
Please select your move player X
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[O, _, X, _, _, _, _]
[O, _, X, _, _, _, X]
Please select your move player O
0
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[O, _, _, _, _, _, _]
[O, _, X, _, _, _, _]
[O, _, X, _, _, _, X]
Please select your move player X
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[O, _, _, _, _, _, _]
[O, _, X, _, _, _, X]
[O, _, X, _, _, _, X]
Please select your move player O
4
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[O, _, _, _, _, _, _]
[O, _, X, _, _, _, X]
[O, _, X, _, O, _, X]
Please select your move player X
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[O, _, _, _, _, _, _]
[O, _, X, _, X, _, X]
[O, _, X, _, O, _, X]
Please select your move player O
1
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[O, _, _, _, _, _, _]
[O, _, X, _, X, _, X]
[O, O, X, _, O, _, X]
Please select your move player X
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[O, _, X, _, _, _, _]
[O, _, X, _, X, _, X]
[O, O, X, _, O, _, X]
Please select your move player O
0
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[O, _, _, _, _, _, _]
[O, _, X, _, _, _, _]
[O, _, X, _, X, _, X]
[O, O, X, _, O, _, X]
The winner is the player with sign O

Process finished with exit code 0
 */

//PC vs PC
/*
Please select players count:
Computer vs Computer, enter "0"
One player vs Computer, enter "1"
Two player, enter "2"
......
0
Please select your move player X
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, X, _, _, _, _, _]
Please select your move player O
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, X, _, _, _, O, _]
Please select your move player X
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, X, _, X, _, O, _]
Please select your move player O
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, X, _, X, O, O, _]
Please select your move player X
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, X, _]
[_, X, _, X, O, O, _]
Please select your move player O
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, O, X, _]
[_, X, _, X, O, O, _]
Please select your move player X
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, X, _, _, O, X, _]
[_, X, _, X, O, O, _]
Please select your move player O
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, X, _, _, O, X, _]
[O, X, _, X, O, O, _]
Please select your move player X
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[X, X, _, _, O, X, _]
[O, X, _, X, O, O, _]
Please select your move player O
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[X, X, _, _, O, X, _]
[O, X, _, X, O, O, O]
Please select your move player X
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[X, _, _, _, _, _, _]
[X, X, _, _, O, X, _]
[O, X, _, X, O, O, O]
Please select your move player O
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[X, _, _, _, _, O, _]
[X, X, _, _, O, X, _]
[O, X, _, X, O, O, O]
Please select your move player X
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, X, _]
[X, _, _, _, _, O, _]
[X, X, _, _, O, X, _]
[O, X, _, X, O, O, O]
Please select your move player O
[_, _, _, _, _, _, _]
[_, _, _, _, _, _, _]
[_, _, _, _, _, X, _]
[X, _, _, _, _, O, _]
[X, X, _, _, O, X, _]
[O, X, O, X, O, O, O]
Please select your move player X
[_, _, _, _, _, _, _]
[_, _, _, _, _, X, _]
[_, _, _, _, _, X, _]
[X, _, _, _, _, O, _]
[X, X, _, _, O, X, _]
[O, X, O, X, O, O, O]
Please select your move player O
[_, _, _, _, _, _, _]
[_, _, _, _, _, X, _]
[_, _, _, _, _, X, _]
[X, O, _, _, _, O, _]
[X, X, _, _, O, X, _]
[O, X, O, X, O, O, O]
Please select your move player X
[_, _, _, _, _, _, _]
[_, _, _, _, _, X, _]
[_, _, _, _, _, X, _]
[X, O, _, _, _, O, _]
[X, X, _, _, O, X, X]
[O, X, O, X, O, O, O]
Please select your move player O
[_, _, _, _, _, _, _]
[_, _, _, _, _, X, _]
[O, _, _, _, _, X, _]
[X, O, _, _, _, O, _]
[X, X, _, _, O, X, X]
[O, X, O, X, O, O, O]
Please select your move player X
[_, _, _, _, _, _, _]
[_, _, _, _, _, X, _]
[O, _, _, _, _, X, _]
[X, O, _, _, _, O, _]
[X, X, X, _, O, X, X]
[O, X, O, X, O, O, O]
Please select your move player O
[_, _, _, _, _, O, _]
[_, _, _, _, _, X, _]
[O, _, _, _, _, X, _]
[X, O, _, _, _, O, _]
[X, X, X, _, O, X, X]
[O, X, O, X, O, O, O]
Please select your move player X
[_, _, _, _, _, O, _]
[_, _, _, _, _, X, _]
[O, X, _, _, _, X, _]
[X, O, _, _, _, O, _]
[X, X, X, _, O, X, X]
[O, X, O, X, O, O, O]
Please select your move player O
[_, _, _, _, _, O, _]
[_, _, _, _, _, X, _]
[O, X, _, _, _, X, _]
[X, O, _, _, _, O, _]
[X, X, X, _, O, X, X]
[O, X, O, X, O, O, O]
Please select your move player X
[_, _, _, _, _, O, _]
[_, _, _, _, _, X, _]
[O, X, _, _, _, X, _]
[X, O, X, _, _, O, _]
[X, X, X, _, O, X, X]
[O, X, O, X, O, O, O]
Please select your move player O
[_, _, _, _, _, O, _]
[_, _, _, _, _, X, _]
[O, X, _, _, _, X, _]
[X, O, X, _, _, O, O]
[X, X, X, _, O, X, X]
[O, X, O, X, O, O, O]
Please select your move player X
[_, _, _, _, _, O, _]
[_, _, _, _, _, X, _]
[O, X, _, _, _, X, _]
[X, O, X, _, _, O, O]
[X, X, X, X, O, X, X]
[O, X, O, X, O, O, O]
The winner is the player with sign X

Process finished with exit code 0
 */