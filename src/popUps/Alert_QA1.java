package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_QA1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(4000);
		WebElement ele=driver.findElement(By.id("promtButton"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].click()", ele);
		Thread.sleep(4000);
		Alert a=driver.switchTo().alert();
		a.sendKeys("Preeti");
		a.accept();
		System.out.println(a.getText());
	}

}
/*Alert promptAlert  = driver.switchTo().alert();
   String alertText = promptAlert.getText();
   System.out.println("Alert text is " + alertText);
  //Send some text to the alert
   promptAlert.sendKeys("Test User");
   promptAlert.accept();*/