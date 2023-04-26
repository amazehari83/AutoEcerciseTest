package com.ae.men.categoryTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ae.AfterLoginPagePomclass.AfterLoginPage;
import com.ae.AutomationExcercisehomepagePomclass.AutoExerHomePage;
import com.ae.GenericUtilities.BaseClass;
import com.ae.MenTShirtProductPagePomclass.MenTShirtProductPage;

public class MenTShirtProductTest extends BaseClass{
	
	String actualName = "MEN - TSHIRTS PRODUCTS";
	@Test
	public void loginToAp() throws InterruptedException{
		AutoExerHomePage autoExerhomePage=new AutoExerHomePage(driver);
		AfterLoginPage afterloginpage = new AfterLoginPage(driver);
		afterloginpage.clickOnMenAndTShirt();
		MenTShirtProductPage mentshirtpage = new MenTShirtProductPage(driver);
		String expectedName = mentshirtpage.TShirtText(driver);
		System.out.println("Actual Name is: "+actualName);
		System.out.println("Expected Name is: "+expectedName);
		Assert.assertEquals(actualName, expectedName);
	}

}
