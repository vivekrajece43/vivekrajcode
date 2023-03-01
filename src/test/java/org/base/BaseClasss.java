package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClasss {
	public static WebDriver driver;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void windowMaximize() {
		driver.manage().window().maximize();
	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public static String pageUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public static void passText(String txt, WebElement ele) {
		ele.sendKeys(txt);
	}
	
	public static void closeEntireBrowser() {
		driver.quit();
	}
	
	public static void clickBtn(WebElement ele) {
		ele.click();
	}
	
	public static void screenShot(String imgName) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File img=ts.getScreenshotAs(OutputType.FILE);
		File f= new File("location+ imgName");
		FileUtils.copyFile(img, f);
	}
	
	public static Actions a;
	
	public static void moveTheCursor(WebElement targetWebElement ) {
		a = new Actions (driver);
		a.moveToElement(targetWebElement).perform();
	}
	public static void dragDrop(WebElement dragWebElement,WebElement dropElement) {
		a= new Actions(driver);
		a.dragAndDrop(dragWebElement, dropElement).perform();
	}
	
	
	public static JavascriptExecutor js;
	
	public static void scrollThepage(WebElement tarWebEle) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", tarWebEle);
	}
	public static void scroll(WebElement element) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}
	
	public static void excelRead(String sheetName, int rowNum, int cellNum) throws IOException {
		File f = new File("excellocation.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet =wb.getSheet("Data");
		Row r = mysheet.getRow(rowNum);
		Cell c = r.getCell(cellNum);
		int celltype =c.getCellType();
		
		String value ="";
		if (celltype==1) {
			String value2 = c.getStringCellValue();
		}
		
		else if (DateUtil.isCellDateFormatted(c)) {
		    Date dd = (Date) c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat(value);
			String val = s.format(dd);
			
		}
		else {
			double d= c.getNumericCellValue();
			long l = (long) d;
			String valueof = String.valueOf(1);
			
		}

		}
	
	public static void createNewEXcelFile(int rowNum,int cellNum,String writeData)throws IOException{
		File f = new File("C:\\Users\\91763\\eclipse-workspace\\MavenProject\\Excel\\newfile.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet newsheet = w.createSheet("dept");
		Row newRow = newsheet.createRow(rowNum);
		Cell newcell = newRow.createCell(cellNum);
		newcell.setCellValue(writeData);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
			
	}
	public static void createCell(int creRow,int crecell,String newdata)throws IOException{
		File f = new File("C:\\Users\\91763\\eclipse-workspace\\MavenProject\\Excel\\newfile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet s = w.getSheet("dept");
		Row r = s.getRow(creRow);
		Cell c = r.createCell(crecell);
		c.setCellValue(newdata);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
	}
	public static void createrow(int creRow, int creCell, String newData) throws IOException{
		File f = new File("C:\\Users\\91763\\eclipse-workspace\\MavenProject\\Excel\\newfile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("dept");
		Row r = s.createRow(creRow);
		Cell c = r.createCell(creCell);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
}
	public static void updatedatatoparticularcell(int gettherow, int getthecell, String existingdata,String writingnewdata)throws IOException {
		File f = new File("C:\\Users\\91763\\eclipse-workspace\\MavenProject\\Excel\\newfile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("dept");
		Row r = s.getRow(gettherow);
		Cell c = r.getCell(getthecell);
		String str =c.getStringCellValue();
		if (str.equals(existingdata)) {
			c.setCellValue(writingnewdata);
			
		}
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	
	//to create new excel sheet
	public static void newexcelsheet(int createrow,int createcell,String setcellvalue) throws IOException {		
			File f = new File("C:\\Users\\91763\\eclipse-workspace\\MavenProject\\Excel\\newfile.xlsx");
			Workbook w = new XSSFWorkbook();
			Sheet newsheet = w.createSheet("Datas");
			Row newrow = newsheet.createRow(0);
			Cell newcell = newrow.createCell(0);
			newcell.setCellValue("value");
			FileOutputStream fos = new FileOutputStream(f);
			w.write(fos);

	}
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


