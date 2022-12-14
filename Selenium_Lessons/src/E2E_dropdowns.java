import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E_dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// End to End of this dropdowns page
		
// Invoking the browser
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\renz dominic alib\\\\eclipse-workspace\\\\driver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		
// Navigate the webpage
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
// Search "ind" to show auto-suggest dropdown
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);

// Find and Select "India" in the auto-suggest dropdown	
		List<WebElement> suggestions = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		for( WebElement suggestion: suggestions) {
			if(suggestion.getText().equalsIgnoreCase("india")) {
				suggestion.click();
				break;
			}			
		}
		Thread.sleep(2000);

// Find currency static dropdown and Select "INR"
		Select currency_Drpdwn = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		currency_Drpdwn.selectByValue("INR");
		System.out.println(currency_Drpdwn.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		
// Change the currency to "AED"	
		currency_Drpdwn.selectByIndex(2);
		System.out.println(currency_Drpdwn.getFirstSelectedOption().getText());
		Thread.sleep(2000);

// Change the currency to "USD"	
		currency_Drpdwn.selectByVisibleText("USD");
		System.out.println(currency_Drpdwn.getFirstSelectedOption().getText());
		Thread.sleep(2000);
// Click passenger field			
		driver.findElement(By.id("divpaxinfo")).click();

// Click 'Adult +' 1 time, since it has default 1 adult	
		for(int i = 1; i<2; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
// Click 'Children +' 4 times		
		for(int i = 0; i<4; i++) {
			driver.findElement(By.id("hrefIncChd")).click();
		}	
		Assert.assertTrue(driver.findElement(By.id("divpaxinfo")).getText().equalsIgnoreCase("2 Adult, 4 Child"));
	
// Click "Done"
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		
// Click "Round Trip" radio button		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	
// Click "Destination" field	
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		
// Origin Available will appear, Select and Click BLR
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(1000);
		
// Destination Available will appear, Select and Click MAA		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		
// Click Senior Citizen checkbox		
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		
// Validate and Click Return Date field
		Assert.assertTrue(driver.findElement(By.id("Div1")).getAttribute("style").contains("display: block; opacity: 1"));
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
			
// Click Student Discount checkbox	
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();

// Click Search. 	
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		

		System.out.println("***Execution Completed***");
	}

}
