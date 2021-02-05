package screenshot_prgm;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		List<WebElement>menus=driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li"));
		Actions a=new Actions(driver);
		for(WebElement menuname:menus)
		{
			
			String mName=menuname.getText();
			a.moveToElement(menuname).build().perform();
			Thread.sleep(2000);
			Google.ScreenShot(driver,mName);
			List<WebElement> subMenus=driver.findElements(By.xpath("//span[contains(.,'" + mName +"')]/parent::li/descendant::ul[@class='taxonslist']/li"));
			for(WebElement subMenuName :subMenus)
			{
				System.out.println(subMenuName.getText());
			}
			Thread.sleep(2000);
	}

}
}
