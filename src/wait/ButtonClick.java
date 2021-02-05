package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("E:\\Ankita\\Selenium Batch/ButtonClick.html");
		WebDriverWait ww=new WebDriverWait(driver,10);
		ww.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("otherBtn"))));
		
		//driver.findElement(By.id("sBtn")).click();
		driver.findElement(By.id("otherBtn")).click();
	}

}
