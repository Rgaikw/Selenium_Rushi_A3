package com.ShoppersStack_GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ShoppersStack_POM.HomePage;
import com.ShoppersStack_POM.LoginPage;
import com.ShoppersStack_POM.WelcomePage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base_Test {
	public File_Utility fileUtility = new File_Utility();// to access non static method fileutility
	public Java_Utility java_utility = new Java_Utility();
	public WebDriver driver;
	public static WebDriver sdriver;
	public ExtentSparkReporter spark;
	public ExtentReports reports;
	public ExtentTest test;
	public WelcomePage welcomePage;
	public LoginPage loginPage;
	public HomePage homepage;
	public WebDriverWait wait;
	public WebDriver_Utility webdriverutility = new WebDriver_Utility();

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@Before Suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("@Before Test");
		spark = new ExtentSparkReporter(FrameworkConstants.extentReportsPath + java_utility.dateAndTime() + ".html");
		reports = new ExtentReports();
		reports.attachReporter(spark);
	}

	@BeforeClass
	public void beforeClass() throws IOException, InterruptedException {
		System.out.println("@BeforeClass");
		
		String browser = fileUtility.readPropertyFile("browserName");
		String url = fileUtility.readPropertyFile("url");
//		String browser=System.getProperty("browserName");
//		String url=System.getProperty("url");

		if (browser.contains("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.contains("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.contains("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Enter Valid Browser Name");
		}
		sdriver = driver;
		homepage = new HomePage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get(url);
	}

	@BeforeMethod
	public void beforeMethod() throws IOException, InterruptedException {
		System.out.println("@Before Method");
		String userName = fileUtility.readPropertyFile("username");
		String password = fileUtility.readPropertyFile("password");

		welcomePage = new WelcomePage(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions.elementToBeClickable(welcomePage.getLoginbtn()));
		Thread.sleep(3000);

		welcomePage.getLoginbtn().click();

		loginPage = new LoginPage(driver);
		loginPage.getEmail().sendKeys(userName);
		loginPage.getPassword().sendKeys(password);
		loginPage.getLoginbtn().click();

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@After Method");
		homepage.getAccountsettingsbtn().click();
		homepage.getLogoutbtn().click();
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		System.out.println("@After Class");
		Thread.sleep(3000);
		driver.quit();

	}

	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest");
		reports.flush();// report will be stored inside report folder
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("@After Suite");
	}

}
