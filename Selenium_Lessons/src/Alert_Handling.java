import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Invoking the browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\renz dominic alib\\\\eclipse-workspace\\\\driver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();

		// Navigate the webpage
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// populate alert message field
		driver.findElement(By.id("name")).sendKeys("LOKIBOY");
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("name")).sendKeys("KULASA");
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();
		
		System.out.println("***Execution Completed***");
	}

}
