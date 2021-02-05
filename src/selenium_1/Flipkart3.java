package selenium_1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iPhone");
		//Actions a=new Actions(driver);
		List<WebElement>menus=driver.findElements(By.xpath("//li[@class='Y5N33s']"));
		for(WebElement menuName:menus)
		{
			System.out.println(menuName.getText());
		}
		Thread.sleep(4000);
		menus.get(3).click();
	}

}
