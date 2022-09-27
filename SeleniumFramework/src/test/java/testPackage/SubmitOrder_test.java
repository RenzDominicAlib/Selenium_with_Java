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
import pageObjects.MyOrder_page;
import pageObjects.Payment_page;
import pageObjects.ProductCatalog_page;
import pageObjects.Summary_page;
import testComponents.BaseTest_component;

public class SubmitOrder_test extends BaseTest_component{
	
	String[] itemsNeed = { "ZARA COAT 3", "ADIDAS ORIGINAL", "IPHONE 13 PRO"};
	
	@Test
	public void submitOrder() throws InterruptedException, IOException {
		// renz@example.com
		// Renz@0715
	
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
//		driver.manage().window().maximize();	
//		Landing_page LandingPage = new Landing_page(driver);	
//		LandingPage.goTo("https://rahulshettyacademy.com/client/");
//		Landing_page LandingPage = launchApplication();
		
		
		ProductCatalog_page ProductCatalogPage = LandingPage.login_application("renz@example.com", "Renz@0715");	
		ProductCatalogPage.itemsAddingToCart(itemsNeed);		
		Cart_page CartPage = ProductCatalogPage.gotoCartPage();
		boolean IsItemsNeedMatchToCartList = CartPage.verifyItemsDisplay(itemsNeed);
		Assert.assertTrue(IsItemsNeedMatchToCartList);
		CartPage.scrollToBottom();	
		Payment_page PaymentPage = CartPage.clickCheckout();
		PaymentPage.populateCountryUsingInitials("ph");
		PaymentPage.clickInitialSuggestion();			
		Summary_page SummaryPage = PaymentPage.clickPlaceOrder();
		Boolean isSuccessMessageVisible = SummaryPage.validateHeaderMessage();
		Assert.assertTrue(isSuccessMessageVisible);
		System.out.println("***Execution Completed***");
		
		
//		driver.close();
//		SummaryPage.closeBrowser();
	}
	
	
	
	@Test(dependsOnMethods = {"submitOrder"})
	public void orderHistory() {
		ProductCatalog_page ProductCatalogPage = LandingPage.login_application("renz@example.com", "Renz@0715");
		MyOrder_page MyOrderPage = ProductCatalogPage.gotoMyOrders();
		boolean IsItemsNeedMatchToMyOrders = MyOrderPage.verifyMyOrdersDisplay(itemsNeed);
		Assert.assertTrue(IsItemsNeedMatchToMyOrders);
		
	}

}
