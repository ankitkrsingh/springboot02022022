package com.example.springboot04022022.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class CustomExceptionHandler {

    @ExceptionHandler(CustomEmployeeException.class)
    public ResponseEntity<Object> handleException(CustomEmployeeException e) {
        log.error(HttpStatus.BAD_REQUEST.toString(), e);
        return new ResponseEntity<>("Bitte suchen Sie einen anderen Employee", HttpStatus.BAD_REQUEST);
    }
}
