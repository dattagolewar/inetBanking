package com_inetBanking_PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_inetBanking_TestBase.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='uid']")
	private WebElement Username_Id;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password_txt;

	@FindBy(xpath="//input[@name='btnLogin']")
	private WebElement login_btn;
	
	public void setUsernameID(String ID)
	{
		Username_Id.sendKeys(ID);	
	}
	public void setPassword(String password)
	{
		password_txt.sendKeys(password);
	}
	public void clickOnLoginButton()
	{
		login_btn.click();
	}
}
