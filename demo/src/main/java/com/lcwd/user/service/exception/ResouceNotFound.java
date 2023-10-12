package com.lcwd.user.service.exception;

public class ResouceNotFound extends RuntimeException {

	public ResouceNotFound() {
		super("Resource not found Exception");
	}

	public ResouceNotFound(String message) {
		super(message);
	}
}
