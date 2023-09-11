package com.bms.bmsspringbootrestjdbctemplatemaven.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(value= {ApplicationException.class})
	public ResponseEntity<ErrorDto> handleApplicationException(ApplicationException ae, WebRequest request) {
		ErrorDto error = new ErrorDto(ae.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, LocalDateTime.now());
		return new ResponseEntity<ErrorDto>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
}
