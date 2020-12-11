package com.client;
import com.exception.InvalidUserException;
import com.exception.InvalidUsernameOrPasswardException;
import com.provider.UserServicePoviders;
import com.servicesSummary.UserServicesSummary;
public class ClientUserServices {
	public static void main(String args[]) throws InvalidUserException
	{
		UserServicesSummary uss1=UserServicePoviders.summaryObj();
		uss1.signUp("vishal", "pass123","what","why");
		try {
			uss1.signIn("vishal", "pass123");
			uss1.signIn("vishal", "pass123");
			uss1.getLogg("vishal", "pass123");
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidUsernameOrPasswardException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
