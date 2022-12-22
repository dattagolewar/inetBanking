package com_inetBanking_PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_inetBanking_TestBase.TestBase;

public class NewCustomerPage extends TestBase {
	
	public NewCustomerPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	private WebElement newcustomer;
	
//	@FindBy(xpath="//div[@id='dismiss-button']")
//	private WebElement click_popmsg;
//	
	@FindBy(xpath="//input[@name='name']")
	private WebElement customername;

	@FindBy(xpath="//input[@name='rad1']")
	private WebElement gender_btn;

	@FindBy(xpath="//input[@id='dob']")
	private WebElement birth_dateText;

	@FindBy(xpath="//*[@name='addr']")
	private WebElement Addr_text;

	@FindBy(xpath="//input[@name='city']")
	private WebElement city_text;

	@FindBy(xpath="//input[@name='state']")
	private WebElement state_txt;

	@FindBy(xpath="//input[@name='pinno']")
	private WebElement pin_num;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	private WebElement mobile_num;

	@FindBy(xpath="//input[@name='emailid']")
	private WebElement emil_txt;

	@FindBy(xpath="//input[@name='password']")
	private WebElement password_txt;
	
	@FindBy(xpath="//input[@name='sub']")
	private WebElement submit_btn;

	@FindBy(xpath="//*[text()='Continue']")
private WebElement Click_link;

	public void clickOnNewCustomerText()
	{
		newcustomer.click();
	}
//	public void clickOnPopMessgerWindow() throws InterruptedException
//	{   click_popmsg.click();
//		Thread.sleep(3000);
//	}
	public void setCustomerName(String cs_name )
	{
		customername.sendKeys(cs_name);
	}
	public void selectGender()
	{
		gender_btn.click();	
	}
	public void setDateOfBirth(String dob)
	{
		birth_dateText.sendKeys(dob);	
	}
	public void setCustomerAddress(String address) 
	{
		Addr_text.sendKeys(address);
	}
	public void setCity(String city)
	{
		city_text.sendKeys(city);
	}
	public void setState(String state)
	{
		state_txt.sendKeys(state);
	}
	public void setPin(String pin)
	{
		pin_num.sendKeys(pin);
	}
	public void setUserMobileNumber(String mobilenumber)
	{
		mobile_num.sendKeys(mobilenumber);
	}
	public void enterE_mail(String mail)
	{
		emil_txt.sendKeys(mail);
	}
	public void enterPassword(String password)
	{
		password_txt.sendKeys(password);
	}
	public void clickOnSubmitButton() throws InterruptedException
	{
		submit_btn.click();
		//driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
public void clickOnCountinousLink()
	{
		Click_link.click();
}
	
}
