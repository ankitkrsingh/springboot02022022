package com.example.springboot04022022.exception;

public class CustomEmployeeException extends RuntimeException{
    public CustomEmployeeException(String message) {
        super(message);
    }
}
