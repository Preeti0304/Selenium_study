package screenshot_prgm;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CreateaMethod {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(10000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File screenShot=ts.getScreenshotAs(OutputType.FILE);
		File screenShotSave=new File("./ScreenShot/google.png");
		Files.copy(screenShot, screenShotSave);

	}

}
