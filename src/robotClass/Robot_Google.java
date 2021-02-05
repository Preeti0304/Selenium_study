package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Google {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);	
		driver.findElement(By.name("q")).sendKeys("Java",Keys.ENTER);
		Thread.sleep(1000);
		 List<WebElement>click=driver.findElements(By.xpath("//div[@id='mh_tsuid60']/div/div/div[2]/h2/span"));
		 Actions a=new Actions(driver);
		 for (WebElement d : click) {
			a.moveToElement(d).doubleClick().build().perform();
			Thread.sleep(4000);
		}
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_C);
		 r.keyRelease(KeyEvent.VK_C);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 Thread.sleep(1000);
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_T);
		 r.keyRelease(KeyEvent.VK_T);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 Thread.sleep(1000);
		 
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_V);
		 r.keyRelease(KeyEvent.VK_V);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 Thread.sleep(1000);
		 
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
