package com.tad.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tad.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath=".//a[@class='login']")
	WebElement signin;
	
	@FindBy(id="email_create")
	WebElement email;
	
	@FindBy(id="SubmitCreate")
	WebElement createanAccount;
	
	@FindBy(xpath=".//*[@id='create_account_error']")
	WebElement createaccounterror;
	
	public void clickSignIn() {
		signin.click();
	}
	
	public void login(String emailAddress) {
		email.sendKeys(emailAddress);
			
	}
	
	public void clickCreateanAccount() {
		createanAccount.submit();
	}
	
	public boolean createAccountError() {
		return createaccounterror.isDisplayed();
	}
	
	
	public HomePage() throws Exception {
		super();
		
	}
	public void setup(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
