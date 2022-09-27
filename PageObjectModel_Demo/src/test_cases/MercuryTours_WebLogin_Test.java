package test_cases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import object_repository.MercuryTours_Login_Page;
import object_repository.MercuryTours_Register_Page;

public class MercuryTours_WebLogin_Test {

	@Test
	public void mercuryTours_login() {
// Scenario: 1. Input unregistered Username and Password
//			 2. Click Submit
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\Users\\\\\\\\renz dominic alib\\\\\\\\eclipse-workspace\\\\\\\\driver\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		driver.getTitle();
		
		MercuryTours_Login_Page loginPage = new MercuryTours_Login_Page(driver);
		
		loginPage.userName().sendKeys("RenzD");
		loginPage.passWord().sendKeys("Test123");
		loginPage.submit().click();
		Assert.assertTrue(true, loginPage.error_prompt().getText());

	}
	
	@Test
	public void mercuryTours_register() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\Users\\\\\\\\renz dominic alib\\\\\\\\eclipse-workspace\\\\\\\\driver\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		driver.getTitle();
		
		MercuryTours_Login_Page loginPage = new MercuryTours_Login_Page(driver);
		loginPage.register().click();
		
		
		MercuryTours_Register_Page registerPage = new MercuryTours_Register_Page(driver);
		registerPage.fName_field().sendKeys("Renz Dominic");
		registerPage.lName_field().sendKeys("Alib");
		registerPage.phone_field().sendKeys("09989278211");
		registerPage.email_field().sendKeys("raaslib@ya.com");
		registerPage.address_field().sendKeys("Dummydetails");
		registerPage.city_field().sendKeys("Dummydetails");
		registerPage.state_field().sendKeys("Dummydetails");
		registerPage.postalCode_field().sendKeys("Dummydetails");
		registerPage.country_drpdwn().selectByVisibleText("PHILIPPINES");
		registerPage.username().sendKeys("Rdca123");
		registerPage.password().sendKeys("Rdca123");
		registerPage.confirmPassword().sendKeys("Rdca123");
		
	}

}
