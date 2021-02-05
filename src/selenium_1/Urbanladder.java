package selenium_1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urbanladder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);	
		
		 WebElement close=driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		 close.click();
			/*
			 * WebElement
			 * trackOrder=driver.findElement(By.xpath("//a[contains(.,'Track Order')]"));
			 * trackOrder.click();
			 */
			
			  WebElement sale=driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
			  System.out.println(sale.getText());
				/* sale.click(); */
			 
		 
			/*
			 * WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
			 * search.sendKeys("sofas",Keys.ENTER); WebElement sofa1=driver.findElement(By.
			 * xpath("//img[@title='Weston Half Leather Sofa (Wine Italian Leather)']"));
			 * sofa1.click();
			 */
	}

}
