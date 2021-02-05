package selenium_1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); //upcasting
		driver.manage().window().maximize(); //maximize
		driver.get("https://www.google.com/"); //link =-=google
		Thread.sleep(2000);	
		/*
		 * WebElement
		 * search=driver.findElement(By.xpath("//input[@aria-label='Search']"));
		 * search.sendKeys("Java",Keys.ENTER);
		 * driver.findElement(By.name("btnk")).click();
		 */
		
		WebElement Search=driver.findElement(By.xpath("//input[@name='q']"));
		Search.sendKeys("Java",Keys.ENTER);		
	}

}
