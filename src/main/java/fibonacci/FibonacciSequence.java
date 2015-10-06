package fibonacci;

import generator.FibonacciGenerator;

import java.math.BigInteger;

public class FibonacciSequence {
    private static final int MAX_SEQUENCE_LENGTH = Integer.MAX_VALUE - 4;
    private FibonacciGenerator generator;
    private BigInteger[] sequence;

    public FibonacciSequence(int sequenceLength) {
        if (sequenceLength > MAX_SEQUENCE_LENGTH)
            throw new IllegalArgumentException("Sequence can't be longer then: " + MAX_SEQUENCE_LENGTH);
        sequence = new BigInteger[sequenceLength];
    }
    public void setGenerator(FibonacciGenerator generator) {
        this.generator = generator;
    }

    public void generateSequence() {
        for(int i = 0; i < sequence.length; i++) {
            sequence[i] = generator.getNumber(i);
        }
    }
}
