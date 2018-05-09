package com.epam.app.Chief.CustomExceptions;

/**
 * Author: Daria Budchan, May, 2018
 */
public class NonExistingTasteException extends RuntimeException {
    public NonExistingTasteException (String msg) {
        super(msg);
    }
}
