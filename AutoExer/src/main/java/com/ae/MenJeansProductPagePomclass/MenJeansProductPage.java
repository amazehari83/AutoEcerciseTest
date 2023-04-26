package com.ae.MenJeansProductPagePomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ae.GenericUtilities.WebDriverUtility;

public class MenJeansProductPage extends WebDriverUtility{
	WebDriver driver;
	public MenJeansProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[text()='Men - Jeans Products']")
	private WebElement MenJeansProdText;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getJeansProdText() {
		return MenJeansProdText;
	}
	
	public String JeansText(WebDriver driver) {
		waitUntilPageLoad(driver);
		acceptAlert(driver);
		return MenJeansProdText.getText();
		
	}

}
