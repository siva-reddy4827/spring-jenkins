package com.example.demo.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class RestExceptionHandler {

	@ExceptionHandler(value = BookNotFoundException.class)
	public ResponseEntity<ErrorCode> handleBookNotFound(){
		
		ErrorCode code = new ErrorCode(400, "No book found", new Date());
		
		return new ResponseEntity<ErrorCode>(code, HttpStatus.BAD_REQUEST);
		
	}
	
}
