package lv.javaguru;
import java.util.Random;

public class WeekFiveExerciseFour {
    public static void main(String[] args) {
        System.out.println("Please intent number from 1 to 100:");

        // ВВод пользователя заменен на random
        int userNumber = guess();
        System.out.println("User number: " + userNumber);
        // ВВод пользователя заменен на random

        int myFirsGuess = guess();
        guessing(userNumber, myFirsGuess);
    }

    public static void guessing(int user, int machine){
        int one = 1;
        int hundred = 100;
        boolean t = true;
        int guessCount = 0;

        while (t){
            guessCount++;
            System.out.println("Guessing: " + machine);
            if(user == machine){
                t = false;
                System.out.println("Number: " + machine + ".");
                System.out.println("Guess counts: " + guessCount);
            }else if(machine < user){
                one = machine;
                machine = hundred - (hundred - machine) / 2;
            }else if (machine > user){
                hundred = machine;
                machine = one + (machine - one) / 2;
            }
        }
    }

    public static int guess(){
        Random random = new Random();
        int Number = random.nextInt(100) + 1;
        return Number;
    }
}

/*
Please intent number from 1 to 100:
User number: 64
Guessing: 36
Guessing: 68
Guessing: 52
Guessing: 60
Guessing: 64
Number: 64.
Guess counts: 5

Process finished with exit code 0
 */
