package selenium_1;
//program to get all link on the web page while searching java ==>click on java ==>on that apge fetch all the link
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Java",Keys.ENTER); //==>Java enter  in search bar
		Thread.sleep(2000);
		List<WebElement>links=driver.findElements(By.tagName("a")); //all link will be in anchor tag
		for(WebElement allLinks:links)   //list of all links will be fetched whose return type is webElement
		{
			System.out.println(allLinks.getText());   //will display the text of all links to console
		}
	}
}
/*
 * driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement link:links)
		{
			System.out.println(link.getText());
		}*/