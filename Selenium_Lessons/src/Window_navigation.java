import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_navigation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renz dominic alib\\eclipse-workspace\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		driver.get("http://google.com");												// it is better, since it is wait to fully load the page
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");		// not waiting to fully load, but okay when you just want to navigate
		driver.navigate().back();
		driver.navigate().forward();
		
		System.out.print("No error");

		
	}
	


}
