package unitTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class Demo extends DemoParent {

	@Test
	public void tc_1() throws InterruptedException {
		WebElement Search = drive.findElement(By.xpath("//input[@name='q']"));
		Search.sendKeys("Java", Keys.ENTER);
		System.out.println("tc1");
	}

	@Test
	public void tc_2() throws InterruptedException {
		WebElement Search = drive.findElement(By.xpath("//input[@name='q']"));
		Search.sendKeys("testNG", Keys.ENTER);
		System.out.println("tc2");
	}

}
