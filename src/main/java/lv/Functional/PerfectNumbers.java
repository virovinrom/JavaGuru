package lv.Functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PerfectNumbers {
    public List<Integer> calculateDivisors(int number) {
        return IntStream.range(1, number / 2 + 1)
                .boxed()
                .filter(a -> number % a == 0)
                .collect(Collectors.toList());
    }

    public Integer calculateDivisorsSum(int number) {
        return IntStream.range(1, number / 2 + 1)
                .boxed()
                .filter(a -> number % a == 0)
                .reduce(0, (a, b) -> a + b);
    }

    public List<Integer> calculateDivisorsOld(int number) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }
}
