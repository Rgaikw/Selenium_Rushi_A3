package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddressPage {
public MyAddressPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//button[text()='Add Address']")
private WebElement Addaddressbtn;

@FindBy(xpath ="(//span[contains(@class,'MuiButton-startIcon MuiButton-iconSizeSmall css-u0g51i')])[4]")
private WebElement Deletebtn;

@FindBy(xpath ="(//button[text()='Yes'])[2]")
private WebElement yesbtn;

public WebElement getAddaddressbtn() {
	return Addaddressbtn;
}

public WebElement getDeletebtn() {
	return Deletebtn;
}

public WebElement getYesbtn() {
	return yesbtn;
}
}
