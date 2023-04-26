package com.ae.WomenTopsProductPagePomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ae.GenericUtilities.WebDriverUtility;

public class TopsProductPage extends WebDriverUtility{
	WebDriver driver;
	public TopsProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[text()='Women - Tops Products']")
	private WebElement TopsProdText;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getTopsProdText() {
		return TopsProdText;
	}
	
	public String TopsText(WebDriver driver) {
		waitUntilPageLoad(driver);
		return TopsProdText.getText();
		
	}

}
