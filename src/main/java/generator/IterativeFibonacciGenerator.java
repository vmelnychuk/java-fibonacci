package generator;

public class IterativeFibonacciGenerator implements FibonacciGenerator{
    private long first;
    private long second;

    public IterativeFibonacciGenerator() {
        this(FibonacciConfiguration.ZERO_BASE);
    }

    public IterativeFibonacciGenerator(FibonacciConfiguration configuration) {
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
        long result = 0;
        if (number == 0) result = first;
        else if (number == 1) result = second;
        else {
            long f0 = first;
            long f1 = second;
            for (int i = 1; i < number; i++) {
                result = f0 + f1;
                f0 = f1;
                f1 = result;
            }
        }
        return result;
    }
}
