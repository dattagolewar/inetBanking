package com_inetBanking_PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_inetBanking_TestBase.TestBase;

public class NewAccountPage extends TestBase {

	public NewAccountPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='New Account']")
	private WebElement new_acc;
	
	@FindBy(xpath="//input[@name='cusid']")
	private WebElement cutomer_Id;
	
	@FindBy(xpath="//*[@value='Savings']")
	private WebElement acc_type;
	
	@FindBy(xpath="//input[@name='inideposit']")
	private WebElement intiatl_deposit;
	
	@FindBy(xpath="//input[@name='button2']")
	private WebElement submit_btn;
	
	public void clickOnNewAccount()
	{
		new_acc.click();
	}
	public void setCustomerId( String ID)
	{
		cutomer_Id.sendKeys(ID);
	}
	public void setAccountType()
	{
		acc_type.click();
	}
	public void setIntialDeposit( String deposit)
	{
		intiatl_deposit.sendKeys(deposit);
	}
	public void clickOnSubmitButton()
	{
		submit_btn.click();	
		
		driver.switchTo().alert().accept();
	}
}
