package com.ae.kids.categoryTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ae.AfterLoginPagePomclass.AfterLoginPage;
import com.ae.AutomationExcercisehomepagePomclass.AutoExerHomePage;
import com.ae.GenericUtilities.BaseClass;
import com.ae.KidsTopsShirtProductPagePomclass.KidsTopsProductPage;

public class KidsTopsShirtProductTest extends BaseClass{
	String actualName = "KIDS - TOPS & SHIRTS PRODUCTS";
	@Test
	public void loginToAp() throws InterruptedException{
		AutoExerHomePage autoExerhomePage=new AutoExerHomePage(driver);


		AfterLoginPage afterloginpage = new AfterLoginPage(driver);
		afterloginpage.clickOnKidsAndTopsShirts();
		KidsTopsProductPage kidstopsprodpage = new KidsTopsProductPage(driver);
		String expectedName = kidstopsprodpage.KidsTopsText(driver);
		System.out.println("Actual Name is: "+actualName);
		System.out.println("Expected Name is: "+expectedName);
		Assert.assertEquals(actualName, expectedName);
		
		
	}

}
