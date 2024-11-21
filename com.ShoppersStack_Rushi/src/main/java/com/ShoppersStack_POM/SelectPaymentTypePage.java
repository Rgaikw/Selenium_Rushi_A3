package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPaymentTypePage {
public SelectPaymentTypePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "(//input[@name='radio-buttons-group'])[1]")
private WebElement netBankingRadioBtn;

@FindBy(xpath = "(//input[@name='radio-buttons-group'])[2]")
private WebElement codRadiobtn;

@FindBy(xpath = "//button[text()='Proceed']")
private WebElement proceedBtn;




public WebElement getProceedBtn() {
	return proceedBtn;
}

public WebElement getNetBankingRadioBtn() {
	return netBankingRadioBtn;
}

public WebElement getCodRadiobtn() {
	return codRadiobtn;
}



}
