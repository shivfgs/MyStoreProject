package com.tad.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tad.base.TestBase;


public class MyAccountPage {

	
	@FindBy(id="phone_mobile")
	WebElement mobile;
	@FindBy(id="alias")
	WebElement addressalias;
	@FindBy(id="submitAccount")
	WebElement register;
	private WebDriver driver;
/*
* Function Name : verifyMyAccount
* Description: This function will verify the Fname and Lname avaialble on myAccount Page
* Parameters: User Information like firstname,lastname ..etc
* Author:
* */
	public void verifyMyAccount(String firstName,String lastName) {
		Assert.assertTrue(mobile.getText().contains(firstName));
		Assert.assertTrue(mobile.getText().contains(lastName));
		
		
	}
	
	/*
	 * Function Name : CreateAccountPage
	 * Description: This is the constructor method for the class.
	 * Parameters: Web driver
	 * Author: Shiv
	 * */
	public MyAccountPage(WebDriver driver) throws Exception {
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
