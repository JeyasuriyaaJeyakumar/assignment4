package com.example.assignment4.exception;

public class RestrictedInfoException extends Exception{

    public String getMessage() {
        return "Restricted user info !";
    }
}
