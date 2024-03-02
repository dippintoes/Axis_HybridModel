package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class CheckOutStep2 extends TestBase {
	AddToCartPage atcpage;
	
	@FindBy(xpath="//div[@class='inventory_item_name']")
	WebElement cartname;
	
	@FindBy(xpath="//div[@class='inventory_item_price']")
	WebElement cartprice;
	
	@FindBy(xpath="//button[@id='finish']")
	WebElement finish;
	
	@FindBy(xpath="//span[contains(text(),'Checkout: Complete!')]")
	WebElement title;
	
	//Initializing the Page Objects:
	public CheckOutStep2(){
		PageFactory.initElements(driver, this);
	}
	
	// Actions or the methods for add to cart page
		public String cartdetails() {
			String itempr1 = cartname.getText();
			String itemnm1 =  cartprice.getText();
			
//	        Assert.assertEquals(itempr1, atcpage.itemname, "Item price does not match after adding to cart");
//	        Assert.assertEquals(itemnm1, atcpage.itemprice, "Item name does not match after adding to cart");
//			
	        finish.click();
	        
	        return title.getText();
		}	
}
