package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import abstractComponents.Abstract_component;

public class Summary_page extends Abstract_component {

	WebDriver driver;
	public Summary_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
	}
	
	By headerMessage_info = By.xpath("//h1[@class='hero-primary']");
	
	public boolean validateHeaderMessage() {
		return driver.findElement(headerMessage_info).getText().equalsIgnoreCase("Thankyou for the order.");
		
	}
	

	public void closeBrowser() {
		driver.close();
	}

}
