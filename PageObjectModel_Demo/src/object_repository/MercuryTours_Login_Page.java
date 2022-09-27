package object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MercuryTours_Login_Page {

	WebDriver driver;
	
	public MercuryTours_Login_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;		
	}
	
	By userName_field = By.xpath("//input[@name = 'userName' ]");
	By passWord_field = By.xpath("//input[@name = 'password' ]");
	By submit_btn = By.xpath("//input[@name = 'submit' ]");
	By register_link = By.xpath("//a[text()= 'REGISTER' ]");
	By error_text = By.xpath("//input[@name= 'password' ]/following-sibling::span");
	
	
	public WebElement userName() {
		return driver.findElement(userName_field);
	}
	
	public WebElement passWord() {
		return driver.findElement(passWord_field);
	}
	
	public WebElement submit() {
		return driver.findElement(submit_btn);
	}
	
	public WebElement register() {
		return driver.findElement(register_link);
	}
	
	public WebElement error_prompt() {
		return driver.findElement(error_text);
	}
	
}
