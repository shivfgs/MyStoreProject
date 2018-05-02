package com.tad.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.tad.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws Exception {
		
		prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\tempshisi\\eclipse-workspace\\TestAutoDemo\\src\\com\\tad\\config\\config.properties");
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
			
	}
	
	public void initialization(String browserName) throws Exception {
		if (browserName.equalsIgnoreCase("FireFox")) {
			driver=new FirefoxDriver();	
			System.out.println("Starting Firefox driver.");
			}
			else if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:/Users/tempshisi/Downloads/chromedriver_win32/chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "C:/Users/tempshisi/Downloads/IEDriverServer_x64_3.11.1/IEDriverServer.exe");
				driver=new InternetExplorerDriver();
				//driver=new FirefoxDriver();
				System.out.println("Starting IE driver.");
			}
			else {
				throw new Exception("Browser selection is wrong.");
				
			}
			
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAITTIME, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
			
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}

}
