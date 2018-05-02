package com.tad.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage {
	
	// Create Account Page/Registration page Objects
		@FindBy(id="customer_firstname")
		WebElement firstname;
		
		@FindBy(id="customer_lastname")
		WebElement lastname;
		
		@FindBy(id="passwd")
		WebElement password;
		
		@FindBy(id="firstname")
		WebElement addressfirstname;
		
		@FindBy(id="lastname")
		WebElement addresslastname;
		
		@FindBy(id="address1")
		WebElement address;
		
		@FindBy(id="city")
		WebElement city;
		
		@FindBy(id="id_state")
		WebElement state;
		@FindBy(id="postcode")
		WebElement zip;
		@FindBy(id="id_country")
		WebElement country;
		
		@FindBy(id="phone_mobile")
		WebElement mobile;
		@FindBy(id="alias")
		WebElement addressalias;
		@FindBy(id="submitAccount")
		WebElement register;

		public void createAccountDetails(String firstName,String lastName,String password,String addFirstName,
				String addLastName,String strAddress,String strCity,String strState,String strZip,String strCountry,String strMobile,String strAddAlias) {
			firstname.sendKeys(firstName);
			lastname.sendKeys(lastName);
			addressfirstname.sendKeys(addFirstName);
			addresslastname.sendKeys(addLastName);
			address.sendKeys(strAddress);
			city.sendKeys(strCity);
			state.sendKeys(strState);
			zip.sendKeys(strZip);
			country.sendKeys(strCountry);
			mobile.sendKeys(strMobile);
			addressalias.sendKeys(strAddAlias);
		}
		
		public void clickRegister() {
			register.submit();
		}
}
