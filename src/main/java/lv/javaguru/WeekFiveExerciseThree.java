package lv.javaguru;
import java.util.Random;
import java.util.Scanner;

public class WeekFiveExerciseThree {
    public static void main(String[] args) {
        Random random = new Random();
        int randRange = random.nextInt(100) + 1; // так правильно записано, что такое bound?
        Scanner scaner = new Scanner(System.in);

        System.out.println("Please guess number from 1 to 100:");
        Boolean whileOut = true;
        while(whileOut){
            int userGuess = Integer.valueOf(scaner.nextLine());
            if (userGuess == randRange){
                System.out.println("Lucky");
                whileOut = false;
            }else if(userGuess <randRange){
                System.out.println("Your number less. Please guess again.");
            }else if(userGuess > randRange){
                System.out.println("Your number more. Please guess again.");
            }
        }
        scaner.close();
    }
}
/*
Please guess number from 1 to 100:
20
Your number less. Please guess again.
80
Your number more. Please guess again.
74
Lucky

Process finished with exit code 0
 */