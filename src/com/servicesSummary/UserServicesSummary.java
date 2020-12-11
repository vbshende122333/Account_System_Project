package com.servicesSummary;

import com.exception.InvalidUsernamOrSecurityInfoException;
import com.exception.InvalidUsernameOrPasswardException;

public interface UserServicesSummary {
	void signUp(String userName,String passward,String securityQues,String securityAns);
	boolean signIn(String userName,String passward) throws NullPointerException, InvalidUsernameOrPasswardException;
	String forgetPassward(String userName,String securityQues,String securityAns) throws NullPointerException, InvalidUsernamOrSecurityInfoException;
	String changePassward(String userName,String passward) throws NullPointerException, InvalidUsernameOrPasswardException;
	void getLogg(String userName,String passward) throws NullPointerException, InvalidUsernameOrPasswardException;
}
