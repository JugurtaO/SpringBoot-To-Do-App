package com.JavaWebLearning.FirstSpringBootCRUD.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)

public class UserAlreadyExists extends  RuntimeException {
    public UserAlreadyExists(String message){
        super(message);
    }
}
