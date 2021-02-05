package selenium_1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	Thread.sleep(2000);
	//driver.close();
	String url=driver.getCurrentUrl();
	System.out.println(url);
	System.out.println(driver.getTitle());
	System.out.println(driver.getPageSource());
		driver.quit();
	}
	

}
