import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_explicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\renz dominic alib\\\\\\\\eclipse-workspace\\\\\\\\driver\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		String[] orderedItems = {"iphone X", "Samsung Note 8", "Blackberry", "Nokia Edge"};
		List<String> orderedItemsList = Arrays.asList(orderedItems);
		
		LoginPage(driver);
		
		AddingToCart(driver, orderedItemsList);
		
		
		System.out.println("***Execution Completed***");
	}
	
	public static void LoginPage (WebDriver driver) {
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value = 'user']/following-sibling::span")).click();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(5000));
		w.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		Select userTypedrpdwn = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		userTypedrpdwn.selectByValue("consult");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();	
	}
	
	public static void AddingToCart (WebDriver driver, List<String> orderedItemsList) {
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(6000));
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@class = 'btn btn-info']")));
		
		List<WebElement> productNames = driver.findElements(By.xpath("//div[@class='card-body']/h4[@class='card-title']/a"));
		List<WebElement> addCartBtns = driver.findElements(By.xpath("//button[@class = 'btn btn-info']"));
		
		for(int i=0; i < productNames.size(); i++) {
			productNames.get(i).getText();
			if(orderedItemsList.contains(productNames.get(i).getText())) {
				
				addCartBtns.get(i).click();
			}
		}
	}

}
