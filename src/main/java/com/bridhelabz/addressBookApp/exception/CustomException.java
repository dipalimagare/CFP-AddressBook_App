package com.bridhelabz.addressBookApp.exception;

/**
 * Address book exceptions throws RunTime Exceptions
 * @author Dipali Magare
 * version 0.0.1
 * @since 16-10-2021
 */

public class CustomException extends RuntimeException{

    public CustomException(String message){
        super(message);

    }
}