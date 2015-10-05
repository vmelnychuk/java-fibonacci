package generator;

public class ImprovedRecursionFifonacciGenerator implements FibonacciGenerator {
    private long first;
    private long second;

    public ImprovedRecursionFifonacciGenerator() {
        this(FibonacciConfiguration.ZERO_BASE);
    }

    public ImprovedRecursionFifonacciGenerator(FibonacciConfiguration configuration) {
        if (configuration == FibonacciConfiguration.ZERO_BASE) {
            first = 0;
            second = 1;
        } else {
            first = 1;
            second = 1;
        }
    }
    @Override
    public long getNumber(int number) {
        return fibonacciAccumulator(second, first, number);
    }

    private long fibonacciAccumulator(long a, long b, int count) {
        if (count == 0) {
            return b;
        } else {
            return fibonacciAccumulator(a + b, a, count - 1);
        }
    }
}
