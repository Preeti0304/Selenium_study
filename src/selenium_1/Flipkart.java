package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		WebElement close=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		WebElement search=driver.findElement(By.xpath("//input[@class='_3704LK']"));
		search.sendKeys("iphone",Keys.ENTER);
		Thread.sleep(10000);
		WebElement item1=driver.findElement(By.xpath("//div[@class='CXW8mj']/img[@alt='Apple iPhone XR (Black, 64 GB) (Includes EarPods, Power Adapter)']"));
		item1.click();
	}

}
