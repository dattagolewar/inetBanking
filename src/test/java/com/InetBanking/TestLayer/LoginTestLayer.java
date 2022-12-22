package com.InetBanking.TestLayer;

import org.testng.annotations.Test;

import com_inetBanking_PageLayer.LoginPage;
import com_inetBanking_TestBase.TestBase;

public class LoginTestLayer  extends TestBase{
	
	@Test
	public void VerifyLoginFunctionality()
	{
		LoginPage login = new LoginPage();
		login.setUsernameID("mngr462636");
		login.setPassword("mUpahez");
		login.clickOnLoginButton();
	}
}
