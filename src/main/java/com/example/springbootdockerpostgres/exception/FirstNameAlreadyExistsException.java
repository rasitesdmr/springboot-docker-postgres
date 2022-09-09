package com.example.springbootdockerpostgres.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.ALREADY_REPORTED, reason = "Error : FirstName zaten var !")
public class FirstNameAlreadyExistsException extends RuntimeException{
}
