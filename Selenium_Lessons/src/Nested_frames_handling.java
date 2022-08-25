import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_frames_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\renz dominic alib\\\\\\\\eclipse-workspace\\\\\\\\driver\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		// Switching from defaultContent to Whole Frameset SHOULD NOT INCLUDE! Because Frameset is not a frame
		
//		driver.switchTo().frame(driver.findElement(By.xpath("//frameset[@rows = '50%,50%']")));
		
		// Switching from Whole Frameset to Top Frame 
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name = 'frame-top']")));
		
		// Switching from Top Frame to Top-Middle Frameset SHOULD NOT INCLUDE!
		
//		driver.switchTo().frame(driver.findElement(By.xpath("//frameset[@name = 'frameset-middle']")));
		
		// Switching from Top-Middle Frameset to Middle Frame 
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name = 'frame-middle']")));
		System.out.println(driver.findElement(By.id("content")).getText());
		
		// Switching from Middle Frame to DefaultContent
		driver.switchTo().defaultContent();
		
		System.out.println("***Execution Completed***");
	}

}
