package com.ae.AutomationExcercisehomepagePomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

import com.ae.GenericUtilities.WebDriverUtility;

public class AutoExerHomePage extends WebDriverUtility {
WebDriver driver;
public AutoExerHomePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[@href='/login']")
private WebElement loginLink;

@FindBy(xpath = "//a[text()='Sign Out']")
private WebElement signOutLink;

public WebElement getLoginLink() {
	return loginLink;
}

public void setLoginLink(WebElement loginLink) {
	this.loginLink = loginLink;
}

public void clickLoginLink() {
	loginLink.click();
	//return null;
}



}
