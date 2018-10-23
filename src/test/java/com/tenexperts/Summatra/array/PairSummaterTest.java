package com.tenexperts.Summatra.array;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class PairSummaterTest {
    private PairSummater pairSummater;

    @Before
    public void setUp() {
        this.pairSummater = new PairSummater();
    }

    @Test
    public void testSum() throws ArraySummaterException{
        int[] array = {10, 20, 100, 15};
        int result = this.pairSummater.sum(array);
        assertEquals("wrong result",
                115, result);
    }

    @Test(expected = ArraySummaterException.class)
    public void testSumException() throws ArraySummaterException{
        int[] array = {10, 20, 1};
            this.pairSummater.sum(array);

    }
}