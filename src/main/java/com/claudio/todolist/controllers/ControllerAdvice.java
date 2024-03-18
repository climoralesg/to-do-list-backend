package com.claudio.todolist.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.claudio.todolist.dto.ErrorDTO;

@RestControllerAdvice
public class ControllerAdvice {
    
    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<ErrorDTO> runtimeExceptioHandler(RuntimeException ex){
        ErrorDTO errorDTO = new ErrorDTO("P-400", ex.getMessage());
        return new ResponseEntity<>(errorDTO,HttpStatus.BAD_REQUEST);
    }
    

}
