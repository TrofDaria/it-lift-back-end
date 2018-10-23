package com.tenexperts.Summatra.array;

/**
 * Class ArraySummaterException is a custom exception for array summations.
 *
 * @author Daria Trofimova
 * @version 1.0
 * @since 2018-10-23
 */

public class ArraySummaterException extends Exception {
    /**
     * Constructor.
     *
     * @param message - message to receive
     * @param e - exception to handle
     */
    ArraySummaterException(final String message, final Exception e) {
        super(message, e);
    }
}