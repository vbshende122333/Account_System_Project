package com.services;
//import Features.Date;
import com.bean.Account;
import com.exception.*;
//import com.daoProvider.DaoProvider;
import com.daoServices.DaoServices;
import com.daoServicesImpl.daoServicesImplement;
import com.servicesSummary.AccountServicesSummary;
public class AccountServices extends Thread implements AccountServicesSummary
{
	
	public Account acc;
	DaoServices daoSer=new daoServicesImplement();
	int count;

	public int openAccount(String accType, float amount) throws InsufficientAmountException
	{
		if(amount<2000.0f)throw new InsufficientAmountException("Account balance not less than 2000.0");
		
		acc=new Account(accType,amount);
	
		//i++;
		//System.out.println("hi11");
		//System.out.println("Account created Account no is"+acc.getAccNo());
		
		
		count=daoSer.insertAccountData(acc);
		if(count>0) 
		{
			System.out.println("record inserted");
		}
		return acc.getAccNo();
	}
	public float deposit(int accNo,float amount) throws NullPointerException
	{
		
		Account acc=daoSer.getAccountDetails(accNo);
		
		float bal=acc.getAccBalance();
		
		daoSer.updateAccountBal(acc.getAccNo(),bal+ amount);
		
//		if (acc.getAccNo()==accNo)
//		{
		
			//throw new InvalidAccountNoException("AccountNo is not correct");
//			acc.setAccBalance(acc.getAccBalance() + amount);
//			return acc.getAccBalance();
//		}
//		else
//		{
//			return 0.0f;
//		}	
			return 1.0f;
	}
	public float withdraw(int accNo,float amount) throws NullPointerException, InsufficientAmountException
	{
		if(amount<2000.0f)throw new InsufficientAmountException("Account balance not less than 2000.0");
		
		Account acc=daoSer.getAccountDetails(accNo);
		float bal=acc.getAccBalance();
		daoSer.updateAccountBal(acc.getAccNo(),bal- amount);

//		if (acc.getAccNo()==accNo)
//		{
//			acc.setAccBalance(acc.getAccBalance() - amount);
//			return acc.getAccBalance();
//		}
//		else
//		{
			return bal-amount;
//		}
	}
	public String accDetails(int accNo)throws NullPointerException
	{
		daoSer.getAccountDetails(accNo);
//		if (acc.getAccNo()==accNo)
//		{
//			return "Account Number: "+acc.getAccNo()+"Account Type: "+acc.getAccType()+"Account Balance: "+acc.getAccBalance();
//		}
//		else
//		{
//			return "Invalid accNo";
//		}
		return "AccountType="+acc.getAccType()+"AccountBalance="+acc.getAccBalance();
	}
	public float balanceEnquiry(int accNo)throws NullPointerException
	{
		Account acc=daoSer.getAccountDetails(accNo);
		
		if (acc.getAccNo()==accNo)
		{
			return acc.getAccBalance();
		}
		else
		{
			return 0.0f;
		}
	}
	public void fundTransfer(int accNo1,int accNo2,float amount)throws NullPointerException, InsufficientAmountException
	{
		deposit( accNo1, amount);
		withdraw(accNo2,amount);
//		int j=0,a=0,b=0;
//		if(accNo1!=accNo2)
//		{
//			for(j=0;j<=i;j++)
//			{
//				if(acc[j].getAccNo()==accNo1)
//				{
//					a=j;
//				}
//				else if(acc[j].getAccNo()==accNo2)
//				{
//					b=j;
 //				}
//				
//			}
//			if(a==1&& b==1)
//			{
//				withdraw(acc[a],amount);
//				deposit(acc[b],amount);
//			}
//		}
	}

	public String toString()
	{
		return "Account Number is: "+acc.getAccNo()+ " Account Type is: "+acc.getAccType()+ " Account Balance is: "+acc.getAccBalance();
	}

}

