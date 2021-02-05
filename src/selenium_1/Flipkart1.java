package selenium_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		List<WebElement> menus=driver.findElements(By.xpath("//div[@class=\"_1kidPb\"]/span"));
		Actions a=new Actions(driver);
		for(WebElement flipkartMenu:menus)
		{
			System.out.println(flipkartMenu.getText());
			a.moveToElement(flipkartMenu).build().perform();
			Thread.sleep(1000);
		}
		  String flight=driver.findElement(By.xpath("//a[contains(.,'Flights')]")).getText();
		  System.out.println(flight); 
		  String offer=driver.findElement(By.xpath("//a[contains(.,'Offer Zone')]")).getText();
		  System.out.println(offer);
		 
		/*
		 * List<WebElement>menus1=driver.findElements(By.xpath("//a[@class='_2I9KP_']"))
		 * ; for(WebElement flipkartMenu1:menus1) {
		 * System.out.println(flipkartMenu1.getText());
		 * a.moveToElement(flipkartMenu1).build().perform(); Thread.sleep(1000); }
		 */
	}

}
