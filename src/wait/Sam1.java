package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sam1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("E:\\Ankita\\Selenium Batch/sam1.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("textA")).sendKeys("name");
		WebDriverWait ww=new WebDriverWait(driver,10);
		ww.until(ExpectedConditions.textToBePresentInElementValue(By.className("textA"), "name"));
		driver.findElement(By.name("textB")).sendKeys("Preeti");
}

}
/*
 * ww.until(new ExpectedCondition<Boolean>()
		{
			public Boolean apply(WebDriver driver)
			{
				return driver.findElement(By.name("textA")).getAttribute("value").equalsIgnoreCase("name");
			}
			
		});*/
 