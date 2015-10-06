package fibonacci;

import generator.FibonacciGenerator;
import generator.ImprovedRecursionFifonacciGenerator;
import generator.IterativeFibonacciGenerator;
import generator.RecursionFifonacciGenerator;

public class FibonacciSequenceFactory {
    private FibonacciSequence sequence;
    public FibonacciSequence getSequence(int sequenceLength, FibonacciGeneratorType type) {
        sequence = new FibonacciSequence(sequenceLength);
        if (type == FibonacciGeneratorType.RUCURSION) {
            sequence.setGenerator(new RecursionFifonacciGenerator());
        } else if (type == FibonacciGeneratorType.IMPROVED_RECURSION) {
            sequence.setGenerator(new ImprovedRecursionFifonacciGenerator());
        } else {
            sequence.setGenerator(new IterativeFibonacciGenerator());
        }
        sequence.generateSequence();
        return sequence;
    }
}
