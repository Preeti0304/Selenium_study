package selenium_1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(10000);
		Actions a=new Actions(driver);
		WebElement allJwel=driver.findElement(By.xpath("//a[@title='Jewellery']"));
		a.moveToElement(allJwel).build().perform();
		driver.findElement(By.xpath("//span[contains(.,'Kadas')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[contains(@alt,'The Udith Kada For Him')]")).click();  //code for 1st kada
		Thread.sleep(4000);
		Set<String>wins=driver.getWindowHandles();
		for(String win:wins)
		{
			driver.switchTo().window(win);
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()=' Select Size ']")).click(); //click on select size
		driver.findElement(By.xpath("//span[@class='size']/parent::li[@data-key='04']")).click(); //click on any size from dropdown list
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='buy-now']")).click(); //click on Buy now
		Thread.sleep(4000);
		WebElement title=driver.findElement(By.xpath("//a[text()='The Udith Kada For Him']"));
		System.out.println(title.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
