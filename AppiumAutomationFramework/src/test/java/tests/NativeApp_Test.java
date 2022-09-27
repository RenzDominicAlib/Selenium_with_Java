package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class NativeApp_Test extends BaseClass{
	@Test
	public void calculatorTest() throws InterruptedException, MalformedURLException {
		
		native_app_Test("com.sec.android.app.popupcalculator", "com.sec.android.app.popupcalculator.Calculator");
		
		System.out.println("Application started . . .");
		
		WebElement one = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_01"));
		WebElement two = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02"));
		WebElement three = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_03"));
		WebElement four = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_04"));
		WebElement five = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05"));
		WebElement six = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_06"));
		WebElement seven = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_07"));
		WebElement eight = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_08"));
		WebElement nine = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_09"));
		WebElement zero = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_00"));
		WebElement plus = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add"));
		WebElement equals = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
		WebElement result = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula"));
		
		
		one.click();
		two.click();
		three.click();
		four.click();
		five.click();
		six.click();
		seven.click();
		eight.click();
		nine.click();
		plus.click();
		one.click();
		zero.click();
		equals.click();
		plus.click();
		two.click();
		zero.click();
		equals.click();
		plus.click();
		three.click();
		zero.click();
		equals.click();

		System.out.println("claculation result is: " + result.getText());
		System.out.println("calculator test finished");
	}
}
