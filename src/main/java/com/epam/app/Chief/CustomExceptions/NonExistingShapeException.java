package com.epam.app.Chief.CustomExceptions;

/**
 * Author: Daria Budchan, May, 2018
 */
public class NonExistingShapeException extends RuntimeException {
    public NonExistingShapeException(String msg) {
        super(msg);
    }
}
