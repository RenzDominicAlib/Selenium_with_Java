package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ChromeBrowser_Test extends BaseClass {

	@Test
	public void googleTest() throws MalformedURLException, InterruptedException{
		
		browser_webpage_Test("Chrome");
		
		System.out.println("Application started . . .");
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Appium Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		System.out.println("browser Test finished");
	}
	
}
