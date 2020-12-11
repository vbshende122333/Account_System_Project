package com.exception;

public class InvalidUsernamOrSecurityInfoException extends Exception
{
	String args;
	public String InvalidUsernamOrSecurityInfoException(String args)
	{
		return this.args=args;
	}
}
