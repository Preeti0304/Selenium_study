package selenium_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		List<WebElement> menus=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		Actions a=new Actions(driver);
		for(WebElement menuName:menus)
		{
			String mName=menuName.getText();
			System.err.println(mName);
			a.moveToElement(menuName).build().perform();
			Thread.sleep(2000);
			List<WebElement> subMenus=driver.findElements(By.xpath("//span[contains(.,'" + mName +"')]/parent::li/descendant::ul[@class='taxonslist']/li"));
			for(WebElement subMenuName :subMenus)
			{
				System.out.println(subMenuName.getText());
			}
			Thread.sleep(2000);
		}
		/*
		 * String
		 * sale=driver.findElement(By.xpath("//span[contains(.,'Sale')]")).getText();
		 * System.out.println(sale); String living=driver.findElement(By.
		 * xpath("//li[@class=\"topnav_item livingunit\"]/span[@class=\"topnav_itemname\"]"
		 * )).getText(); System.out.println(living); String
		 * bedRoom=driver.findElement(By.
		 * xpath("//li[@class='topnav_item bedroomunit']/span[contains(.,'Bedroom')]")).
		 * getText(); System.out.println(bedRoom); String dining=driver.findElement(By.
		 * xpath("//li[@class='topnav_item diningunit']/span[contains(.,'Dining')]")).
		 * getText(); System.out.println(dining);
		 */
	}

}
