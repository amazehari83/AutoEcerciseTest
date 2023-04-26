package com.ae.men.categoryTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ae.AfterLoginPagePomclass.AfterLoginPage;
import com.ae.AutomationExcercisehomepagePomclass.AutoExerHomePage;
import com.ae.GenericUtilities.BaseClass;
import com.ae.MenJeansProductPagePomclass.MenJeansProductPage;

public class MenJeansProductTest extends BaseClass{
	String actualName = "MEN - JEANS PRODUCTS";
	@Test
	public void loginToAp() throws InterruptedException{
		AutoExerHomePage autoExerhomePage=new AutoExerHomePage(driver);
		AfterLoginPage afterloginpage = new AfterLoginPage(driver);
		afterloginpage.clickOnMenAndJeans();
		MenJeansProductPage menjeansproductpage = new MenJeansProductPage(driver);
		String expectedName = menjeansproductpage.JeansText(driver);
		
		
	}
	

}
