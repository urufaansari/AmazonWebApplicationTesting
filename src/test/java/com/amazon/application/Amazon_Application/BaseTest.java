package com.amazon.application.Amazon_Application;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {

	public static WebDriver driver = null;

	@BeforeClass
	public void initialize() throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Urufa/eclipse-workspace/Amazon-Application/resources/chromedriver.exe");

		driver = new ChromeDriver();

		// To maximize browser
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("https://www.amazon.in");

		String verifyBrowserStackTitle = driver.getTitle();
		assertEquals(
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in",
				verifyBrowserStackTitle);

	}

	@AfterClass // Test cleanup
	public void TeardownTest() {
		BaseTest.driver.quit();
	}

}
