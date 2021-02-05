package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario_6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']"));
		search.sendKeys("Rings",Keys.ENTER);
		Thread.sleep(2000);
		Set<String> wins=driver.getWindowHandles();
		for(String win:wins)
		{
			driver.switchTo().window(win);
			Thread.sleep(2000);
		}
		WebElement price=driver.findElement(By.xpath("//span[text()='Price']"));
		price.click();
		Thread.sleep(2000);
		WebElement count=driver.findElement(By.xpath("//span[contains(.,' 10,000 ')]/span[contains(.,'(3)')]"));
		Thread.sleep(2000);
		System.out.println(count.getText());
	}

}
