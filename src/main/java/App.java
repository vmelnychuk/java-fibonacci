import fibonacci.FibonacciGeneratorType;
import fibonacci.FibonacciSequence;
import fibonacci.FibonacciSequenceFactory;
import utils.StopWatch;

public class App {
    public static void main(String[] args) {
        int length = 10000;
        StopWatch timer = new StopWatch();

        FibonacciSequenceFactory sequenceFactory = new FibonacciSequenceFactory();

        timer.start();
        FibonacciSequence sequenceWithIterativeGenerator =
                sequenceFactory.getSequence(length, FibonacciGeneratorType.ITERATIVE);
        System.out.println(timer.stop() + " : iterative");

//        timer.start();
//        FibonacciSequence sequenceWithRecursiveGenerator =
//                sequenceFactory.getSequence(length, FibonacciGeneratorType.RECURSION);
//        System.out.println(timer.stop() + " : recursive");

        timer.start();
        FibonacciSequence sequenceWithImprovedRecursiveGenerator =
                sequenceFactory.getSequence(length, FibonacciGeneratorType.IMPROVED_RECURSION);
        System.out.println(timer.stop() + " : improved recursive");
    }
}