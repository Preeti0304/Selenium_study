package selenium_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		List<WebElement> menu=driver.findElements(By.xpath("//div[@class='_1kidPb']/span"));
		Thread.sleep(3000);
		Actions a =new Actions(driver);
		for(WebElement menuName:menu)
		{
			a.moveToElement(menuName).build().perform();
			String mName=menuName.getText();
			System.err.println(mName);
			
			Thread.sleep(5000);
			List<WebElement> subMenus=driver.findElements(By.xpath("//span[contains(.,'"+mName+"')]/parent::div/descendant::div/a"));
			for(WebElement subMenuName:subMenus)
			{
				System.out.println(subMenuName.getText());
			}
			Thread.sleep(2000);
		}
	}
}
