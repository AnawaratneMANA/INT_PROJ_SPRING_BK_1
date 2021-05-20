package com.example.demo.cstExceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class CstAuthException extends RuntimeException{
    public CstAuthException(String message){
        super(message);
    }
}
