package selenium_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		List<WebElement> menu=driver.findElements(By.xpath("//ul[@class=\"sf-menu clearfix menu-content sf-js-enabled sf-arrows\"]/li"));
		Actions a=new Actions(driver);
		for(WebElement menu1:menu)
		{
			System.out.println(menu1.getText());
			a.moveToElement(menu1).build().perform();
			Thread.sleep(2000);
		}
	}

}
