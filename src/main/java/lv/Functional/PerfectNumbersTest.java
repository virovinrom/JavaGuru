package lv.Functional;
import org.junit.jupiter.api.Test;

//import org.junit.Before;
//import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerfectNumbersTest {

    private PerfectNumbers perfectNumbers;

    //@Before
/*    public void init() {
        perfectNumbers = new PerfectNumbers();
    }*/

    @Test
    public void divisorsOfSix() {
        List<Integer> divisors = perfectNumbers.calculateDivisors(6);
        assertEquals(Arrays.asList(1, 2, 3), divisors);
    }

    @Test
    public void divisorsOfTwelve() {
        List<Integer> divisors = perfectNumbers.calculateDivisors(12);
        assertEquals(Arrays.asList(1, 2, 3, 4, 6), divisors);
    }

    @Test
    public void divisorsOfSeven() {
        List<Integer> divisors = perfectNumbers.calculateDivisors(7);
        assertEquals(Arrays.asList(1), divisors);
    }

    @Test
    public void divisorsOfSevenSum() {
        int sum = perfectNumbers.calculateDivisorsSum(7);
        assertEquals(1, sum);
    }
}