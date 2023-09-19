package com.bmsspringbootrestspringdatajpamaven.exception;

public class ApplicationException extends RuntimeException{
	@Override
	public String getMessage() {
		return "Book does not exist!";
	}
}
