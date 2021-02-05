package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryUI {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(10000);
		WebElement f=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(f);
		Thread.sleep(2000);
		WebElement from=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement to=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(from, to).build().perform();
		String str=driver.findElement(By.xpath("//p[contains(.,'Dropped!')]")).getText();
		System.out.println(str);
	}

}


/*
 * WebElement f=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
 * driver.switchTo().frame(f); Thread.sleep(2000); WebElement
 * ele=driver.findElement(By.xpath("//div[@id='draggable']")); Actions a =new
 * Actions(driver); a.dragAndDropBy(ele, 150, 0).build().perform();
 */

/*WebElement f=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(f);
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//div[@id=\'draggable\']"));
		WebElement ele1=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(ele, ele1).build().perform();
		
		WebElement message=driver.findElement(By.xpath("//p[contains(.,'Dropped!')]"));
		System.out.println(message.getText());
 * */
