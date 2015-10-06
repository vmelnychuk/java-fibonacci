package generator;

import java.math.BigInteger;

public class IterativeFibonacciGenerator implements FibonacciGenerator{
    private BigInteger first;
    private BigInteger second;

    public IterativeFibonacciGenerator() {
        this(FibonacciConfiguration.ZERO_BASE);
    }

    public IterativeFibonacciGenerator(FibonacciConfiguration configuration) {
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
        BigInteger result = BigInteger.ZERO;
        if (number == 0) result = first;
        else if (number == 1) result = second;
        else {
            BigInteger f0 = first;
            BigInteger f1 = second;
            for (int i = 1; i < number; i++) {
                result = f0.add(f1);
                f0 = f1;
                f1 = result;
            }
        }
        return result;
    }
}
