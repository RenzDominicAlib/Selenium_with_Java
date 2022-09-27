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

public class ErrorLogin_test_with_dataProvider extends BaseTest_component{
	
	
	
	@Test(dataProvider = "getData", groups= {"data provided test"})
	public void incorrectPassword(String username, String Password) throws InterruptedException, IOException {
	
		LandingPage.login_application(username, Password);
		System.out.println(LandingPage.getLoginErrorMessage());
		Assert.assertEquals("Incorrect email or password.", LandingPage.getLoginErrorMessage());
	}
	
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		
		data[0][0]= "renz@example.com";
		data[0][1]= "Renz@071526";
		
		data[1][0]= "INCORRECT@example.com";
		data[1][1]= "Renz@0715";
		
		data[2][0]= "INCORRECT@example.com";
		data[2][1]= "Renz@071526";
		
		return data;
	}
	
	

}
