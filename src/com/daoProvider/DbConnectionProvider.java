package com.daoProvider;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbConnectionProvider 
{
	public static Connection getDbConnection()
	{
		Connection con=null;
		try
		{
			
			FileInputStream fis=new FileInputStream(".//resources//Index.properties");
			Properties p=new Properties();
			p.load(fis);
			String driver=p.getProperty("driver");
			Class.forName(driver);
			String url=p.getProperty("url");
			String username=p.getProperty("username");
			String passward=p.getProperty("passward");
			//Class.forName(driver);
			con=DriverManager.getConnection(url,username,passward);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
}
