package com.learning.hotelbooking.exception;

public class ValidationException extends Exception {
    private String errorCode;
    private String desc;

    public ValidationException(String errorCode, String desc) {
        super();
        this.errorCode = errorCode;
        this.desc = desc;
    }
}
