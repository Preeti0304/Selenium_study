package selenium_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleNext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Java",Keys.ENTER); //==>Java enter  in search bar
		Thread.sleep(2000);
		WebElement nextButton=driver.findElement(By.xpath("//span[text()='Next']"));
		Thread.sleep(2000);
		List<WebElement> number=driver.findElements(By.xpath("//tr[@jsname='TeSSVd']/descendant::a"));
		Thread.sleep(2000);
		for(WebElement numbers:number)
		{
			numbers.click();
			Thread.sleep(4000);
		}
	}

}
