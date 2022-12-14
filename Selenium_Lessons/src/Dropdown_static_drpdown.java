import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_static_drpdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\renz dominic alib\\eclipse-workspace\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.getTitle());
		
		WebElement static_drpdwn = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select passenger_drpdwn = new Select(static_drpdwn);
		
		passenger_drpdwn.selectByIndex(3);
		System.out.println(passenger_drpdwn.getFirstSelectedOption().getText());
		
		passenger_drpdwn.selectByValue("AED");
		System.out.println(passenger_drpdwn.getFirstSelectedOption().getText());
		
		passenger_drpdwn.selectByVisibleText("INR");
		System.out.println(passenger_drpdwn.getFirstSelectedOption().getText());
		
		System.out.println("***Execution Completed***");

	}

}
