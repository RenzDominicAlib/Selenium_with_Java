package abstractComponents;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.Cart_page;
import pageObjects.MyOrder_page;

public class Abstract_component {
	
	WebDriver driver;
	public Abstract_component(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	
	By goToCartPage_btn = By.xpath("//button[contains(@routerlink, 'cart')]");
	By goToMyOrders_btn = By.xpath("//button[contains(@routerlink, 'myorders')]");
	
	public Cart_page gotoCartPage() {
		driver.findElement(goToCartPage_btn).click();
		Cart_page CartPage = new Cart_page(driver);
		return CartPage;
	}
	
	public MyOrder_page gotoMyOrders() {
		driver.findElement(goToMyOrders_btn).click();
		MyOrder_page MyOrderPage = new MyOrder_page(driver);
		return MyOrderPage;
	}
	
	
	public void waitForElementToAppear(By locator) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(5000));
		w.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void waitForElementToInvisible(By locator) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(5000));
		w.until(ExpectedConditions.invisibilityOf(driver.findElement(locator)));
	}
	
	public void actionsMovetoElementThenClick(By locator) {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(locator)).click().build().perform();;
	}
	
	

}
