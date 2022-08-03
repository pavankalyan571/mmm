package Tide;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.Livechat;
import uistore.Searchbox;
import uistore.Testcases;

import utilites.DriverSetup;
import utilites.ExtentReportManager;

public class Tide extends DriverSetup {
	
	public static ExtentReports report;
	public static ExtentTest logger;
	
	// Instantiating the browser
	@Parameters("browser")
	@BeforeClass
	public void driverconfig(String browser) {
		driver = DriverSetup.driverInstantiate(browser);
		report = ExtentReportManager.getReportInstance();

	}
	
	@Test(priority = 1)
	public static void Products() throws InterruptedException  {
		logger = report.createTest("Tide.com");
		logger.log(Status.INFO, "passed");
		Testcases.close(driver).click();
	}
	
	@Test(priority = 2)
	public static void shop() throws InterruptedException  {
		logger = report.createTest("hovering");
		logger.log(Status.INFO, "passed");
		Testcases.shop(driver);
	}
	
	@Test(priority = 3)
	public static void white() throws InterruptedException  {
		logger = report.createTest("hovered on shop products");
		logger.log(Status.INFO, "passed");
		Testcases.liquid(driver);
	}
	
	@Test(priority = 4)
	public static void whites() throws InterruptedException  {
		logger = report.createTest("clicked on whiteness");
		logger.log(Status.INFO, "passed");
		Testcases.whites(driver).click();
	}
	
	@Test(priority = 5)
	public static void text()   {
		logger = report.createTest("whiteness product text");
		logger.log(Status.INFO, "passed");
		Testcases.text(driver);
		utilites.ScreenShot.screenShotTC(driver);
	}
	
	@Test(priority = 6)
	public static void srh()   {
		logger = report.createTest("clicked on search");
		logger.log(Status.INFO, "passed");
		Searchbox.srh(driver);
	}
	
	@Test(priority = 7)
	public static void liquid()   {
		logger = report.createTest("clicked on liquid");
		logger.log(Status.INFO, "passed");
		Searchbox.liquid(driver).click();
	}
	
	@Test(priority = 8)
	public static void liqtext()   {
		logger = report.createTest("liquidtext");
		logger.log(Status.INFO, "passed");
		Searchbox.liqtext(driver);
		utilites.ScreenShot.screenShotTC(driver);
	}
	
	@Test(priority = 9)
	public static void livechat()   {
		logger = report.createTest("clicked livechat");
		logger.log(Status.INFO, "passed");
		Livechat.livechat(driver).click();
	}
	
	@Test(priority = 9)
	public static void livetest()   {
		logger = report.createTest("livechat text");
		logger.log(Status.INFO, "passed");
		Livechat.livetext(driver);
		utilites.ScreenShot.screenShotTC(driver);
	}
	
	
	
	
	// close the driver
	@AfterClass
	public void driverexit() {
		report.flush();
		DriverSetup.driverClose();
	}

}
