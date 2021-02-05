package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_QA {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		
		a.dismiss();
		Thread.sleep(4000);
		String str=driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
		System.out.println("Text Recieved :-"+str);

	}

}
