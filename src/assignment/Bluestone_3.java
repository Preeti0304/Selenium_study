package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone_3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(4000);
		List<WebElement> coins=driver.findElements(By.xpath("//a[@title='Coins']"));
		Actions a=new Actions(driver);
		Thread.sleep(4000);
		for(WebElement goldCoins:coins)
		{
			a.moveToElement(goldCoins).build().perform();
			Thread.sleep(2000);
		}
		driver.findElement(By.xpath("//span[@data-p='l-gold-coins-weight-2gms,m']")).click();
		Thread.sleep(2000);
		WebElement lakshamiCoin=driver.findElement(By.xpath("//h1[contains(.,'2 gram 24 KT Lakshmi Gold Coin')]"));
		if(lakshamiCoin.isDisplayed())
		{
			System.out.println("Title of the Item is: "+ lakshamiCoin.getText());
		}
		else
		{
			System.out.println("Not Displayed");
		}
		driver.close();
	}

}
