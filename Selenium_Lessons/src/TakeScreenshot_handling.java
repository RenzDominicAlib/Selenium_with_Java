//import java.io.File;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakeScreenshot_handling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\Users\\\\\\\\renz dominic alib\\\\\\\\eclipse-workspace\\\\\\\\driver\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
//		File fileSrc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(fileSrc, new File("C:\\Users\\renz dominic alib\\eclipse-workspace"));

	}
	
//	public String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File file = new File(System.getProperty("user.dir")+"//reports//"+testCaseName+".png");
//		FileUtils.copyFile(source, file);
//		return System.getProperty("user.dir")+"//reports//"+testCaseName+".png";
//	}

}
