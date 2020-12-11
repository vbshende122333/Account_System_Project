package com.bean;

public class Users {
	private String userName;
	private String passward;
	private String securityQues;
	private String securityAns;
	
	public Users(String userName,String passward,String securityQues,String securityAns)
	{
		this.userName=userName;
		this.passward=passward;
		this.securityQues=securityQues;
		this.securityAns=securityAns;
		
	}
	public void setUserName(String userName)
	{
		this.userName=userName;
	}
	public void setPassward(String passward)
	{
		this.passward=passward;
	}
	public void setSecurityQues(String securityQues)
	{
		this.securityQues=securityQues;
	}
	public void setSecurityAns(String securityAns)
	{
		this.securityAns=securityAns;
	}
	public String getUserName()
	{
		return userName;
	}
	public String getPassward()
	{
		return passward;
	}
	public String getSecurityQues()
	{
		return securityQues;
	}
	public String getSecurityAns()
	{
		return securityAns;
	}
	public String toString()
	{
		return "User name is "+userName+" passward is "+passward+" Security Question is"+securityQues+" securityAns is "+securityAns;
	}
	public static void main(String args[])
	{
		
	}
}
