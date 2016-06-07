package vnfm.kata.primefactors.vish;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vish0416 on 06.06.2016.
 */

public class primeFactors
{
    public static List<Integer> generate(int n){
        List<Integer> primes = new ArrayList<Integer>();
        int candidate = 2;
        while (n > 1)
        {
            for (; n % candidate == 0; n/=candidate)
            {
                primes.add(candidate);
            }
            candidate++;
        }
        return primes;
    }
}

