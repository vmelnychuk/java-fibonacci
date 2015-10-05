package generator;

public class RecursionFifonacciGenerator implements FibonacciGenerator {
    private long first;
    private long second;

    public RecursionFifonacciGenerator() {
        this(FibonacciConfiguration.ZERO_BASE);
    }

    public RecursionFifonacciGenerator(FibonacciConfiguration configuration) {
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
        if (number == 0)
            return first;
        else if (number == 1)
            return second;
        else {
            return getNumber(number - 1) + getNumber(number - 2);
        }
    }
}
