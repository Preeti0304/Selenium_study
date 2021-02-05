package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("admin");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.xpath("//input[@name='pwd']"));
		password.sendKeys("manager");
		Thread.sleep(2000);
		WebElement loggedIn=driver.findElement(By.xpath("//label[@id='keepLoggedInLabel']"));
		loggedIn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
	}

}
