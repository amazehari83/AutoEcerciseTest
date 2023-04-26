package com.ae.MenTShirtProductPagePomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ae.GenericUtilities.WebDriverUtility;

public class MenTShirtProductPage extends WebDriverUtility{
	WebDriver driver;
	public MenTShirtProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[text()='Men - Tshirts Products']")
	private WebElement MenTShirtProdText;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getTShirtProdText() {
		return MenTShirtProdText;
	}
	
	public String TShirtText(WebDriver driver) {
		waitUntilPageLoad(driver);
		return MenTShirtProdText.getText();
		
	}

}
