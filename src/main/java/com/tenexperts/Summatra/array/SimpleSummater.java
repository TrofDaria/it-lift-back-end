package com.tenexperts.Summatra.array;


/**
 * Class SimpleSummater performs simple summation.
 *
 * @author Daria Trofimova
 * @version 1.0
 * @since 2018-10-23
 */

public class SimpleSummater implements IArraySummater {

    /**
     * Finds the sum of the elements of the array.
     *
     * @param array - an array
     * @return the sum of all elements
     */
    public int sum(final int[] array) {
        int result = 0;
        for (int element : array) {
            result += element;
        }
        return result;
    }
}
