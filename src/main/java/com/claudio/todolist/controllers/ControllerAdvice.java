package com.claudio.todolist.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.claudio.todolist.dto.ErrorDTO;
import com.claudio.todolist.exception.GeneralException;
import com.claudio.todolist.exception.NoSuchElementFound;

@RestControllerAdvice
public class ControllerAdvice {
    
    @ExceptionHandler(value = NoSuchElementFound.class)
    public ResponseEntity<ErrorDTO> ElementFoundExceptioHandler(NoSuchElementFound ex){
        ErrorDTO errorDTO = new ErrorDTO(ex.getCode(),ex.getMessage());
        return new ResponseEntity<>(errorDTO,ex.getHttpStatus());
    }
    
    /* 
    @ExceptionHandler(value = GeneralException.class)
    public ResponseEntity<ErrorDTO> ElementFoundExceptioHandler(GeneralException ex){
        ErrorDTO errorDTO = new ErrorDTO(ex.getCode(),ex.getMessage());
        return new ResponseEntity<>(errorDTO,ex.getHttpStatus());
    }
    */
}
