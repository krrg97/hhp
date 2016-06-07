package vnfm.kata.primefactors.vish;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by vish0416 on 06.06.2016.
 */

@RunWith(JUnit4.class)
public class primeFactorsTest
{
    private List<Integer> list(int... ints)
    {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : ints)
            list.add(i);
        return list;

    }
    @Test
    public void testOne() throws Exception
    {
        Assert.assertEquals(list(), primeFactors.generate(1));
    }

    @Test
    public void testTwo() throws Exception
    {
        Assert.assertEquals(list(2), primeFactors.generate(2));
    }

    @Test
    public void testThree() throws Exception
    {
        Assert.assertEquals(list(3), primeFactors.generate(3));
    }

    @Test
    public void testFour() throws Exception
    {
        Assert.assertEquals(list(2,2), primeFactors.generate(4));
    }

    @Test
    public void testSix() throws Exception
    {
        Assert.assertEquals(list(2,3), primeFactors.generate(6));
    }

    @Test
    public void testEight() throws Exception
    {
        Assert.assertEquals(list(2,2,2), primeFactors.generate(8));
    }

    @Test
    public void testNine() throws Exception
    {
        Assert.assertEquals(list(3,3), primeFactors.generate(9));
    }
}