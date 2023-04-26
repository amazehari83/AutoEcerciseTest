package com.ae.KidsDressProductPagePomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ae.GenericUtilities.WebDriverUtility;

public class KidsDressProductPage extends WebDriverUtility{
	WebDriver driver;
	public KidsDressProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[text()='Kids - Dress Products']")
	private WebElement KidsDressProdText;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getKidsDressProdText() {
		return KidsDressProdText;
	}
	
	public String KidsDressText(WebDriver driver) {
		waitUntilPageLoad(driver);
		return KidsDressProdText.getText();
		
	}

}
