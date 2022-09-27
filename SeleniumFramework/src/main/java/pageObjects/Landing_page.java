package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import abstractComponents.Abstract_component;

public class Landing_page extends Abstract_component {

	WebDriver driver;
	public Landing_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
	}
	
	By userName_text = By.id("userEmail");
	By password_text = By.id("userPassword");
	By login_btn = By.id("login");
	By error_msg_info = By.cssSelector("div[class*='flyInOut']");
	
	public WebElement userName_text() {
		return driver.findElement(userName_text);
	}
	
	public WebElement password_text() {
		return driver.findElement(password_text);
	}
	
	public WebElement login_btn() {
		return driver.findElement(login_btn);
	}
	
	public ProductCatalog_page login_application(String username, String password) {
		userName_text().sendKeys(username);
		password_text().sendKeys(password);
		login_btn().click();
		
		ProductCatalog_page ProductCatalogPage = new ProductCatalog_page(driver);
		return ProductCatalogPage;
	}
	
	public void goTo(String url) {
		driver.get(url);
	}
	
	public String getLoginErrorMessage() {
		waitForElementToAppear(error_msg_info);
		return driver.findElement(error_msg_info).getText();
	}
	

}
