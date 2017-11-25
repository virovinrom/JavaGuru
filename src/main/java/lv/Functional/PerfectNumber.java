package lv.Functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//https://habrahabr.ru/company/luxoft/blog/270383/
//Test2
public class PerfectNumber {
    //codingame.com
    public void perfect(){
        int perfectNumber = 100;
        //   List<Integer> list = new ArrayList<>();

        IntStream.range(1, perfectNumber / 2 + 1)
                // return IntStream.range(1, perfectNumber / 2 + 1)
                .boxed()
                .filter(a -> perfectNumber % a == 0)
                .collect(Collectors.toList());
        //.reduce (0, (a,b) -> a+b); strim zakrilsja posle reduce (reduce vozrosaet summu)

//        for (int i = 1; i <= perfectNumber / 2; i++){
//            if ((perfectNumber % i) == 0){
//              list.add(i);
//            }
//        }
    }


    // @Test
    public  void divivisorsOfSix(){
        //List<Integer> divisors = perfectNumber.perfect(12)
        //assertequals(Arrays.asList(0,1,2), divisors);
    }
    public void perfectFunction(){
        List<Integer> divisors = new ArrayList<>();

    }
}
