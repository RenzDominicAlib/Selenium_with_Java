package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import abstractComponents.Abstract_component;

public class Payment_page  extends Abstract_component {

	WebDriver driver;
	public Payment_page(WebDriver driver){
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
	}

	By country_field = By.xpath("//input[@placeholder='Select Country']");
	By initialSuggest = By.xpath("//button[@class = 'ta-item list-group-item ng-star-inserted'][1]");
	By placeOrder_btn = By.xpath("//a[@class='btnn action__submit ng-star-inserted']");
	
	public void populateCountryUsingInitials(String country) {
		driver.findElement(country_field).sendKeys(country);
	}
	
	public void clickInitialSuggestion() {
		actionsMovetoElementThenClick(initialSuggest);
	}
	
	public Summary_page clickPlaceOrder() {
		driver.findElement(placeOrder_btn).click();
		Summary_page SummaryPage = new Summary_page(driver);
		return SummaryPage;
	}
}
