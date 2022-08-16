import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_2_getPassword {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renz dominic alib\\eclipse-workspace\\driver\\chromedriver_win32\\chromedriver.exe");
		// webdriver.chrome.driver -> value of path
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		String passWord = getPassword(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
											
		driver.findElement(By.linkText("Forgot your password?")).click();													
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());		
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("RenzDominic");
		driver.findElement(By.xpath("//*[contains(@type, 'pass')]")).sendKeys(passWord);							
		driver.findElement(By.cssSelector("#chkboxOne")).click();																
		driver.findElement(By.id("chkboxTwo")).click();																			
		driver.findElement(By.xpath("//button[contains(text(), 'Sign')]")).click();	
		
		System.out.println("***Execution Completed***");
		
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();													
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String infoMsg = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		String[] arr1 = infoMsg.split("'");
		String[] arr2 = arr1[1].split("'");
		String password = arr2[0];
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(password);
		return password;
		
		
	}

}
