package fr.tungnguyen.kata.primefactors;

import static fr.tungnguyen.kata.primefactors.PrimeFactors.computeFactorsFor;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

@SuppressWarnings("javadoc")
public class PrimeFactorsTest {

    @Test
    public void testPrimeFactor() throws Exception {
        assertEquals(asList(), computeFactorsFor(1));
        assertEquals(asList(2), computeFactorsFor(2));
        assertEquals(asList(3), computeFactorsFor(3));
        assertEquals(asList(2, 2), computeFactorsFor(4));
        assertEquals(asList(5), computeFactorsFor(5));
        assertEquals(asList(2, 3), computeFactorsFor(6));
        assertEquals(asList(7), computeFactorsFor(7));
        assertEquals(asList(2, 2, 2), computeFactorsFor(8));
        assertEquals(asList(3, 3), computeFactorsFor(9));
        assertEquals(asList(2, 5), computeFactorsFor(10));
        assertEquals(asList(11), computeFactorsFor(11));
        assertEquals(asList(2, 2, 3, 5, 7, 7, 11, 13), computeFactorsFor(2 * 2 * 3 * 5 * 7 * 7 * 11 * 13));
    }
}
