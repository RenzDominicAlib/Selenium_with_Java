import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent_Reporting {
	
	ExtentReports extent = new ExtentReports();
	
	@BeforeTest
	public void extentReport_config() {
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Testing");
		reporter.config().setDocumentTitle("Test Results");
		
		extent.attachReporter(reporter);
		extent.setSystemInfo("Automation Tester", "RDCA");
	}

	@Test
	public void invokingBrowser() {
		
		extent.createTest("Invoking the Web browser and browsing URL");
		// Invoking the browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\renz dominic alib\\\\eclipse-workspace\\\\driver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.manage().window().maximize();

		// Navigate the webpage
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.getTitle();
		System.out.println("******Execution Completed*******");
		driver.close();
		extent.flush();
	}

}
