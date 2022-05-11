package com.example.user.mathgame;



/**
 * Thrown when code requests a {@link Property} on a class that does
 * not expose the appropriate method or field.
 *
 * @see Property#of(java.lang.Class, java.lang.Class, java.lang.String)
 */
public class NoSuchPropertyException extends RuntimeException {

    public NoSuchPropertyException(String s) {
        super(s);
    }

}