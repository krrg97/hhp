package primeFactors;

import com.google.common.collect.Lists;
import junit.framework.TestCase;

import java.util.List;

import static primeFactors.PrimeFactors.generate;

public class PrimeFactorsTest extends TestCase
{

    public void testOne() throws Exception
    {
        assertEquals(list(), generate(1));
    }

    public void testTwo() throws Exception
    {
        assertEquals(list(2), generate(2));
    }

    private List<Integer> list(int... ints)
    {
        List<Integer> list = Lists.newArrayListWithCapacity(ints.length);
        for (int i : ints)
        {
            list.add(i);
        }
        return list;
    }

    public void testThree() throws Exception
    {
        assertEquals(list(3), generate(3));
    }

    public void testFour() throws Exception
    {
        assertEquals(list(2, 2), generate(4));
    }

    public void testSix() throws Exception {
        assertEquals(list(2,3),generate(6));
    }

    public void testEight() throws Exception {
        assertEquals(list(2,2,2),generate(8));
    }

    public void testNine() throws Exception {
        assertEquals(list(3,3),generate(9));
    }
}
