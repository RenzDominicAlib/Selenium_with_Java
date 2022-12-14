import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sel_Introduction {

	public static void main(String[] args) throws InterruptedException{
		// Invoking the browser
		// Chrome - ChromeDriver extend -> methods close get
		// Firefox - FirefoxDriver extend -> methods close get
		// Safari - SafariDriver extend -> methods close get
		
		//		ChromeDriver driver = new ChromeDriver();
		//		FirefoxDriver driver = new FirefoxDriver();
		//		SafariDriver driver = new SafariDriver();
		
		// Selenium -> geckodriver (webdriver.gecko.driver) act as middle proxy -> FIREFOX browser
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\renz dominic alib\\eclipse-workspace\\driver\\geckodriver.exe");
		// webdriver.gecko.driver -> value of path
//		WebDriver driver = new FirefoxDriver();
		
		// Selenium -> edge (webdriver.edge.driver) act as middle proxy -> MSedge browser
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\renz dominic alib\\eclipse-workspace\\driver\\msedgedriver.exe");
		// webdriver.edge.driver -> value of path
//		WebDriver driver = new EdgeDriver();
		
		// Selenium -> chromedriver (webdriver.chrome.driver) act as middle proxy -> CHROME browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renz dominic alib\\eclipse-workspace\\driver\\chromedriver_win32\\chromedriver.exe");
		// webdriver.chrome.driver -> value of path
		WebDriver driver = new ChromeDriver();
		String name = "RenzDominic";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // use to wait page load in 5 seconds; wait until something to show
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.id("inputUsername")).sendKeys("JohnDoe");															//id
		driver.findElement(By.name("inputPassword")).sendKeys("Test123");														//name
		driver.findElement(By.className("signInBtn")).click();																	//classname, 1 of multiple classname is accepted
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());											//cssSelector tagname.class
		driver.findElement(By.linkText("Forgot your password?")).click();														//linkText
		Thread.sleep(1000); // use when encounter interception error. wait until the web become stable state
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Renz Dominic");									//xpath
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Renz@ygmail");								//cssSelector
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();														//xpath with index
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("RenzDominic@ygmail");					//cssSelector with index
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("09123456789");												//xpath with parent/child & index
		driver.findElement(By.xpath("//div[@class='form-container sign-up-container']//input[3]")).clear();						//xpath with grandchild & index
		driver.findElement(By.xpath("//div[@class='form-container sign-up-container']/*/input[3]")).sendKeys("777777777");		//xpath with grandchild & index
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();														//cssSelector tagname.class
		System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());									//xpath
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		
		Thread.sleep(1000); // use when encounter interception error. wait until the web become stable state//xpath using linktext
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);										//cssSelector tagname#id
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("wrongPAssword");									//REGEX for cssSelector
		driver.findElement(By.xpath("//input[contains(@type, 'pass')]")).clear();												//REGEX for xpath
		driver.findElement(By.xpath("//*[contains(@type, 'pass')]")).sendKeys("rahulshettyacademy");							//REGEX for xpath *
		driver.findElement(By.cssSelector("#chkboxOne")).click();																//cssSelector #id
		driver.findElement(By.id("chkboxTwo")).click();																			//id
		driver.findElement(By.xpath("//button[contains(text(), 'Sign')]")).click();												//REGEX for xpath with link text text()		
		
		Thread.sleep(2000); // use when encounter interception error. wait until the web become stable state//xpath using linktext
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(),"Hello "+name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		
		
		System.out.println("No error");
//		driver.close();			    // driver.close(); close only the current window. 
//		driver.quit();			// driver.quit();  quit the driver; close all the associated window in automation where multiple windows opened.
		

	}

}
