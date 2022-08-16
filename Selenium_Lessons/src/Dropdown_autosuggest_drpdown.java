import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_autosuggest_drpdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renz dominic alib\\eclipse-workspace\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		
		List<WebElement> suggestedOptions = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		for(WebElement suggestedOption : suggestedOptions) {
			if(suggestedOption.getText().equalsIgnoreCase("India")) {
				suggestedOption.click();
				break;
			}
		}
		
		System.out.println("***Execution Completed***");

	}

}
