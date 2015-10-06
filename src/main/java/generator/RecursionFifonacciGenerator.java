package generator;

import java.math.BigInteger;

public class RecursionFifonacciGenerator implements FibonacciGenerator {
    private BigInteger first;
    private BigInteger second;

    public RecursionFifonacciGenerator() {
        this(FibonacciConfiguration.ZERO_BASE);
    }

    public RecursionFifonacciGenerator(FibonacciConfiguration configuration) {
        if (configuration == FibonacciConfiguration.ZERO_BASE) {
            first = BigInteger.ZERO;
            second = BigInteger.ONE;
        } else {
            first = BigInteger.ONE;
            second = BigInteger.ONE;
        }
    }
    @Override
    public BigInteger getNumber(long number) {
        if (number == 0)
            return first;
        else if (number == 1)
            return second;
        else {
            return getNumber(number - 1).add(getNumber(number - 2));
        }
    }
}
