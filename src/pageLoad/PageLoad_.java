package pageLoad;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLoad_ {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		//Customwait
		WebDriverWait ww=new WebDriverWait(driver,10);
		ww.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver driver) {
				JavascriptExecutor js=(JavascriptExecutor)driver;
				System.out.println(js.executeScript("return document.readyState").toString());
				boolean pgl=js.executeScript("return document.readyState").toString().equals("complete");
				return pgl;
			}		
		});
		//hi im github
	}
}
