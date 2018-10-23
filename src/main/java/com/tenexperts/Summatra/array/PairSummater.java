package com.tenexperts.Summatra.array;


/**
 * Class PairSummater sums pairs.
 *
 * @author Daria Trofimova
 * @version 1.0
 * @since 2018-10-23
 */

public class PairSummater implements IArraySummater {

    /**
     * Pairwise summarizes the elements of the array, finding the largest amount.
     *
     * @param array  - an array multiple of 2
     * @return the largest amount of a pair of array elements
     * @throws ArraySummaterException - throws when array is not multiple of 2
     */

    public int sum(final int[] array) throws ArraySummaterException {
        int result = 0;
        if (array.length % 2 != 0) {
            throw new ArraySummaterException("Array is not multiple of 2.", new IllegalArgumentException());
        }

        int tmp;
        for (int i = 0; i < array.length - 1;) {
            tmp = array[i] + array[i + 1];
            if (result < tmp) {
                result = tmp;
            }
            i += 2;
        }
        return result;

    }
}
