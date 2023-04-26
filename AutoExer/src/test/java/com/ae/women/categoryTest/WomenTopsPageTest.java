package com.ae.women.categoryTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ae.AfterLoginPagePomclass.AfterLoginPage;
import com.ae.AutomationExcercisehomepagePomclass.AutoExerHomePage;
import com.ae.GenericUtilities.BaseClass;
import com.ae.WomenSareeProductPagePomclass.SareeProductPage;
import com.ae.WomenTopsProductPagePomclass.TopsProductPage;

public class WomenTopsPageTest extends BaseClass{
	String actualName = "WOMEN - TOPS PRODUCTS";
	@Test
	public void loginToAp() throws InterruptedException {
		AutoExerHomePage autoExerhomePage=new AutoExerHomePage(driver);


		AfterLoginPage afterloginpage = new AfterLoginPage(driver);
		afterloginpage.clickOnWomenAndTops();
		TopsProductPage topsprodpage = new TopsProductPage(driver);
		String expectedName = topsprodpage.TopsText(driver);
		System.out.println("Actual Name is: "+actualName);
		System.out.println("Expected Name is: "+expectedName);
		Assert.assertEquals(actualName, expectedName);

	}
}
