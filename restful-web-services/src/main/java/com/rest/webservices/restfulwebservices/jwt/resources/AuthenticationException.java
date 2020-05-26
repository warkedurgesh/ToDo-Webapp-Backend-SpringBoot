package com.rest.webservices.restfulwebservices.jwt.resources;
public class AuthenticationException extends RuntimeException {
	public AuthenticationException(String message, Throwable cause) {
		super(message, cause);
	}
}