package com.ae.WomenDressProductPagePomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ae.GenericUtilities.WebDriverUtility;

public class WomensDressProductPage extends WebDriverUtility{
	
	WebDriver driver;
	
	public WomensDressProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[text()='Women - Dress Products']")
	private WebElement WomenDressProdText;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getDressProdText() {
		return WomenDressProdText;
	}
	
	public String DressText(WebDriver driver) {
		waitUntilPageLoad(driver);
		return WomenDressProdText.getText();
		
	}
}
