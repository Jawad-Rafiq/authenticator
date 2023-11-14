package com.womco.authenticator.exception;

public class PasswordException extends RuntimeException{
    public PasswordException() {
        super("Invalid password");
    }
    public PasswordException(String message) {
        super("Invalid password: " + message);
    }

}
