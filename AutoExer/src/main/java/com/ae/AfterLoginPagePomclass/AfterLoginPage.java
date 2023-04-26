package com.ae.AfterLoginPagePomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ae.GenericUtilities.WebDriverUtility;

public class AfterLoginPage extends WebDriverUtility{
	WebDriver driver;
	public AfterLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='#Women']")
	private WebElement WomenLink;
	
	@FindBy(xpath="//a[@href='/category_products/7']")
	private WebElement WomenProdCategorySaree;
	
	@FindBy(xpath="//a[@href='/category_products/1']")
	private WebElement WomenProdCategoryDress;
	
	@FindBy(xpath="//a[@href='/category_products/2']")
	private WebElement WomenProdCategoryTops;
	
	@FindBy(xpath="//a[@href='#Men']")
	private WebElement MenLink;
	
	@FindBy(xpath="//a[@href='/category_products/3']")
	private WebElement MenProdCategoryTShirt;
	
	@FindBy(xpath="//a[@href='/category_products/6']")
	private WebElement MenProdCategoryJeans;
	
	@FindBy(xpath="//a[@href='#Kids']")
	private WebElement KidsLink;
	
	@FindBy(xpath="//a[@href='/category_products/4']")
	private WebElement KidsProdCategoryDress;
	
	@FindBy(xpath="//a[@href='/category_products/5']")
	private WebElement KidsProdCategoryTopsShirts;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getWomenLink() {
		return WomenLink;
	}
	
	public WebElement getWomenprodCategorySaree() {
		return WomenProdCategorySaree;
	}
	public WebElement getWomenprodCategoryDress() {
		return WomenProdCategoryDress;
	}
	public WebElement getWomenprodCategoryIops() {
		return WomenProdCategoryTops;
	}
	
	public WebElement getMenprodCategoryTShirt() {
		return MenProdCategoryTShirt;
	}
	public WebElement getMenprodCategoryJeans() {
		return MenProdCategoryJeans;
	}
	
	public WebElement getKidsprodCategoryDress() {
		return KidsProdCategoryDress;
	}
	public WebElement getMenprodCategoryTopsShirts() {
		return KidsProdCategoryTopsShirts;
	}
	
	/**
	 * 
	 * @throws InterruptedException
	 */
	
	public void clickOnWomenAndSaree() throws InterruptedException
	{
		scrollToWebElement(driver,WomenLink);
		WomenLink.click();
		waitAndClick(WomenProdCategorySaree);
		//ProdCategory.click();
	}

	public void clickOnWomenAndDress() throws InterruptedException
	{
		scrollToWebElement(driver,WomenLink);
		WomenLink.click();
		waitAndClick(WomenProdCategoryDress);
		//ProdCategory.click();
	}
	
	public void clickOnWomenAndTops() throws InterruptedException
	{
		scrollToWebElement(driver,WomenLink);
		WomenLink.click();
		waitAndClick(WomenProdCategoryTops);
		//ProdCategory.click();
	}
	
	public void clickOnMenAndTShirt() throws InterruptedException
	{
		scrollToWebElement(driver,MenLink);
		MenLink.click();
		waitAndClick(MenProdCategoryTShirt);
		//ProdCategory.click();
	}
	
	public void clickOnMenAndJeans() throws InterruptedException
	{
		scrollToWebElement(driver,MenLink);
		MenLink.click();
		waitAndClick(MenProdCategoryJeans);
		//ProdCategory.click();
	}
	
	public void clickOnKidsDress() throws InterruptedException
	{
		scrollToWebElement(driver,KidsLink);
		KidsLink.click();
		waitAndClick(KidsProdCategoryDress);
		//ProdCategory.click();
	}
	
	public void clickOnKidsAndTopsShirts() throws InterruptedException
	{
		scrollToWebElement(driver,KidsLink);
		KidsLink.click();
		waitAndClick(KidsProdCategoryTopsShirts);
		//ProdCategory.click();
	}
	

}
