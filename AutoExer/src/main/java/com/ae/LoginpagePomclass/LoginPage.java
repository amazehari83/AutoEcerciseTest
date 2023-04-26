package com.ae.LoginpagePomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ae.AutomationExcercisehomepagePomclass.AutoExerHomePage;
import com.ae.GenericUtilities.WebDriverUtility;

public class LoginPage extends WebDriverUtility{
	WebDriver driver;
public LoginPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@data-qa='login-email']")
private WebElement loginEmail;

@FindBy(xpath = "//input[@data-qa='login-password']")
private WebElement loginPass;

@FindBy(xpath = "//button[@data-qa='login-button']")
private WebElement SubmitBtn;

/*
public AutoExerHomePage login(String username, String password)
{
	//waitAndClick(username);
	loginEmail.sendKeys(username);
	//waitAndClick(password);
	loginPass.sendKeys(password);
	/*
	try {
		waitAndClick(SubmitBtn);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	*/
/*	
SubmitBtn.click();
	return new AutoExerHomePage(driver);
}
*/

public AutoExerHomePage login(String username, String password)
{
	//waitAndClick(username);
	loginEmail.sendKeys(username);
	
	loginPass.sendKeys(password);
	SubmitBtn.click();
	return new AutoExerHomePage(driver);
}


}