package test.kata.primeFactors;

import org.junit.Test;
import vnfm.kata.primeFactors.PrimeFactors;

import java.util.Iterator;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;


public class PrimeFactorsTest
{
    private Stream<Integer> list()
    {
        return Stream.empty();
    }

    @Test
    public void testOne()
    {
        assertStreamEquals(list(), new EmptyPrimeFactors().generate(1));
    }

    private static class EmptyPrimeFactors implements PrimeFactors
    {

    }

    static void assertStreamEquals(Stream<?> s1, Stream<?> s2)
    {
        Iterator<?> iter1 = s1.iterator(), iter2 = s2.iterator();
        while (iter1.hasNext() && iter2.hasNext())
        {
            assertEquals(iter1.next(), iter2.next());
        }
        assert !iter1.hasNext() && !iter2.hasNext();
    }
}
