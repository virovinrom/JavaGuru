package lv.javaguru;

import java.util.Random;

public class WeekSix {
    public static void main(String[] args) {
        int[] arr = new int[10];

        // Первое задание
        arr = excerciseOne();
        // Третье задание
        excerciseThree(arr);
        // Пятое задание
        excerciseFive(arr);
        // Шестое задание BubbleSort
        excerciseSixBubbleSort(arr);
    }


    public static int[] excerciseOne(){
        int[] arr;
        Random random = new Random();
        arr = new int[10];
        for (int i = 0; i < 10; i++){
            arr[i] = random.nextInt(10) + 1;
            System.out.println(arr[i]);
        }
        return arr;
    }
    /*
7
10
10
2
6
5
10
3
9
9

     */
    public static void excerciseThree(int[] arr){
        int evenCount = 0;
        int unEvenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2 == 0) && (arr[i] != 0)){
                evenCount++;
            }
            unEvenCount = arr.length - evenCount;
        }
        System.out.println("UnEvent numbers count: " + unEvenCount);
        System.out.println("Event numbers count: " + evenCount);
    }
/*
UnEvent numbers count: 5
Event numbers count: 5

 */
    public static void excerciseFive(int[] arr){
        int maxElmIndex = 0;
        int maxElm = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                maxElmIndex = i + 1;
            }
        }
        arr[0] = arr[maxElmIndex];
        arr[maxElmIndex] = maxElm;
    }

    public static void excerciseSixBubbleSort(int[] arr){
        int a = 0;
        for (int i = 0; i < arr.length; i++){
            for (int ii = 1; ii < (arr.length - i); ii++){
                if (arr[ii - 1] > arr[ii]) {
                    a = arr[ii - 1];
                    arr[ii - 1] = arr[ii];
                    arr[ii] = a;

                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
/*
2
3
5
6
7
9
9
10
10
10

Process finished with exit code 0
 */



