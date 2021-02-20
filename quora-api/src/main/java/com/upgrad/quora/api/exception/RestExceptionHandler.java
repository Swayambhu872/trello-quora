package com.upgrad.quora.api.exception;


import com.upgrad.quora.service.exception.AuthenticationFailedException;
import com.upgrad.quora.service.exception.SignUpRestrictedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.upgrad.quora.api.model.ErrorResponse;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(SignUpRestrictedException.class)
    public ResponseEntity<ErrorResponse> signUpRestrictedException(SignUpRestrictedException sre , WebRequest webRequest) {
        return new ResponseEntity<ErrorResponse>(
                new ErrorResponse().code(sre.getCode()).message(sre.getErrorMessage()), HttpStatus.CONFLICT);
    }

}
