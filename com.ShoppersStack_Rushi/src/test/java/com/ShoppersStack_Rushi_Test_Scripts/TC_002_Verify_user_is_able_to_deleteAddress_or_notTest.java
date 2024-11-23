package com.ShoppersStack_Rushi_Test_Scripts;


import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppersStack_GenericUtility.Base_Test;
import com.ShoppersStack_POM.MyAddressPage;
import com.ShoppersStack_POM.MyProfilePage;

public class TC_002_Verify_user_is_able_to_deleteAddress_or_notTest extends Base_Test {
@Test
public void deleteAddress() throws InterruptedException, IOException {
	homepage.getAccountsettingsbtn().click();
	homepage.getMyprofile().click();
	
	MyProfilePage myProfilePage= new MyProfilePage(driver);
	myProfilePage.getMyaddressbtn().click();
	Thread.sleep(2000);
	MyAddressPage myAddressPage=new MyAddressPage(driver);
	myAddressPage.getDeletebtn().click();
	Thread.sleep(2000);
	myAddressPage.getYesbtn().click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	webdriverutility.WebpageScreenshot(driver);
   }
}
