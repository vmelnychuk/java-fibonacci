package fibonacci;

import generator.FibonacciGenerator;

public class FibonacciSequence {
    private static final int MAX_SEQUENCE_LENGTH = 92;
    private FibonacciGenerator generator;
    private long[] sequence;

    public FibonacciSequence(int sequenceLength) {
        if (sequenceLength > MAX_SEQUENCE_LENGTH)
            throw new IllegalArgumentException("Sequence can't be longer then: " + MAX_SEQUENCE_LENGTH);
        sequence = new long[sequenceLength];
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
