package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//span[text()='Buy Now']")
	private WebElement bynowbtn;
	
	@FindBy(xpath="//span[contains(@class,'MuiButton-startIcon MuiButton')]")
			private WebElement removeFromCartBtn;
	@FindBy(xpath = "//span[text()='Continue Shopping']")
	private WebElement continueShoppingBtn;
	public WebElement getBynowbtn() {
		return bynowbtn;
	}
	public WebElement getRemoveFromCartBtn() {
		return removeFromCartBtn;
	}
	public WebElement getContinueShoppingBtn() {
		return continueShoppingBtn;
	}
}
