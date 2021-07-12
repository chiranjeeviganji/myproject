package com.sdet;

import java.util.ResourceBundle;

public class App {
public int user_login(String uid ,String pwd)
{
	ResourceBundle rb=ResourceBundle.getBundle("config");
	String Username=rb.getString("username");
	String Password=rb.getString("password");
	if (uid.equals(Username) && pwd.equals(Password)) 
	{
		return 1;
	}
	else 
	{
		return 0;
	}


	
}
	
}
