package com.servicesSummary;

import com.exception.InsufficientAmountException;

//import Features.Date;

public interface AccountServicesSummary 
{
	int openAccount(String accType, float amount) throws InsufficientAmountException;
	float deposit(int accNo,float amount)throws NullPointerException;
	float withdraw(int accNo,float amount) throws NullPointerException, InsufficientAmountException;
	String accDetails(int accNo)throws NullPointerException;
	float balanceEnquiry(int accNo)throws NullPointerException;
	void fundTransfer(int accNo1,int accNo2,float amount) throws NullPointerException, InsufficientAmountException;
	
 
}
