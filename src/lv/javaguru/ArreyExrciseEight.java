package lv.javaguru;
import java.util.Arrays;
import java.util.Random;

public class ArreyExrciseEight {
    public int countRow = 0, maxCountRow = 0, maxRow = 0;
    public int countColumn = 0, maxCountColumn = 0, maxColumn = 0;
    public static void main(String[] args) {
        ArreyExrciseEight a = new ArreyExrciseEight();
        int[][] arr = new int [4][10];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int ii = 0; ii < arr[i].length; ii++) {
              arr[i][ii] = random.nextInt(2) ;
           }
            System.out.println(Arrays.toString(arr[i]));
        }

        for (int i = 0; i < arr.length; i++) {
            a.countRow = 0;
            for (int ii = 0; ii < arr[i].length; ii++) {
                if (ii < arr[i].length - 1){
                    if (arr[i][ii] == arr[i][ii + 1]){
                        a.countRow++;
                        if (ii == arr[i].length - 2){
                            a.checkMaxRow(i);
                        }
                    }else{
                        a.checkMaxRow(i);
                        a.countRow = 0;
                    }
                }
                if (i == 0){
                    a.countColumn = 0;
                    for (int j = 0; j < arr.length - 1; j++){
                        if (arr[j][ii] == arr[j + 1][ii]){
                            a.countColumn++;
                            if (j == arr.length - 2){
                                a.checkMaxColumn(ii);
                            }
                        }else{
                            a.checkMaxColumn(ii);
                            a.countColumn = 0;
                        }
                    }
                }
            }
        }
        System.out.println("Max repetition in row Nr.: " + a.maxRow);
        System.out.println("Max repetition in column Nr.: " +  a.maxColumn);
    }

    public  void checkMaxRow(int i){
        if(countRow >= maxCountRow){
            maxCountRow = countRow;
            maxRow = i + 1;
        }
    }
    public  void checkMaxColumn(int ii){
        if(countColumn >= maxCountColumn){
            maxCountColumn = countColumn;
            maxColumn = ii + 1;
        }
    }

}
/*
[0, 0, 0, 1, 1, 0, 1, 0, 0, 0]
[1, 1, 0, 0, 1, 0, 1, 0, 0, 1]
[0, 0, 0, 0, 0, 0, 1, 1, 1, 0]
[1, 0, 0, 0, 1, 0, 0, 1, 0, 1]
Max repetition in row Nr.: 3
Max repetition in column Nr.: 6

Process finished with exit code 0
 */