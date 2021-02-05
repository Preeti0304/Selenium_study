package frameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHq {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//input[@id='gsc-i-id1']"));
		search.sendKeys("java",Keys.ENTER);
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		search.sendKeys("TestNG",Keys.ENTER);
		
	}

}
