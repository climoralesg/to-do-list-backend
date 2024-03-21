package com.claudio.todolist.exception;

import org.springframework.http.HttpStatus;

public class NoSuchElementFound extends RuntimeException{

    private String code;
    private HttpStatus httpStatus;    

    public NoSuchElementFound(String code, HttpStatus httpStatus, String message) {
        super(message);
        this.code = code;
        this.httpStatus = httpStatus;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    

}
