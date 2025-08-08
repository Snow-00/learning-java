package com.myjava.error;

public class ValidationException extends Throwable {
    // private String message;

    // public String getMessage() {
    //     return message;
    // }

    // Can use constructor instead for getMessage

    public ValidationException(String message) {
        super(message);
    }
}
