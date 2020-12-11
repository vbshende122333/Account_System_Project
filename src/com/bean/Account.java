package com.bean;

public class Account {
	private int accNo;
	private String accType;
	private float accBalance;
//	private static int accNoSeries=10000;
	public Account()
	{
		
	}
	public Account(String accType,float accBalance)
	{
//		accNo=accNoSeries;
//		accNoSeries++;
		this.accType=accType;
		this.accBalance=accBalance;
	
	}
	
	public void setAccNo(int accNo)
	{
		this.accNo=accNo;
	}
	public void setAccType(String accType)
	{
		this.accType=accType;
	}
	public void setAccBalance(float accBalance)
	{
		this.accBalance=accBalance;
	}
	public int getAccNo()
	{
		return accNo;
	}
	public String getAccType()
	{
		return accType;
	}
	public float getAccBalance()
	{
		return accBalance;
	}
	public String toString()
	{
		return "Account Number is: "+accNo+ " Account Type is: "+accType+ " Account Balance is: "+accBalance;
	}
	
}
