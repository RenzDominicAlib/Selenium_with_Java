import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adding_to_cart_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Invoking the browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\renz dominic alib\\\\eclipse-workspace\\\\driver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();

		// Navigate the webpage
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		String[] itemsNeeded= {"Brocolli", "Cucumber", "Beetroot"};	

		// Conversion of array to ArrayList
		// using Arrays.asList
		List<String> itemsNeededList = Arrays.asList(itemsNeeded);
		
		
		List<WebElement> addButtons = driver.findElements(By.xpath("//button[@class = 'btn w-10 rounded']"));
		List<WebElement> productNames = driver.findElements(By.xpath("//h4[@class = 'product-name']"));
		
		for(int i = 0; i<productNames.size(); i++) {
			productNames.get(i).getText();
			String[] formattedProductNames = productNames.get(i).getText().split("-");
			String Name = formattedProductNames[0].trim();
			
			if(itemsNeededList.contains(Name)){
				addButtons.get(i).click();
				}
			int j = 0;
			if(j == itemsNeeded.length) {
				break;
			}
			
		}
		System.out.println("***Execution Completed***");

	}

}
