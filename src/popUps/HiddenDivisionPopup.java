package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.xpath("//b[contains(.,'admin')]"));
		WebElement Password = driver.findElement(By.xpath("//b[contains(.,'manager')]"));
		WebElement U_name = driver.findElement(By.xpath("//input[@name='username']"));
		U_name.sendKeys(username.getText());
		WebElement Pass = driver.findElement(By.xpath("//input[@name='pwd']"));
		Pass.sendKeys(Password.getText());
		WebElement login=driver.findElement(By.xpath("//a[@id='loginButton']"));
		login.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'About your actiTIME')]")).click();
		String str=driver.findElement(By.xpath("//td[@class='aboutCopyright']")).getText();
		System.out.println(str);
		Thread.sleep(1000);
		String str1=driver.findElement(By.xpath("//td[@class='aboutLinks']")).getText();
		System.out.println(str1);
	}

}
