package com.ae.kids.categoryTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ae.AfterLoginPagePomclass.AfterLoginPage;
import com.ae.AutomationExcercisehomepagePomclass.AutoExerHomePage;
import com.ae.GenericUtilities.BaseClass;
import com.ae.KidsDressProductPagePomclass.KidsDressProductPage;

public class KidsDressProductTest extends BaseClass{
	String actualName = "KIDS - DRESS PRODUCTS";
	
	@Test
	public void loginToAp() throws InterruptedException{
		AutoExerHomePage autoExerhomePage=new AutoExerHomePage(driver);
		AfterLoginPage afterloginpage = new AfterLoginPage(driver);
		afterloginpage.clickOnKidsAndTopsShirts();
		KidsDressProductPage kidsdresspage = new KidsDressProductPage(driver);
		String expectedName = kidsdresspage.KidsDressText(driver);
		
		
	}

}
