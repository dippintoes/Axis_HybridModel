package com.crm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class CheckoutInfo extends TestBase{
		@FindBy(xpath="//input[@id='first-name']")
		WebElement firstname;
		
		@FindBy(xpath="//input[@id='last-name']")
		WebElement lastname;
		
		@FindBy(xpath="//input[@id='postal-code']")
		WebElement postalcode;
		
		@FindBy(xpath="//input[@id='continue']")
		WebElement continueBtn;
		
		@FindBy(xpath="//span[contains(text(),'Checkout: Overview')]")
		WebElement chck;
		
		//Initializing the Page Objects:
		public CheckoutInfo(){
			PageFactory.initElements(driver, this);
		}
		
		// Actions or the methods for add to cart page
		public String addtocart() {
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.MILLISECONDS);
			firstname.sendKeys("Rutuja");
			lastname.sendKeys("Gosavi");
			postalcode.sendKeys("431003");
			
			continueBtn.click();
			
			return chck.getText();
		}	
}
