package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryaddressPage {
public DeliveryaddressPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//input[@type='radio']")
private WebElement radioBtn;

@FindBy(xpath="//button[text()='Proceed']")
private WebElement proceedBtn;

public WebElement getRadioBtn() {
	return radioBtn;
}

public WebElement getProceedBtn() {
	return proceedBtn;
}


}


