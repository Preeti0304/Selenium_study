package selenium_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		WebElement emailId=driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		emailId.sendKeys("preeti@gmail.com"); 
		WebElement password=driver.findElement(By.xpath("//input[@data-testid='royal_pass']")); 
		password.sendKeys("1234");
		WebElement login=driver.findElement(By.id("u_0_b"));
		login.click();
		
//		driver.findElement(By.linkText("Forgotten password?")).click();
//		System.out.println(driver.getTitle());
	}

}
