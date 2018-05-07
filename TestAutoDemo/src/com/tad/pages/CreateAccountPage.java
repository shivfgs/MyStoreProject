package com.tad.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tad.base.TestBase;

import junit.framework.Assert;

public class CreateAccountPage {
	
	
	// POM: Create Account Page/Registration page Objects
		@FindBy(id="customer_firstname")
		WebElement txtFirstName;
		
		@FindBy(id="customer_lastname")
		WebElement txtLastName;
		
		@FindBy(id="passwd")
		WebElement txtPassword;
		
		@FindBy(id="address1")
		WebElement txtAddress;
		
		@FindBy(id="city")
		WebElement txtCity;
		
		@FindBy(id="id_state")
		WebElement txtState;
		@FindBy(id="postcode")
		WebElement txtZip;
		@FindBy(id="id_country")
		WebElement ddlCountry;
		
		@FindBy(id="phone_mobile")
		WebElement txtmobile;
		@FindBy(id="alias")
		WebElement txtAddressAlias;
		@FindBy(id="submitAccount")
		WebElement btnRegister;
		// Webdriver for this page
		private WebDriver driver;
/*
 * Function Name : createAccountDetails
 * Description: This function enters the user details at login page
 * Parameters: strFirstName, strLastName.....etc
 * Author: Shiv
 * */
		public void createAccountDetails(String strFirstName,String strLastName,String strPassword,String strAddress,String strCity,String strState,String strZip,String strCountry,String strMobile,String strAddAlias) {
			txtFirstName.sendKeys(strFirstName);
			txtLastName.sendKeys(strLastName);
			txtAddress.sendKeys(strAddress);
			txtCity.sendKeys(strCity);
			txtState.sendKeys(strState);
			txtZip.sendKeys(strZip);
			ddlCountry.sendKeys(strCountry);
			txtmobile.sendKeys(strMobile);
			txtAddressAlias.sendKeys(strAddAlias);
		}
		
		/*
		 * Function Name : verifyCreateAccountPage
		 * Description: This function verifies the Login page title.
		 * Parameters: NA
		 * Author: Shiv
		 * */
		@SuppressWarnings("deprecation")
		public void verifyCreateAccountPage(){
			Assert.assertEquals("Login - My Store", driver.getTitle());
		}
		/*
		 * Function Name : clickRegister
		 * Description: This function clicks Register link on the page
		 * Parameters: NA
		 * Author: Shiv
		 * */
		public void clickRegister() {
			btnRegister.submit();
		}
		
		/*
		 * Function Name : CreateAccountPage
		 * Description: This is the constructor method for the class.
		 * Parameters: Web driver
		 * Author: Shiv
		 * */
		public CreateAccountPage(WebDriver driver) throws Exception {
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
