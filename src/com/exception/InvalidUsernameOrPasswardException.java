package com.exception;

public class InvalidUsernameOrPasswardException extends Exception
{
	String args;
	public String InvalidUsernameOrPasswardException(String args)
	{
		return this.args=args;
	}
}
