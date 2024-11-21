package com.ShoppersStack_Rushi_Test_Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppersStack_GenericUtility.Base_Test;
import com.ShoppersStack_POM.CartPage;
import com.ShoppersStack_POM.DeliveryaddressPage;
import com.ShoppersStack_POM.SelectPaymentTypePage;

public class TC_003_Verify_user_is_able_to_PlaceAnOrder_or_notTest extends Base_Test {
	@Test
	public void placeAnOrder() throws InterruptedException, IOException {
		Thread.sleep(1000);
		webdriverutility.JsScroll(driver, homepage.getFeaturedProduct());
		Thread.sleep(3000);
		homepage.getAddToCart().click();
		Thread.sleep(3000);
		homepage.getCartbtn().click();
		Thread.sleep(3000);

		CartPage cartpage = new CartPage(driver);
		cartpage.getBynowbtn().click();

		DeliveryaddressPage deliveryaddresspage = new DeliveryaddressPage(driver);
		Thread.sleep(2000);
		deliveryaddresspage.getRadioBtn().click();
		Thread.sleep(2000);
		deliveryaddresspage.getProceedBtn().click();
		Thread.sleep(2000);

		SelectPaymentTypePage paymentType = new SelectPaymentTypePage(driver);
		paymentType.getCodRadiobtn().click();
		Thread.sleep(1000);
		paymentType.getProceedBtn().click();

		webdriverutility.WebpageScreenshot(driver);
		Thread.sleep(7000);
	}
}
