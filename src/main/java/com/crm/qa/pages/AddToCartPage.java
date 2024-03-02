package com.crm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class AddToCartPage extends TestBase{ 
	//Page Factory - OR:
	
	@FindBy(xpath="(//div[@class = 'inventory_item_price'])[1]")
	WebElement itemprice;
	@FindBy(xpath="(//div[@class = 'inventory_item_name '])[1]")
	WebElement itemname;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement addtocart;
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cartlink;
	@FindBy(xpath="//span[contains(text(),'Your Cart')]")
	WebElement carttile;
	
	//Initializing the Page Objects:
	public AddToCartPage(){
		PageFactory.initElements(driver, this);
	}
	
	// Actions or the methods for add to cart page
	public String addtocart() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		
		String itempr = itemprice.getText();
		String itemnm =  itemname.getText();
		
		System.out.println(itempr + "," + itemnm);
		
		addtocart.click();
		cartlink.click();
		
		return carttile.getText();
		
	}	
}