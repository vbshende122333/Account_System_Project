package com.client;

//import com.services.AccountServices;
import com.servicesSummary.AccountServicesSummary;

//import Features.Date;

//import java.util.ArrayList;
//import java.util.Iterator;


import com.bean.Account;
import com.exception.InsufficientAmountException;
import com.provider.AccountProviders;
public class ClientAccount {
	
	public static void main(String args[])
	{
		//System.out.println("hii");
		AccountServicesSummary as1=AccountProviders.createObject();
		AccountServicesSummary as2=AccountProviders.createObject();
		//as1.balanceEnquiry(10002);
		try {
			as1.openAccount("Saving", 80000);
			as2.openAccount("Saving", 90000);
			as1.deposit(10004, 9000);
			as2.withdraw(10003, 7000);
			as1.fundTransfer(10003, 10004, 10000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
