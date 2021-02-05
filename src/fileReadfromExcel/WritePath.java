package fileReadfromExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WritePath {
	public static void main(String[] args) throws Exception {
	FileInputStream fis=new FileInputStream("E:\\downloads\\Write.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Login");
	Cell cl=sh.createRow(0).createCell(0);
	cl.setCellValue("UserName");
	sh.getRow(0).createCell(1).setCellValue("Password");
	sh.createRow(1).createCell(0).setCellValue("Admin");
	sh.getRow(1).createCell(1).setCellValue("Manager");
	FileOutputStream fio=new FileOutputStream("E:\\downloads\\Write.xlsx");
	wb.write(fio);
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys();
	System.out.println("Done");
	wb.close();
	}

}
