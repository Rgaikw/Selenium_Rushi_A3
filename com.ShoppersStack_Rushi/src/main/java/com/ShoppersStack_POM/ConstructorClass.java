package com.ShoppersStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ConstructorClass {

public 	ConstructorClass(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}
