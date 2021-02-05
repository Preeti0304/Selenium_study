package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(4000);
		WebElement createAc=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		System.out.println(createAc.isEnabled());
		if(createAc.isEnabled())
		{
			createAc.click();
		}
		Thread.sleep(2000);
		WebElement gender=driver.findElement(By.xpath("//label[contains(.,'Female')]"));
		
		if(gender.isDisplayed())
		{
			gender.click();
		}
		Thread.sleep(2000);
		//System.out.println(gender.isSelected());
		System.out.println(gender.getCssValue("background-color"));
		System.out.println(gender.getRect().getPoint());
		System.out.println(gender.getLocation());
		//System.out.println();
		
	}

}
