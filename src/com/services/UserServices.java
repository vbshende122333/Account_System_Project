package com.services;
import java.time.LocalDateTime;
import com.exception.*;
import com.bean.Users;
import com.servicesSummary.UserServicesSummary;
public class UserServices implements UserServicesSummary
{
	private Users user1;
	private static int passSeries=1000;
	private static int i=-1;
	private LocalDateTime count[]=new LocalDateTime[8];
	public boolean userValidate(String userName,String passward)throws NullPointerException,InvalidUsernameOrPasswardException
	{
		if(user1.getUserName()==null)
		{
			
			return false;
		}
		else
		{
			if(user1.getUserName().equals(userName) && user1.getPassward().contentEquals(passward))
			{
				return true;
			}
			else
			{
				throw new InvalidUsernameOrPasswardException();
				
			}
		}
	}
	public void signUp(String userName,String passward,String securityQues,String securityAns)
	{
		i++;
		count[i]=LocalDateTime.now();
		user1=new Users(userName,passward,securityQues,securityAns);
	}
	public boolean signIn(String userName,String passward) throws NullPointerException, InvalidUsernameOrPasswardException
	{
		if(userValidate(userName,passward))
		{
			 
			i++;
			count[i]=LocalDateTime.now();
			System.out.println("SignIn successfull");
			return true;
		}
		else
		{
			throw new InvalidUsernameOrPasswardException();
			//return false;
		}
	}

	public String forgetPassward(String userName,String securityQues,String securityAns)throws NullPointerException, InvalidUsernamOrSecurityInfoException
	{
        String str=null;
		if(user1.getUserName()==userName && user1.getSecurityQues()==securityQues && user1.getSecurityAns()==securityAns)
		{
			passSeries++;
			str=Integer.toString(passSeries);
			user1.setPassward(str);
			
		}
		else
		{
			throw new InvalidUsernamOrSecurityInfoException();
			
			
		}
		return str;	
	}
	public String changePassward(String userName,String passward) throws NullPointerException, InvalidUsernameOrPasswardException
	{
		//String pass;
		if(userValidate(userName,passward))
		{
			//pass="pass123";
			
			
			user1.setPassward("Pass123");
			System.out.println("Passward is Updated \n new passward is Pass123");
			return "Passward is updated";
		}
		else
		{
			System.out.println(user1.getPassward());
			return "Invalid UserName";
		}
	}
	public void getLogg(String userName,String passward) throws NullPointerException, InvalidUsernameOrPasswardException
	{ 
		if(userValidate(userName,passward))
		{
			for(int a=i;a>=0;a--)
			{
				System.out.println(count[i]);
			}
		}
		else
		{
			System.out.println("UserName or Passward is incorect");
		}
	}
	public LocalDateTime getDate()
	{
		return LocalDateTime.now();
	}
	public String toString()
	{
		return"Name is "+user1.getUserName()+user1.getPassward()+user1.getSecurityQues()+user1.getSecurityAns();
	}
}
