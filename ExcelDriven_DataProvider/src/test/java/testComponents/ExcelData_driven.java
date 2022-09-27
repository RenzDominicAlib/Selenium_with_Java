package testComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelData_driven {

	@Test(dataProvider = "user_login_creds")
	public void login(String username, String password, String userID) {
		System.out.println(userID + username + username);
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
			driver.get("https://rahulshettyacademy.com/client/");
			driver.manage().window().maximize();

			driver.findElement(By.id("userEmail")).sendKeys(username);
			driver.findElement(By.id("userPassword")).sendKeys(password);
			System.out.println(userID);
			driver.findElement(By.id("login")).click();
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
