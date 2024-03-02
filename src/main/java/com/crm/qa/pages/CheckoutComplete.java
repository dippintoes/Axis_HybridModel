package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class CheckoutComplete extends TestBase{
	@FindBy(xpath="//h2[contains(text(),'Thank you for your order!')]")
	WebElement thanks;
	
	//Initializing the Page Objects:
	public CheckoutComplete(){
		PageFactory.initElements(driver, this);
	}
	
	// Actions or the methods for add to cart page
	public String addtocart() {
		return thanks.getText();
	}	
}
