package com.tenexperts.Summatra.array;

/**
 * Interface IArraySummater.
 *
 * @author Daria Trofimova
 * @version 1.0
 * @since 2018-10-23
 */
public interface IArraySummater {
    /**
     * Function sum to summarize array.
     *
     * @param array - an array
     * @return sum
     * @throws ArraySummaterException - throws when exception occurs
     */
    int sum(int[] array) throws ArraySummaterException;
}
