package selenium_1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(10000);
		WebElement search=driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']"));
		search.sendKeys("Diamond Rings",Keys.ENTER);	
		Thread.sleep(10000);
		WebElement ring1=driver.findElement(By.xpath("//a[@id='pid_28402']/img[@class='hc img-responsive center-block']"));
		ring1.click();
		Thread.sleep(20000);
		driver.findElement(By.linkText("https://www.bluestone.com/rings/the-karika-statement-ring~28402.html?impEvent=browseclick&posEvent=1&sortbyEvent=mostpopular&tagEvent=")).click();
		Set<String>wins=driver.getWindowHandles();
		for(String win:wins)
		{
			driver.switchTo().window(win);
		}
		WebElement buyNow=driver.findElement(By.xpath("//input[@id='buy-now']"));
		buyNow.click();
		Thread.sleep(10000);
		System.out.println("Error message is "+buyNow.getText());
	}
}
		
		
		
		
		
		
		
		
		
		/*
		 * WebElement kadas=driver.findElement(By.xpath(
		 * "//a[@title='Jewellery']//parent::li/div/ul/li/div/ul/li/span[contains(.,'Kadas')]"
		 * ));
		 * //a[@title="Jewellery"]/parent::li/div/ul/li/div/ul/li/span[contains(.,'Kadas
		 * ')] kadas.click();
		 */
	

