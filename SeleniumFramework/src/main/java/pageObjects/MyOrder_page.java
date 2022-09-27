package pageObjects;


import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import abstractComponents.Abstract_component;

public class MyOrder_page extends Abstract_component {

	WebDriver driver;

	public MyOrder_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
	}

	By myOrderProducts = By.xpath("//tr/td[2]");
	
	public List<WebElement> myOrdersList() {
		return driver.findElements(myOrderProducts);
	}
	
	public boolean verifyMyOrdersDisplay(String[] itemsNeed){
		List<String> itemsOrderedList = Arrays.asList(itemsNeed);
	    boolean match = false;
	    for(int it = 0; it < myOrdersList().size(); it++){
	    	String OrderedItem = myOrdersList().get(it).getText().toUpperCase();	
	        if (itemsOrderedList.contains(OrderedItem) ){
	            match = true;
	        }
	        else {
	        	match = false;
	        }
	    }
	    return match;
	}
	
}
