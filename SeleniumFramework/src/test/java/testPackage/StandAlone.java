package testPackage;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAlone {

	public static void main(String[] args) throws InterruptedException {
		// Standalone testing
		// renz@example.com
		// Renz@0715

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.get("https://rahulshettyacademy.com/client/");
		driver.manage().window().maximize();

		driver.findElement(By.id("userEmail")).sendKeys("renz@example.com");
		driver.findElement(By.id("userPassword")).sendKeys("Renz@0715");
		driver.findElement(By.id("login")).click();

		String[] itemsNeed = { "ZARA COAT 3", "ADIDAS ORIGINAL", "IPHONE 13 PRO"};
		// Conversion of array to ArrayList
		// using Arrays.asList
		List<String> itemsNeededList = Arrays.asList(itemsNeed);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(5000));

		List<WebElement> addCartbtns = driver
				.findElements(By.xpath("//div[@class = 'card']//button[@class='btn w-10 rounded']"));
		List<WebElement> productNames = driver.findElements(By.xpath("//div[@class='card-body']/h5/b"));

		for (int i = 0; i < productNames.size(); i++) {
			System.out.println(productNames.get(i).getText());
			String upperCaseProdName = productNames.get(i).getText().toUpperCase();

			if (itemsNeededList.contains(upperCaseProdName)) {
				

				addCartbtns.get(i).click();
				w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
				w.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
			}
			int j = 0;
			if (j == itemsNeed.length) {
				break;
			}

		}

		driver.findElement(By.xpath("//button[contains(@routerlink, 'cart')]")).click();
		List<WebElement> cartItems = driver.findElements(By.xpath("//div[@class='cart']//h3"));
		for (int it = 0; it < cartItems.size(); it++) {
			String cartItem = cartItems.get(it).getText().toUpperCase();
			Assert.assertTrue(itemsNeededList.contains(cartItem));
		}


		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, document.body.scrollHeight);");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".totalRow button")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("ph");
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//button[@class = 'ta-item list-group-item ng-star-inserted']"))).click().build().perform();
		
		driver.findElement(By.xpath("//a[@class='btnn action__submit ng-star-inserted']")).click();
		System.out.println(driver.findElement(By.xpath("//h1[@class='hero-primary']")).getText());
		Assert.assertTrue(driver.findElement(By.xpath("//h1[@class='hero-primary']")).getText().equalsIgnoreCase("Thankyou for the order."));
		

		System.out.println("***Execution Completed***");

	}

}
