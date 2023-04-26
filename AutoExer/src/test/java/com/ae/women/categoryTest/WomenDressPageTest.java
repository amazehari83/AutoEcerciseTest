package com.ae.women.categoryTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ae.AfterLoginPagePomclass.AfterLoginPage;
import com.ae.AutomationExcercisehomepagePomclass.AutoExerHomePage;
import com.ae.GenericUtilities.BaseClass;
import com.ae.WomenDressProductPagePomclass.WomensDressProductPage;
import com.ae.WomenTopsProductPagePomclass.TopsProductPage;

public class WomenDressPageTest extends BaseClass{
	String actualName = "WOMEN - DRESS PRODUCTS";
	@Test
	public void loginToAp() throws InterruptedException {
		AutoExerHomePage autoExerhomePage=new AutoExerHomePage(driver);


		AfterLoginPage afterloginpage = new AfterLoginPage(driver);
		afterloginpage.clickOnWomenAndDress();
		WomensDressProductPage dressprodpage = new WomensDressProductPage(driver);
		String expectedName = dressprodpage.DressText(driver);
		System.out.println("Actual Name is: "+actualName);
		System.out.println("Expected Name is: "+expectedName);
		Assert.assertEquals(actualName, expectedName);

	}
	

}
