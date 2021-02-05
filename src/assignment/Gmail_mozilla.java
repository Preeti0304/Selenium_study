package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_mozilla {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("preeti.pathak0340@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(4000);
		WebElement primary=driver.findElement(By.xpath("//div[@id=':23']"));
		primary.isSelected();
	}

}






















/*		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("Gmail",Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(.,'Gmail - Google')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@class='h-c-header__cta-li g-mail-nav-links--mobile  link--last']/a[@class='h-c-header__nav-li-link ']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("preeti.pathak0340@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(4000);
		*/