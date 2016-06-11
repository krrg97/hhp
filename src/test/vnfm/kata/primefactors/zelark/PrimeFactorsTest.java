package kata.primefactors.zelark;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static kata.primefactors.zelark.PrimeFactors.generate;

public class PrimeFactorsTest {
    public List<Integer> list(int... integers) {
        List<Integer> list = new ArrayList<Integer>();
        for (int integer : integers) {
            list.add(integer);
        }
        return list;
    }

    @Test
    public void testOne() {
        assertEquals(list(), generate(1));
    }

    @Test
    public void testTwo() {
        assertEquals(list(2), generate(2));
    }

    @Test
    public void testThree() {
        assertEquals(list(3), generate(3));
    }

    @Test
    public void testFour() {
        assertEquals(list(2, 2), generate(4));
    }

    @Test
    public void testSix() {
        assertEquals(list(2, 3), generate(6));
    }

    @Test
    public void testEight() {
        assertEquals(list(2, 2, 2), generate(8));
    }

    @Test
    public void testNine() {
        assertEquals(list(3, 3), generate(9));
    }

    @Test
    public void tesTen() {
        assertEquals(list(2, 3, 7), generate(42));
    }
}
