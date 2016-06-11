package kata.primefactors.zelark;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int n) {
        List<Integer> primes = new ArrayList<Integer>();

        int candidate = 2;
        while (n > 1) {
            while (n % candidate == 0) {
                primes.add(candidate);
                n /= candidate;
            }
            candidate++;
        }

        return primes;
    }
}
