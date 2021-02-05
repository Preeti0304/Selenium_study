package selenium_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HtmlPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Demo1.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("a"));
		Select s1=new Select(ele);
		//s1.selectByIndex(2);
		//s1.selectByValue("125");
		/*
		 * s1.selectByVisibleText("124"); ; Select s2=new Select(ele1);
		 * s2.selectByVisibleText("323");
		 */
		WebElement ele1=driver.findElement(By.id("b"));
		Select s2=new Select(ele1);
		if(s2.isMultiple())
		{
			List <WebElement> vals=s2.getOptions();
			
			/*
			 * s2.selectByValue("323"); s2.selectByValue("324");
			 */
			for(WebElement val:vals)
			{
				s2.selectByValue(val.getText());
				Thread.sleep(1000);
			}
		}
		System.out.println(s2.getFirstSelectedOption().getText());
		List<WebElement> sopt=s2.getAllSelectedOptions();
		for (WebElement opt : sopt) {
			System.out.println(opt.getText());
			Thread.sleep(2000);
		}
		s1.deselectAll();
		
	}

}
