package com.ShoppersStack_Rushi_Test_Scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShoppersStack_GenericUtility.Base_Test;
import com.ShoppersStack_POM.AddressFormPage;
import com.ShoppersStack_POM.MyAddressPage;
import com.ShoppersStack_POM.MyProfilePage;

public class TC_001_Verify_user_is_able_to_addAddress_or_notTest extends Base_Test  {
@Test
public void addAddress() throws InterruptedException, EncryptedDocumentException, IOException {
	Thread.sleep(2000);
	homepage.getAccountsettingsbtn().click();
	homepage.getMyprofile().click();
	
	MyProfilePage myProfiePage=new MyProfilePage(driver);
	myProfiePage.getMyaddressbtn().click();
	
	Thread.sleep(2000);
	MyAddressPage myAddressPafes=new MyAddressPage(driver);
	myAddressPafes.getAddaddressbtn().click();
	
	AddressFormPage addressFormPage=new AddressFormPage(driver);
	
	addressFormPage.getOffice().click();
	addressFormPage.getNametextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 0));
	addressFormPage.getHousetextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 1));
	addressFormPage.getStreettextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 2));
	addressFormPage.getLandmarktextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 3));
	webdriverutility.SelectByValue(addressFormPage.getCountryDB(), fileUtility.readPropertyFile("country"));
	webdriverutility.SelectByValue(addressFormPage.getStatetextfield(), fileUtility.readPropertyFile("state"));
	webdriverutility.SelectByValue(addressFormPage.getCitytextfield(), fileUtility.readPropertyFile("city"));
	addressFormPage.getPincodetextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 4));
	addressFormPage.getPhonenumbertextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 5));
	addressFormPage.getAddaddressbtns().click();
}
}
