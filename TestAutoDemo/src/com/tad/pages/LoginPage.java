package com.tad.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tad.base.TestBase;

public class LoginPage {
	private WebDriver driver;
// POM: Web Elements on this page
	@FindBy(id="email_create")
	WebElement txtEmailAddress;
	
	@FindBy(id="SubmitCreate")
	WebElement btnCreateanAccount;
	
	@FindBy(xpath=".//*[@id='create_account_error']")
	WebElement lblCreateAccountError;
	
	
	// Enter email address
	public void enterEmail(String strEmailAddress) {
		txtEmailAddress.click();
		txtEmailAddress.sendKeys(strEmailAddress);
			
	}
	// Click on Create Account
	public void clickCreateanAccount() {
		btnCreateanAccount.submit();
	}
	// Check Error for email address
	public boolean createAccountError() {
		return lblCreateAccountError.isDisplayed();
	}
	
	/*
	 * Function Name : CreateAccountPage
	 * Description: This is the constructor method for the class.
	 * Parameters: Web driver
	 * Author: Shiv
	 * */
	public LoginPage(WebDriver driver) throws Exception {
		this.driver=driver;
		initializeWebElements();
	}
	/*
	 * Function Name : initializeWebElements
	 * Description: This function initializes Web elements in this pag class.
	 * Parameters: Driver and This
	 * Author: Shiv
	 * */
	public void initializeWebElements() {
		PageFactory.initElements(driver, this);
	}
	

}
