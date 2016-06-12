package vnfm.kata.primeFactors;

import java.util.stream.Stream;

public interface PrimeFactors
{
    default Stream<Integer> generate(int number)
    {
        return Stream.empty();
    }
}
