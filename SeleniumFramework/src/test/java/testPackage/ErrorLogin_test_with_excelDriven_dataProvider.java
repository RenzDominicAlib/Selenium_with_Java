package testPackage;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.Cart_page;
import pageObjects.Landing_page;
import pageObjects.Payment_page;
import pageObjects.ProductCatalog_page;
import pageObjects.Summary_page;
import testComponents.BaseTest_component;

public class ErrorLogin_test_with_excelDriven_dataProvider extends BaseTest_component{
	
	
	
	@Test(dataProvider = "user_login_creds")
	public void incorrectPassword(String username, String Password, String userid) throws InterruptedException, IOException {
	
		LandingPage.login_application(username, Password);
		System.out.println(LandingPage.getLoginErrorMessage());
		System.out.println(username+Password+userid);
		Assert.assertEquals("Incorrect email or password.", LandingPage.getLoginErrorMessage());
	}
	
	
	

}
