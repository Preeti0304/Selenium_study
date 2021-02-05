package selenium_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.gmail.com/");
		WebElement emailId=driver.findElement(By.id("identifierId"));
		emailId.sendKeys("preeti.pathak0340@gmail.com");
		WebElement next=driver.findElement(By.id("identifierNext"));
		next.click();
		
	}

}
