package pageObjects;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import abstractComponents.Abstract_component;

public class ProductCatalog_page extends Abstract_component{

	WebDriver driver;
	
	public ProductCatalog_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
	}
	
	By addCart_btns_list = By.xpath("//div[@class = 'card']//button[@class='btn w-10 rounded']");
	By product_names_list = By.xpath("//div[@class='card-body']/h5/b");
	By addCartNotif_info = By.cssSelector("#toast-container");
	By animation = By.cssSelector(".ng-animating");
	
	public List<WebElement> getProductList() {
		waitForElementToAppear(product_names_list);
		return driver.findElements(product_names_list);
	}
	
	public List<WebElement> getAddCartButtons() {
		waitForElementToAppear(addCart_btns_list);
		return driver.findElements(addCart_btns_list);
	}
	
	public void waitForAddCartNotificationVisibility() {
		waitForElementToAppear(addCartNotif_info);
	}
	
	public void waitForAnimationInvisibility() {
		waitForElementToInvisible(animation);
	}
	
	
	public void itemsAddingToCart(String[] itemsNeed) {
		
		List<WebElement> productList = getProductList();
		List<WebElement> addCartButtons = getAddCartButtons();
		List<String> itemsNeededList = Arrays.asList(itemsNeed);
		
		for (int i = 0; i < productList.size(); i++) {
			System.out.println(productList.get(i).getText());
			String upperCaseProdName = productList.get(i).getText().toUpperCase();
			if (itemsNeededList.contains(upperCaseProdName)) {
				addCartButtons.get(i).click();
				waitForAddCartNotificationVisibility();
				waitForAnimationInvisibility();
			}
			int j = 0;
			if (j == itemsNeed.length) {
				break;
			}

		}
	}
	
	
	
	

}
