package lv.javaguru;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        boolean t = true;
        while (t){
            System.out.println("Insert number count:" );
            int compare = 0;
            int inputCount = Integer.valueOf(scaner.nextLine());
            if (inputCount != 0){
                for (int i = 0; i < inputCount; i++) {
                    int input = Integer.valueOf(scaner.nextLine());
                    if (compare < input){
                        compare = input;
                    }
                }
                System.out.println("Max number: " + compare);
                t = false;
            }else{
                System.out.println("Wrong input number");
            }
        }
    }
}
