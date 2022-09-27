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
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.Cart_page;
import pageObjects.Landing_page;
import pageObjects.Payment_page;
import pageObjects.ProductCatalog_page;
import pageObjects.Summary_page;
import testComponents.BaseTest_component;

public class ErrorLogin_test extends BaseTest_component{
	
	
	
	@Test
	public void incorrectPassword() throws InterruptedException, IOException {
		// renz@example.com
		// Renz@071526   ---> Incorrect password
	
		LandingPage.login_application("renz@example.com", "Renz@071526");
		System.out.println(LandingPage.getLoginErrorMessage());
		Assert.assertEquals("Incorrect email or password.", LandingPage.getLoginErrorMessage());
	}
	
	
	@Test
	public void incorrectEmail() throws InterruptedException, IOException {
		// INCORRECT@example.com    ---> Incorrect email
		// Renz@0715
	
		LandingPage.login_application("INCORRECT@example.com", "Renz@0715");
		System.out.println(LandingPage.getLoginErrorMessage());
		Assert.assertEquals("Incorrect email or password.", LandingPage.getLoginErrorMessage());
	}
	
	@Test (groups = {"negativeTest"})
	public void incorrectEmailAndPassword() throws InterruptedException, IOException {
		// INCORRECT@example.com    ---> Incorrect email
		// Renz@071526   ---> Incorrect password
	
		LandingPage.login_application("INCORRECT@example.com", "Renz@071526");
		System.out.println(LandingPage.getLoginErrorMessage());
		Assert.assertEquals("Incorrect email or password.", LandingPage.getLoginErrorMessage());
	}
	
	

}
