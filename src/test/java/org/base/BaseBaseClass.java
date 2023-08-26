package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseBaseClass {


	public static WebDriver driver;
	public static WebElement findelement;

	public static void initiatebrowser(String url) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	// read data from excell
	public static String read(int r, int c) throws IOException {
		String value = null;
		File file = new File("C:\\Users\\ARUN\\Downloads\\seleniumscreenshot\\login.xlsx");
		FileInputStream in = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(in);
		Sheet sheet = book.getSheet("NIVI");
		Row row = sheet.getRow(r);
		Cell cell = row.getCell(c);
		CellType cellType = cell.getCellType();
		switch (cellType) {
		case STRING:
			value = cell.getStringCellValue();
			break;
		default:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
				value = s.format(date);
			} else {
				double number = cell.getNumericCellValue();
				long l = (long) number;
				BigDecimal valueOf = BigDecimal.valueOf(l);
				value = valueOf.toString();
			}
			break;
		}
		return value;
	}

	
public static void selectbyvisibletext(String Id,String text)
{WebElement findElement2 = driver.findElement(By.id(Id));
	Select s=new Select(findElement2);
	s.selectByVisibleText(text);
}
public static void inspectById(String Id,String keyvalues) {
WebElement findElement2 = driver.findElement(By.id(Id));
findElement2.sendKeys(keyvalues);
}
	public static void scrolldown(String xpathvalue ) {
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement findElement2 = driver.findElement(By.xpath(xpathvalue));
	js.executeScript("arguments[0].scrollIntoView(true)",findElement2);
	
	}
	
}
