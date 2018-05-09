package com.epam.app.Chief.CustomExceptions;

/**
 * Author: Daria Budchan, May, 2018
 */
public class NonExistingColourException extends RuntimeException {
    public NonExistingColourException(String msg) {
        super(msg);
    }
}
