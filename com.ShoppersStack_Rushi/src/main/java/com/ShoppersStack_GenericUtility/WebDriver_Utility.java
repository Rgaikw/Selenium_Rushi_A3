package com.ShoppersStack_GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility {
	Java_Utility java_utility=new Java_Utility();
public void SelectByValue(WebElement element,String value) {
	Select sel = new Select(element);
	sel.selectByValue(value);
	
}
public void SelectByIndex(WebElement element,int value) {
	Select sel = new Select(element);
	sel.selectByIndex(value);
}
public void SelectByVisibletext(WebElement element,String text) {
	Select sel=new Select(element);
	sel.selectByVisibleText(text);
}
public void DeselectByIndex(WebElement element,int value) {
	Select sel = new Select(element);
	sel.deselectByIndex(value);
}
public void deSelectByValue(WebElement element,String value) {
	Select sel = new Select(element);
	sel.deselectByValue(value);
}
public void deSelectByVisibleText(WebElement element,String value) {
	Select sel = new Select(element);
	sel.deselectByVisibleText(value);
}
public void deSelectAll(WebElement element) {
	Select sel = new Select(element);
	sel.deselectAll();
}
public void WebpageScreenshot(WebDriver driver) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File(FrameworkConstants.screenshotpath + java_utility.dateAndTime() + ".png");
	FileHandler.copy(temp, dest);

}

public void webElementScreenShot(WebElement element) throws IOException {

	File temp = element.getScreenshotAs(OutputType.FILE);
	File dest = new File(FrameworkConstants.screenshotpath+java_utility.dateAndTime()+".png");
	FileHandler.copy(temp, dest);
}

public void JsScroll(WebDriver driver,WebElement element) {
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);" ,element);
}

}
 