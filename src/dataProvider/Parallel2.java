package dataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel2 {
@Test
     public void Tc1() throws InterruptedException
     {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver(); //upcasting
	driver.manage().window().maximize(); //maximize
	driver.get("https://www.google.com/"); //link =-=google
	Thread.sleep(2000);	
	driver.close();
     }
}
