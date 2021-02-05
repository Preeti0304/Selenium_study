package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://demo.guru99.com/test/autoit.html");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@id='postjob']")).click();
	Thread.sleep(5000);
	WebElement name=driver.findElement(By.xpath("//input[@id='input_3' and @size='25']"));
	Thread.sleep(5000);
	name.sendKeys("Preeti");
	}
}
