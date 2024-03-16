package com.training.crypto.cryptoapp.exception;

// Create a custom exception called WishListAlreadyExistException
public class WishListAlreadyExistException extends RuntimeException {
    public WishListAlreadyExistException(String message) {
        super(message);
    }
}