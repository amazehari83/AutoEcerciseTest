package com.ae.women.categoryTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ae.AfterLoginPagePomclass.AfterLoginPage;
import com.ae.AutomationExcercisehomepagePomclass.AutoExerHomePage;
import com.ae.LoginpagePomclass.LoginPage;
import com.ae.WomenSareeProductPagePomclass.SareeProductPage;
import com.ae.GenericUtilities.BaseClass;

public class WomenSareesPageTest extends BaseClass {
	String actualName = "WOMEN - SAREE PRODUCTS";
	@Test
	public void loginToAp() throws InterruptedException {
		AutoExerHomePage autoExerhomePage=new AutoExerHomePage(driver);
		
		
	AfterLoginPage afterloginpage = new AfterLoginPage(driver);
	afterloginpage.clickOnWomenAndSaree();
	SareeProductPage sareeprodpage = new SareeProductPage(driver);
	String expectedName = sareeprodpage.SareeText(driver);
	System.out.println("Actual Name is: "+actualName);
	System.out.println("Expected Name is: "+expectedName);
	Assert.assertEquals(actualName, expectedName);
		
	}

}
