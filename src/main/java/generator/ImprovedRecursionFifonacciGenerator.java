package generator;

import java.math.BigInteger;

public class ImprovedRecursionFifonacciGenerator implements FibonacciGenerator {
    private BigInteger first;
    private BigInteger second;

    public ImprovedRecursionFifonacciGenerator() {
        this(FibonacciConfiguration.ZERO_BASE);
    }

    public ImprovedRecursionFifonacciGenerator(FibonacciConfiguration configuration) {
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
        return fibonacciAccumulator(second, first, number);
    }

    private BigInteger fibonacciAccumulator(BigInteger a, BigInteger b, long count) {
        if (count == 0) {
            return b;
        } else {
            return fibonacciAccumulator(a.add(b), a, count - 1);
        }
    }
}
