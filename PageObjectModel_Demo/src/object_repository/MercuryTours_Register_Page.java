package object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MercuryTours_Register_Page {
	
	WebDriver driver;
	
	public MercuryTours_Register_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	By fName_field = By.xpath("//input[@name='firstName']");
	By lName_field = By.xpath("//input[@name='lastName']");
	By phone_field = By.xpath("//input[@name='phone']");
	By email_field = By.xpath("//input[@name='userName']");
	By address_field = By.xpath("//input[@name='address1']");
	By city = By.xpath("//input[@name='city']");
	By state = By.xpath("//input[@name='state']");
	By postalCode = By.xpath("//input[@name='postalCode']");
	By country_drpdwn = By.xpath("//select[@name='country']");
	
	By username = By.xpath("//input[@name='email']");
	By password = By.xpath("//input[@name='password']");
	By confirmPassword = By.xpath("//input[@name='confirmPassword']");
	
	public WebElement fName_field() {
		return driver.findElement(fName_field);
	}
	
	public WebElement lName_field() {
		return driver.findElement(lName_field);
	}
	
	public WebElement phone_field() {
		return driver.findElement(phone_field);
	}
	
	public WebElement email_field() {
		return driver.findElement(email_field);
	}
	
	public WebElement address_field() {
		return driver.findElement(address_field);
	}
	
	public WebElement city_field() {
		return driver.findElement(city);
	}
	
	public WebElement state_field() {
		return driver.findElement(state);
	}
	
	public WebElement postalCode_field() {
		return driver.findElement(postalCode);
	}
	
	public Select country_drpdwn() {
		driver.findElement(country_drpdwn);	
		Select cntryDrpdwn = new Select(driver.findElement(country_drpdwn));
		return cntryDrpdwn;
	}
	
	public WebElement username() {
		return driver.findElement(username);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement confirmPassword() {
		return driver.findElement(confirmPassword);
	}
}
