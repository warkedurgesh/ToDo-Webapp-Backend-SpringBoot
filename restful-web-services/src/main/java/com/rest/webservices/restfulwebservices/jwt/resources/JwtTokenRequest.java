package com.rest.webservices.restfulwebservices.jwt.resources;
import java.io.Serializable;

public class JwtTokenRequest implements Serializable {

	private static final long serialVersionUID = -5616176897013108345L;

//	{
//	    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTU5MDEwMjQ2NywiaWF0IjoxNTg5NDk3NjY3fQ.F9xIBnWBZuBHmDjXLeoAqhtQLOXwjePRtV_Rk72f6U93ZYfvtmA6eWxVnwD5jQLHemYKS24HXuTpribXYXhQEQ"
//	}

	
	private String username;
	private String password;

	public JwtTokenRequest() {
		super();
	}

	public JwtTokenRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
