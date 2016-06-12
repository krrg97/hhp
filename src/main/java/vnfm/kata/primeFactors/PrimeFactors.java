package vnfm.kata.primeFactors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public interface PrimeFactors
{
    default Stream<Integer> generate(int number)
    {
        List<Integer> primes = new ArrayList<>();
        if (number > 1)
        {
            primes.add(2);
        }

        return primes.stream();
    }

}
