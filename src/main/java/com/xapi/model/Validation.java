package com.xapi.model;

public class Validation {

    private String code;
    private String message;

    public Validation() {
    }

    public Validation(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
