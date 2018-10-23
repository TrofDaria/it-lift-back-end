package com.tenexperts.Summatra.array;
import com.tenexperts.Summatra.array.SimpleSummater;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SimpleSummaterTest {
    private SimpleSummater simpleSummater;
    @Before
    public void setUp() {
        this.simpleSummater = new SimpleSummater();
    }
    @Test
    public void testSum() {
        int[] array = {10, 20, 1, 25};
        int result = this.simpleSummater.sum(array);
        assertEquals("wrong result",
                56, result);
    }
    @Test
    public void testSumSingleElement() {
        int[] array = {10};
        int result = this.simpleSummater.sum(array);
        assertEquals("wrong result",
                10, result);
    }
}