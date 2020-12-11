package com.provider;
import com.services.UserServices;
import com.servicesSummary.UserServicesSummary;
public class UserServicePoviders {
	public static UserServicesSummary summaryObj()
	{
		return new UserServices();
	}

}
