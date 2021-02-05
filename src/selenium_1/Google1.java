package selenium_1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);	
		 WebElement search=driver.findElement(By.xpath("//input[@aria-label='Search']")); 
		 search.sendKeys("Java");
		 Thread.sleep(5000);
		List<WebElement> options=driver.findElements(By.xpath("//div[@class='sbl1']"));
		System.out.println(driver.findElement(By.tagName("title")).getAttribute("textContent"));
		 for(WebElement dropDownOptions:options)
		 {
			 System.out.println(dropDownOptions.getText());
		 }
		 Thread.sleep(4000);
		 options.get(2).click();
	}

}
