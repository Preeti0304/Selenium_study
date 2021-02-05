package selenium_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Blue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(10000);
		List<WebElement>menu=driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		for(WebElement menuName:menu)
		{
			String mName=menuName.getText();
			System.err.println(mName);
			a.moveToElement(menuName).build().perform();
			List<WebElement>subMenu=driver.findElements(By.xpath("//nav[@class='wh-navbar']/descendant::li"));
			for(WebElement subMenuName:subMenu)
			{
				
			}
		}
		Thread.sleep(2000);
		
	}
}
