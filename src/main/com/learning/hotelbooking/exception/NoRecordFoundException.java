package com.learning.hotelbooking.exception;

public class NoRecordFoundException extends Exception {
    private String errorCode;
    private String desc;

    public NoRecordFoundException(String errorCode, String desc) {
        super();
        this.errorCode = errorCode;
        this.desc = desc;
    }
}
