package com.example.YouOnWork.API.Controller.Exptions;

public class ExceptionHandler extends RuntimeException{
    public ExceptionHandler(String message) {
        super(message);
    }
}
