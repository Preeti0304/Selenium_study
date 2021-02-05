package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(4000);
		WebElement createNewAcc=driver.findElement(By.xpath("//a[@id='u_0_2']"));
		System.out.println(createNewAcc.isEnabled());
		if(createNewAcc.isEnabled())
		{
			createNewAcc.click();
		}
		Thread.sleep(2000);
		WebElement day=driver.findElement(By.id("day"));
		Select sDay=new Select(day);
		sDay.selectByVisibleText("3");
		Thread.sleep(4000);
		WebElement month=driver.findElement(By.id("month"));
		Select sMonth=new Select(month);
		sMonth.selectByVisibleText("Apr");
		Thread.sleep(4000);
		WebElement year=driver.findElement(By.id("year"));
		Select sYear=new Select(year);
		sYear.selectByVisibleText("2012");
		/*
		 * WebElement ele2=driver.findElement(By.id("month")); Select s2=new
		 * Select(ele2); s2.selectByValue("Jan"); Thread.sleep(4000); WebElement
		 * ele3=driver.findElement(By.id("year")); Select s3=new Select(ele3);
		 * s3.selectByValue("2012"); Thread.sleep(4000);
		 */
	}
}
