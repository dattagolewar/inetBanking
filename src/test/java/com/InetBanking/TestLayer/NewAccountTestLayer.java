package com.InetBanking.TestLayer;

import org.testng.annotations.Test;

import com_inetBanking_PageLayer.LoginPage;
import com_inetBanking_PageLayer.NewAccountPage;
import com_inetBanking_PageLayer.NewCustomerPage;
import com_inetBanking_TestBase.TestBase;

public class NewAccountTestLayer extends TestBase {
	
	@Test
	public void verifyNewAccountCreat() throws InterruptedException
	{
		LoginPage login = new LoginPage();
		NewCustomerPage acc = new NewCustomerPage();
		NewAccountPage  na = new NewAccountPage();
	   
		
		
		login.setUsernameID("mngr462636");
		login.setPassword("mUpahez");
		login.clickOnLoginButton();
		
		
       	acc.clickOnNewCustomerText();
	   // acc.clickOnPopMessgerWindow();
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
		
		na.clickOnNewAccount();
		na.setCustomerId("mngr462636");
		na.setAccountType();
		na.setIntialDeposit("25000");
		//na.clickOnSubmitButton();

	}

}
