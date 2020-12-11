package com.exception;

public class InsufficientAmountException extends Exception
{
	
	String args;
	public InsufficientAmountException(String args)
	{
		this.args=args;
	}
		
	
}
