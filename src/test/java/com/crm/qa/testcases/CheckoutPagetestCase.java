package com.crm.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AddToCartPage;
import com.crm.qa.pages.LoginPageTest;
import com.crm.qa.pages.checkoutPage;

public class CheckoutPagetestCase extends TestBase{
	LoginPageTest login;
	AddToCartPage atc;
	checkoutPage ci;
	
	public CheckoutPagetestCase(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		Assert.assertEquals(new LoginPageTest().addtocart(), "Products");
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.MILLISECONDS);
		Assert.assertEquals(new AddToCartPage().addtocart(), "Your Cart");
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.MILLISECONDS);
		ci = new checkoutPage();	
	}
	
	@Test
	public void addingdetails(){
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.MILLISECONDS);
		String title = ci.addtocart();
		Assert.assertEquals(title, "Checkout: Your Information");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}