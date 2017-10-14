package lv.javaguru;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr = arrBuilder(arr);
        int indexOut = -1, number;
        while (indexOut == -1) {
            number = userInput();
            indexOut = search(arr, number);
            if (indexOut != -1){
                System.out.println("Arrey index: " + indexOut);
            }
        }
    }
    private static int userInput() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Please enter number from 1 to 20:");
        int number = Integer.valueOf(scaner.nextLine());
        // почему при scaner.close(); выдает ошибку при indexOut == -1 во второй итерации while?
        return number;
    }

    private static int search(int[] arr, int number) {
        int index = -1;
        int bottom = 0, top = arr.length, guessInd, i = 0;
        boolean tr = true;
        while (tr) {
            i++;
            guessInd = (bottom + top) / 2;
            if (arr[guessInd] == number){
                tr = false;
                index = guessInd;
                System.out.println(i);
                return index;
            }else{
                if (number < arr[guessInd]) {
                    top = guessInd;
                }else{
                    bottom = guessInd + 1;
                }
            }
            if (top == bottom){
                System.out.println("Error, not such number.");
                tr = false;
            }
        }
        return index;
    }

    private static int[] arrBuilder(int[] arr){
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++)
            arr[i] = rand.nextInt(20) + 1;
        Arrays.sort(arr); //or reference to BubbleSort Class WeekSix.java
        System.out.println("Arrey: " + Arrays.toString(arr));
        return arr;
    }

}
/*
Arrey: [4, 6, 7, 8, 9, 10, 11, 11, 12, 13, 13, 14, 14, 15, 16, 17, 18, 18, 19, 19]
Please enter number from 1 to 20:
5
Error, not such number.
Please enter number from 1 to 20:
12
3
Arrey index: 8

Process finished with exit code 0
 */