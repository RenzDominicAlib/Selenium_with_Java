import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\renz dominic alib\\\\\\\\eclipse-workspace\\\\\\\\driver\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		// Switching from defaultContent to iframe
		
		driver.findElement(By.xpath("//iframe[@class = 'demo-frame']"));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class = 'demo-frame']")));
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement dropPoint = driver.findElement(By.id("droppable"));	
		Actions a = new Actions(driver);
		a.dragAndDrop(source, dropPoint).build().perform();
		
		// Switching back from iframe to defaultContent  
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Accept']")).click();
		
		
		System.out.println("***Execution Completed***");

	}

}
