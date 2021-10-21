package es.shahab;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static List<Integer> getPrimes(int n){
        if(n < 2)
            return null;

        var primes = new ArrayList<Integer>();

        for(int i = 2; i <= n; i++){
            if(i > 2 && i % 2 == 0)
                continue;

            var isPrime = true;

            for(int j = 2; j <= i / 2; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                primes.add(i);
        }

        return primes;
    }
}
