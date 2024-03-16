package com.training.crypto.cryptoapp.exception;

/*
 * Use @ControllerAdvice annotation to handle the exceptions globally
 * Use @ExceptionHandler annotation to handle the exceptions
 * WishListAlreadyExistException
 */
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(WishListAlreadyExistException.class)
    public ResponseEntity<String> handleWishListAlreadyExistException(WishListAlreadyExistException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
