package com.exception;

public class InvalidUserException extends Exception 
{
	String args;
	public String InvalidUserException(String args)
	{
		return this.args=args;
	}
}
