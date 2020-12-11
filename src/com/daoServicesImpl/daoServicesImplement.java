package com.daoServicesImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.bean.Account;
import com.daoProvider.DbConnectionProvider;
import com.daoServices.DaoServices;
public class daoServicesImplement implements DaoServices
{
	
	Connection con=DbConnectionProvider.getDbConnection();
	//System.out.println("created connection");
	
	PreparedStatement stmt;
	
	
	public int insertAccountData(Account acc)
	{
		
//		Connection con=DbConnectionProvider.getDbConnection();
//		//System.out.println("created connection");
//		PreparedStatement stmt,stmt1;
		int updateCount=0;
		try 
		{
//			Connection con=DbConnectionProvider.getDbConnection();
//			System.out.println("created connection");
//			PreparedStatement stmt;
			stmt=con.prepareStatement("insert into accountinfo(accNo,accType,accBalance) values(?,?,?)");
			stmt.setInt(1, acc.getAccNo());
			stmt.setString(2, acc.getAccType());
			stmt.setFloat(3,acc.getAccBalance());
			updateCount=stmt.executeUpdate();
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return updateCount;
	}
	public Account getAccountDetails(int accNo)
	{
		
		Account acc=null;
		try
		{
			stmt=con.prepareStatement("select * from accountinfo where accNo=?");
			stmt.setInt(1,accNo);
			
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
				if(accNo==rs.getInt(1))
				{
					int accNo1=rs.getInt(1);
					String accType=rs.getString(2);
					float accBal=rs.getFloat(3);
					
					acc=new Account(accType,accBal);
					acc.setAccNo(accNo1);
					System.out.println("AccountNo="+accNo1+" Account Type="+accType+" Account Balance="+accBal);
				}
			}
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return acc;
	}
	public float updateAccountBal(int accNo1,float accBal)
	{
		
		//System.out.println(accBal);
		int updateCount;
		Account acc=new Account();
		acc.setAccNo(accNo1);
		acc.setAccBalance(accBal);
		//System.out.println(accBal);
		try
		{
			stmt=con.prepareStatement("UPDATE accountinfo SET accBalance=? where accNo=?");
			stmt.setFloat(1,accBal);
			stmt.setInt(2,accNo1);
			System.out.println(accBal);
			updateCount=stmt.executeUpdate();
			
		
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return accBal;
	}
	
}
