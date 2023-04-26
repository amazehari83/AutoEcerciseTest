package com.ae.WomenSareeProductPagePomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ae.GenericUtilities.WebDriverUtility;

public class SareeProductPage extends WebDriverUtility{
	
	
	WebDriver driver;
	public SareeProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h2[text()='Women - Saree Products']")
	private WebElement SareesProdText;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSareesProdText() {
		return SareesProdText;
	}
	
	public String SareeText(WebDriver driver) {
		waitUntilPageLoad(driver);
		return SareesProdText.getText();
		
	}
	
	

}
