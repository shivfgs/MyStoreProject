package com.tad.tests;

import com.tad.base.TestBase;
import com.tad.pages.CreateAccountPage;
import com.tad.pages.HomePage;
import com.tad.pages.LoginPage;
import com.tad.util.TestUtil;

public class HomePageTest  {

		

	
	public static void main(String[] args) throws Throwable {
		TestBase tb=new TestBase(TestUtil.CONFIG_FILE_PATH+TestUtil.CONFIG_FILE_NAME);
		HomePage homepage=new HomePage(TestBase.driver);
		LoginPage loginpage=new LoginPage(TestBase.driver);
		CreateAccountPage createaccountpage=new CreateAccountPage(TestBase.driver);
		// Click on Sign In link
		homepage.clickSignIn();
		// Enter email address
		loginpage.enterEmail("qw1e@qwe.com");
		// Click on CreateanAccount button
		loginpage.clickCreateanAccount();
		// Verify Create account page opened
		createaccountpage.verifyCreateAccountPage();
		// Enter the user details for registration
		createaccountpage.createAccountDetails("ss","kumar","pass@123","street1","Delhi","","","","","");
		createaccountpage.clickRegister();
		System.out.println(tb.getPageTitle());
	}
	
}
