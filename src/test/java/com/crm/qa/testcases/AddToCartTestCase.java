package com.crm.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AddToCartPage;
import com.crm.qa.pages.LoginPageTest;

public class AddToCartTestCase extends TestBase{
	AddToCartPage atc;
	LoginPageTest login;
	
	public AddToCartTestCase(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		Assert.assertEquals(new LoginPageTest().addtocart(), "Products");
		atc = new AddToCartPage();
	}
	
	@Test
	public void addingtocartTest(){
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		String title = atc.addtocart();
		Assert.assertEquals(title, "Your Cart");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
