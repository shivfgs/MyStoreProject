package com.tad.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonAction {
	private WebDriver driver;
	
	public void hoverWebElement(WebElement webElement) {
		Actions builder = new Actions(driver);
		builder.moveToElement(webElement).perform();
	}
	
	public void clickWebElement(WebElement webElement) {
		webElement.click();
	}
	
	public CommonAction(WebDriver driver) throws Exception {
		this.driver=driver;
	
	}

	
}
