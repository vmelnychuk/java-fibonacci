package generator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class IterativeFifonacciGeneratorTest {
    private FibonacciGenerator generator;

    @Before
    public void setUp() throws Exception {
        generator = new IterativeFibonacciGenerator();
    }

    @After
    public void tearDown() throws Exception {
        generator = null;
    }

    @Test
    public void testGeneratorWithInitialValues() throws Exception {
        BigInteger zero = generator.getNumber(0);
        assertEquals(BigInteger.ZERO, zero);
        BigInteger one = generator.getNumber(1);
        assertEquals(BigInteger.ONE, one);
    }

    @Test
    public void testGeneratorWithConfiguration() throws Exception {
        FibonacciGenerator generatorWithConfiguration = new IterativeFibonacciGenerator(
                FibonacciConfiguration.ONE_BASE);
        assertEquals(1L, generatorWithConfiguration.getNumber(0));
        assertEquals(1L, generatorWithConfiguration.getNumber(1));
    }

    @Test
    public void testGetNumberWithFive() throws Exception {
        assertEquals(5L, generator.getNumber(5));
    }

    @Test
    public void testGetNumberWithTwenty() throws Exception {
        assertEquals(6765L, generator.getNumber(20));
    }

    @Test
    public void testGetNumberWithThirtyEight() throws Exception {
        assertEquals(39088169L, generator.getNumber(38));
    }

    @Test
    public void testGetNumberWithMaxLongSize() throws Exception {
        assertEquals(7540113804746346429L, generator.getNumber(92));
    }
}