package com.crm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class checkoutPage extends TestBase{
	
AddToCartPage atcpage;
	
	@FindBy(xpath="//div[@class='inventory_item_name']")
	WebElement cartname;
	
	@FindBy(xpath="//div[@class='inventory_item_price']")
	WebElement cartprice;
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkout;
	
	@FindBy(xpath="//div[@class='cart_quantity']")
	WebElement qty;
	
	@FindBy(xpath="//span[contains(text(),'Checkout: Your Information')]")
	WebElement pgtitle;
	
	//Initializing the Page Objects:
	public checkoutPage(){
		PageFactory.initElements(driver, this);
	}
	
	// Actions or the methods for add to cart page
	public String addtocart() {
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.MILLISECONDS);
		String itempr1 = cartname.getText();
		String itemnm1 =  cartprice.getText();
		
//        Assert.assertEquals(itempr1, atcpage.itemname, "Item price does not match after adding to cart");
//        Assert.assertEquals(itemnm1, atcpage.itemprice, "Item name does not match after adding to cart");
		
        checkout.click();
        
        return pgtitle.getText();
	}	
}
