package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Java",Keys.ENTER); //==>Java enter  in search bar
		Thread.sleep(2000);
		WebElement value=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		System.out.println(value.getAttribute("value"));
		value.clear();
		driver.findElement(By.name("q")).sendKeys("TestNg",Keys.ENTER);
	}

}
