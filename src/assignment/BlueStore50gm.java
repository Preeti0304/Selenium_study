package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStore50gm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(4000);
		List<WebElement> menu=driver.findElements(By.xpath("//a[@title='Coins']"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		for(WebElement menuName:menu)
		{
			a.moveToElement(menuName).perform();
			Thread.sleep(2000);
		}
		driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-50gms,m']")).click();
		WebElement fiftyGram=driver.findElement(By.xpath("//h1[contains(.,'50 gram 24 KT Gold Coin')]"));
		Thread.sleep(2000);
		if(fiftyGram.isDisplayed())
		{
			System.out.println(fiftyGram.getText());
		}
		else
		{
			System.out.println("Not Displayed");
		}
	}

}
