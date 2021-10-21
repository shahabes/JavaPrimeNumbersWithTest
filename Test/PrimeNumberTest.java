import es.shahab.PrimeNumber;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    @Test
    void lessThanEqualZeroPrimes(){
        assertNull(PrimeNumber.getPrimes(0));
    }

    @Test
    void lessThanEqualOnePrimes(){
        assertNull(PrimeNumber.getPrimes(1));
    }


    @Test
    void lessThanEqualTwoPrimes(){
        assertEquals(PrimeNumber.getPrimes(2), List.of(2));
    }


    @Test
    void checkForEvensInPrimes(){
        var evenNumbers = getEvenNumber(1000);
        assertFalse(Objects.requireNonNull(PrimeNumber.getPrimes(1000)).contains(evenNumbers));
    }

    private int getEvenNumber(int n){
        var evens = new ArrayList<Integer>();
        for (int i = 0; i <= n; i++){
            if(i % 2 == 0)
                evens.add(i);
        }

        var randIndex = 3 + (int)(Math.random() * ((evens.size() - 3) + 1));
        return evens.get(randIndex);
    }

}