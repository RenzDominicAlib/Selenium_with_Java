package pageObjects;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import abstractComponents.Abstract_component;

public class Cart_page extends Abstract_component {

	WebDriver driver;

	public Cart_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
	}

	By cart_items = By.xpath("//div[@class='cart']//h3");
	By checkout_btn = By.cssSelector(".totalRow button");

	public List<WebElement> cartItemsList() {
		return driver.findElements(cart_items);
	}
	
	
	public boolean verifyItemsDisplay(String[] itemsNeed){
		List<String> itemsNeededList = Arrays.asList(itemsNeed);
	    boolean match = false;
	    for(int it = 0; it < cartItemsList().size(); it++){
	    	String cartItem = cartItemsList().get(it).getText().toUpperCase();	
	        if (itemsNeededList.contains(cartItem) ){
	            match = true;
	        }
	        else {
	        	match = false;
	        }
	    }
	    return match;
	}
	
	public void scrollToBottom() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, document.body.scrollHeight);");
		Thread.sleep(1000);	
	}
	

	public Payment_page clickCheckout() {
		driver.findElement(checkout_btn).click();
		Payment_page PaymentPage = new Payment_page(driver);
		return PaymentPage;
	}

}
