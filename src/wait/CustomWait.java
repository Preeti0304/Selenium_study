package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("E:\\Ankita\\Selenium Batch/sam1.html");
		WebDriverWait ww = new WebDriverWait(driver, 10);
		ww.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver arg0) {
				// TODO Auto-generated method stub
				return !driver.findElement(By.xpath("//div[1]/input[1]")).getAttribute("name").equals("alia");
			}
		});
		Thread.sleep(2000);
		driver.findElement(By.name("textA")).sendKeys("Preeto");

	}

}
