import java.time.Duration;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Parent_and_child_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\renz dominic alib\\\\\\\\eclipse-workspace\\\\\\\\driver\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
			
		driver.findElement(By.xpath("//a[@class = 'blinkingText']")).click();
		
		// getting the parent and child windows id/handles
		Set<String> windows = driver.getWindowHandles();
		java.util.Iterator<String> it = windows.iterator();
		String parent_wndw_id = it.next();
		String child_wndw_id = it.next();
		
		System.out.println(parent_wndw_id);
		System.out.println(child_wndw_id);
	
		// switching to Child Window
		driver.switchTo().window(child_wndw_id);	
		String extracted_email = driver.findElement(By.xpath("//p[@class = 'im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(extracted_email);
		
		// switching to Parent Window
		driver.switchTo().window(parent_wndw_id);	
		driver.findElement(By.id("username")).sendKeys(extracted_email);
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value = 'user']/following-sibling::span")).click();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(5000));
		w.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		Select userTypedrpdwn = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		userTypedrpdwn.selectByValue("consult");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();	
		
		System.out.println("***Execution Completed***");
	}

}
