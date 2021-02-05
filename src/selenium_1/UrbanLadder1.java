package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		driver.findElement(By.xpath("//a[contains(.,' Stores ')]")).click();
		Thread.sleep(4000);
		String location1=driver.findElement(By.xpath("//h3[contains(.,'Hadapsar, Pune')]")).getText();
		System.out.println(location1);
		String location2=driver.findElement(By.xpath("//h3[contains(.,'Bandra, Mumbai')]")).getText();
		System.out.println(location2);
		String location3=driver.findElement(By.xpath("//h3[contains(.,'Kirti Nagar, New Delhi')]")).getText();
		System.out.println(location3);
		String location4=driver.findElement(By.xpath("//h3[contains(.,'Domlur, Bangalore')]")).getText();
		System.out.println(location4);
		String location5=driver.findElement(By.xpath("//h3[contains(.,'JP Nagar, Bangalore')]")).getText();
		System.out.println(location5);
		String location6=driver.findElement(By.xpath("//h3[contains(.,'Sahakara Nagar, Bangalore')]")).getText();
		System.out.println(location6);
		String location7=driver.findElement(By.xpath("//h3[contains(.,'Mall Of India, Noida')]")).getText();
		System.out.println(location7);
		String location8=driver.findElement(By.xpath("//h3[contains(.,'Nungambakkam, Chennai')]")).getText();
		System.out.println(location8);
		String location9=driver.findElement(By.xpath("//h3[contains(.,'Creaticity, Pune')]")).getText();
		System.out.println(location9);
		String location10=driver.findElement(By.xpath("//h3[contains(.,'Kondapur, Hyderabad')]")).getText();
		System.out.println(location10);	
		
	}

}
