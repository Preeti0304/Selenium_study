package dataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoP {
	@Test(dataProvider="demo", dataProviderClass=DemoReadDataP.class)
	public void tc_1(String user, String pass)
	{
		Reporter.log(user+ " " +pass,true);
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys(user);
		WebElement password=driver.findElement(By.xpath("//input[@name='pwd']"));
		password.sendKeys(pass,Keys.ENTER);
		WebDriverWait ww=new WebDriverWait(driver,10);
		ww.until(ExpectedConditions.titleContains("Enter"));
		
	}

}
