package testComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.Landing_page;

public class BaseTest_component {

	public WebDriver driver;
	public Landing_page LandingPage;

	public WebDriver initializeDriver() throws IOException {

		Properties globalProp = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\Global_data.properties");
		globalProp.load(fis);

//		String browserName = globalProp.getProperty("browser"); // improve this with ternary condition. if supplying -Dbrowser=firefox in cmd line
		String browserName = System.getProperty("browser") != null ? System.getProperty("browser"):globalProp.getProperty("browser");
		


		if (browserName.contains("chrome")) {
			ChromeOptions options = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			if(browserName.contains("headless")) {
				options.addArguments("headless");
			}
			driver = new ChromeDriver(options);
			driver.manage().window().setSize(new Dimension(1440,900)); //full screen
			
		} else if (browserName.equalsIgnoreCase("firefox")) {		
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\main\\java\\webdriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		} else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\src\\main\\java\\webdriver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.manage().window().maximize();
		return driver;
	}

	@BeforeMethod (alwaysRun=true)
	public Landing_page launchApplication() throws IOException {
		driver = initializeDriver();
		LandingPage = new Landing_page(driver);
		LandingPage.goTo("https://rahulshettyacademy.com/client/");
		return LandingPage;
	}
	
	@AfterMethod (alwaysRun=true)
	public void closeBrowser() {
		driver.close();
	}

	public String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir")+"//reports//"+testCaseName+".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir")+"//reports//"+testCaseName+".png";
	}
	
	@DataProvider(name = "user_login_creds")
	public Object[][] getData() throws IOException {

		FileInputStream filePath = null;
		filePath = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\excelDriven_dataProvider.xlsx"); // declaring
																													// the
																													// excel
																													// filepath

		DataFormatter formatter = new DataFormatter();
		XSSFWorkbook workBook = new XSSFWorkbook(filePath); // accessing the excel file or workbook
		XSSFSheet sheet = workBook.getSheetAt(0); // accessing the sheet
		int rowsCount = sheet.getPhysicalNumberOfRows(); // getting the total rows count
		XSSFRow row = sheet.getRow(0); // accessing the first row or the header row
		int columnCount = row.getLastCellNum(); // getting the column count

		Object[][] data = new Object[rowsCount - 1][columnCount];

		for (int i = 0; i < rowsCount - 1; i++) {
			row = sheet.getRow(i + 1); // iterate the row in outside for loop

			for (int j = 0; j < columnCount; j++) {

				// row.getCell(j); //iterate the column in inside for loop
				XSSFCell cell = row.getCell(j);

				// formatter.formatCellValue(cell); //format the cell value into string
				data[i][j] = formatter.formatCellValue(cell); // storing the value in multi-dimensional array

			}
		}
		return data;

	}


}
