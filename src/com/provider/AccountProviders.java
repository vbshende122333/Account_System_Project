package com.provider;
import com.services.AccountServices;
import com.servicesSummary.AccountServicesSummary;
public class AccountProviders
{
	public static AccountServicesSummary createObject()
	{
		return new AccountServices();
	}
}
