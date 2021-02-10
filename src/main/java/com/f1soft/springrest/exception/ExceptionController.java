/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.springrest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author Sandesh Pahari <sandesh.pahari@f1soft.com>
 */
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = StudentNotFoundException.class)
   public ResponseEntity<Object> exception(StudentNotFoundException exception) {
      return new ResponseEntity<>("Student not found", HttpStatus.NOT_FOUND);
   } 
}
