package com.daoServices;

import com.bean.Account;

public interface DaoServices {

	int insertAccountData(Account acc);
    Account getAccountDetails(int accNo);
    float updateAccountBal(int accNo,float accBal);
}
