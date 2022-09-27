package tests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class BaseClass {
	
	AppiumDriver driver;
	DesiredCapabilities cap;
	URL url;
	
	@BeforeTest (alwaysRun=true)
	public void setup() throws MalformedURLException, InterruptedException {
		cap = new DesiredCapabilities();
		
//		cap.setCapability("platformName", "Android");  //other way
		cap.setCapability(MobileCapabilityType.UDID, "272011b458217ece");  //using cable
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
//		cap.setCapability(MobileCapabilityType.UDID, "192.168.1.37:5555"); //using wifi ip, no cable
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

	}
	
	
	public AppiumDriver native_app_Test(String appPackage, String appActivity) throws MalformedURLException, InterruptedException {
		cap.setCapability("appPackage", appPackage); // use when testing native application
		cap.setCapability("appActivity", appActivity);  // use when testing native application			
		url= new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver(url, cap);
		Thread.sleep(5000);
		return driver;
	}
	
	public AppiumDriver browser_webpage_Test(String browserName) throws MalformedURLException, InterruptedException {
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, browserName);	// use when testing on mobile browser	
		url= new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver(url, cap);
		Thread.sleep(5000);
		return driver;
	}
	
	public AppiumDriver application_Test(String apkPath) throws MalformedURLException, InterruptedException {
		cap.setCapability(MobileCapabilityType.APP, apkPath); // use when testing application/native application	
		url= new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver(url, cap);
		Thread.sleep(5000);
		return driver;
	}

	
	@AfterTest (alwaysRun=true)
	public void teardown() {
		driver.quit();
	}

}
