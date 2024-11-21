package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressFormPage {
public AddressFormPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(id="Office")
private WebElement office;

@FindBy(id="Name")
private WebElement nametextfield;

@FindBy(id="House/Office Info")
private WebElement housetextfield;

@FindBy(id="Street Info")
private WebElement streettextfield;

@FindBy(id="Landmark")
private WebElement landmarktextfield;

@FindBy(id="Country")
private WebElement countryDB;

@FindBy(id="State")
private WebElement statetextfield;

@FindBy (id="City")
private WebElement citytextfield;

@FindBy (id="Pincode")
private WebElement pincodetextfield;

@FindBy(id="Phone Number")
private WebElement phonenumbertextfield;

@FindBy (xpath = "//button[text()='Add Address']")
private WebElement addaddressbtns;

public WebElement getOffice() {
	return office;
}

public WebElement getNametextfield() {
	return nametextfield;
}

public WebElement getHousetextfield() {
	return housetextfield;
}

public WebElement getStreettextfield() {
	return streettextfield;
}

public WebElement getLandmarktextfield() {
	return landmarktextfield;
}

public WebElement getCountryDB() {
	return countryDB;
}

public WebElement getStatetextfield() {
	return statetextfield;
}

public WebElement getCitytextfield() {
	return citytextfield;
}

public WebElement getPincodetextfield() {
	return pincodetextfield;
}

public WebElement getPhonenumbertextfield() {
	return phonenumbertextfield;
}
public WebElement getAddaddressbtns() {
	return addaddressbtns;
}
}
