package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario3_droppable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://jqueryui.com/droppable/");
		 Thread.sleep(5000);
		 WebElement drop=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		 driver.switchTo().frame(drop);
		 Thread.sleep(4000);
		 WebElement from=driver.findElement(By.xpath("//div[@id='draggable']"));
		 WebElement to=driver.findElement(By.xpath("//div[@id='droppable']"));
		 Actions a=new Actions(driver);
		 a.dragAndDrop(from, to).build().perform(); 
		WebElement str= driver.findElement(By.xpath("//p[contains(.,'Dropped!')]"));
		
		
	}

}
