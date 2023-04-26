package com.ae.KidsTopsShirtProductPagePomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ae.GenericUtilities.WebDriverUtility;

public class KidsTopsProductPage extends WebDriverUtility{
	WebDriver driver;
	public KidsTopsProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[text()='Kids - Tops & Shirts Products']")
	private WebElement KidsTopsShirtProdText;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getKidsTopsShirtProdText() {
		return KidsTopsShirtProdText;
	}
	
	public String KidsTopsText(WebDriver driver) {
		waitUntilPageLoad(driver);
		return KidsTopsShirtProdText.getText();
		
	}

}
