package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart_book {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(5000);
		//search for C# book 
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("c#",Keys.ENTER);
		Thread.sleep(2000);
		//sort the price by low to high
		driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
		Thread.sleep(4000);
		//Fetch the maximum rating book
		//click on book. switch the tab. click on add to cart btn
		List<WebElement> rating=driver.findElements(By.xpath("//div[@class=\"gUuXy- _2D5lwg\"]/descendant::div[contains(text(),'4.6')]"));
		for(WebElement name:rating)
		{
			System.out.println(name.getText());
			String s=name.getText();
			name.click();
			//getting only rating
		}
		
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
}
