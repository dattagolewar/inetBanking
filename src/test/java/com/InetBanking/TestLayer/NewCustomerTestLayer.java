package com.InetBanking.TestLayer;

import org.testng.annotations.Test;

import com_inetBanking_PageLayer.LoginPage;
import com_inetBanking_PageLayer.NewCustomerPage;
import com_inetBanking_TestBase.TestBase;

public class NewCustomerTestLayer extends TestBase {

	@Test
	public void VerifyNewUserAccountCreated() throws InterruptedException
	{
		LoginPage login = new LoginPage();
		NewCustomerPage acc = new NewCustomerPage();
		
	
		login.setUsernameID("mngr462636");
		login.setPassword("mUpahez");
		login.clickOnLoginButton();
		
		
		acc.clickOnNewCustomerText();
		//acc.clickOnPopMessgerWindow();
		acc.setCustomerName("datta golewar");
		acc.selectGender();
		acc.setDateOfBirth("o2-06-1996");
		acc.setCustomerAddress("shivshankar nagar hadapsar");
		acc.setCity("pune");
		acc.setState("maharashtra");
		acc.setPin("411028");
		acc.setUserMobileNumber("7066778881");
		acc.enterE_mail("dattagolewar12@gmail.com");
		acc.enterPassword("mUpahez");
		acc.clickOnSubmitButton();
		acc.clickOnCountinousLink();
	}

}
