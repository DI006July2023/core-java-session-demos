package com.bms.bmsspringbootrestjdbctemplatemaven.exception;

public class ApplicationException extends RuntimeException{
	@Override
	public String getMessage() {
		return "Book does not exist!";
	}
}
