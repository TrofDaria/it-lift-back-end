package com.tenexperts;

import com.tenexperts.Summatra.array.ArraySummaterException;
import com.tenexperts.Summatra.array.PairSummater;
import com.tenexperts.Summatra.array.SimpleSummater;

/**
 * Main application entry point
 */
public class Main {
    /**
     * Main function for app
     * @param args - console arguments
     */
    public static void main(final String[] args) {
        SimpleSummater simpleSummater = new SimpleSummater();
        PairSummater pairSummater = new PairSummater();
        int[] array = {1, 1, 0, 1};
        System.out.println("Array for summation:");
        for (int element : array) {
            System.out.println(element);
        }
        System.out.println("Result of simple summation:");
        System.out.println(simpleSummater.sum(array));
        System.out.println("Result of pair summation:");
        try {
            System.out.println(pairSummater.sum(array));
        } catch (ArraySummaterException e) {
            System.out.println(e.getMessage());
        }

    }
}