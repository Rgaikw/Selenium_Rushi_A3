package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
public HomePage (WebDriver driver) {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//span[contains(@class,'BaseBadge-badge MuiBadge')]")
private WebElement Accountsettingsbtn;

@FindBy(xpath="//li[text()='My Profile']")
private WebElement myprofile;

@FindBy(xpath="//li[text()='Logout']")
private WebElement logoutbtn;

@FindBy(id="search")
private WebElement searchbtn;

@FindBy(xpath = "//h1[text()='Featured Products']")
private WebElement featuredProduct;


public WebElement getFeaturedProduct() {
	return featuredProduct;
}

@FindBy(xpath = "(//button[text()='add to cart'])[1]")
private WebElement addToCart;


@FindBy(xpath ="//a[@id='cart']")
private WebElement cartbtn;


public WebElement getAccountsettingsbtn() {
	return Accountsettingsbtn;
}


public WebElement getMyprofile() {
	return myprofile;
}


public WebElement getLogoutbtn() {
	return logoutbtn;
}


public WebElement getSearchbtn() {
	return searchbtn;
}


public WebElement getAddToCart() {
	return addToCart;
}


public WebElement getCartbtn() {
	return cartbtn;
}





}

