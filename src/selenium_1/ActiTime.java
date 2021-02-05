package selenium_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		WebElement logo=driver.findElement(By.xpath("//div[@class='atProductName']")); //actiTIME
		WebElement piy=driver.findElement(By.xpath("//td[@id='headerContainer']"));//Please Identify Yourself
		WebElement admin=driver.findElement(By.xpath("//td[@id='adminCredentialsHeader']"));//Administrator
		WebElement regularUser=driver.findElement(By.xpath("//td[@id='userCredentialsHeader']"));// Regular User
		WebElement keepMeLoggedIn=driver.findElement(By.xpath("//label[@id='keepLoggedInLabel']"));//Keep me Logged in
		
		WebElement username=driver.findElement(By.xpath("//b[contains(.,'admin')]"));
		System.out.println("Id is " +username.getText());
		WebElement Password=driver.findElement(By.xpath("//b[contains(.,'manager')]"));
		System.out.println("Password is " +Password.getText());
		  WebElement U_name=driver.findElement(By.xpath("//input[@name='username']"));
		  U_name.sendKeys(username.getText()); 
		  WebElement Pass=driver.findElement(By.xpath("//input[@name='pwd']"));
		  Pass.sendKeys(Password.getText());
		WebElement checkBox=driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")); //checkBox
		//checkBox.click();
		WebElement login=driver.findElement(By.xpath("//a[@id='loginButton']"));
		login.click();
		Thread.sleep(10000);
		WebElement newbutton =driver.findElement(By.xpath("//span[contains(.,'New')]"));
		newbutton.click();
		Thread.sleep(10000);
		WebElement dropdown=driver.findElement(By.xpath("//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']/descendant::div[@class='comboboxButton']"));
		dropdown.click();
		Thread.sleep(10000);
		WebElement newCustomer=driver.findElement(By.xpath("//div[@class='searchItemList']/div[contains(.,'- New Customer -')]"));
		newCustomer.click();
		Thread.sleep(10000);
		WebElement name=driver.findElement(By.xpath("//input[@class='newCustomer newCustomerProjectField inputFieldWithPlaceholder']"));
		name.sendKeys("Preeti");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='newProject newCustomerProjectField inputFieldWithPlaceholder']")).sendKeys("Xyz");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='components_button withPlusIcon']/div[contains(.,'Create Tasks')]")).click();
		Thread.sleep(4000);
		String err=driver.findElement(By.xpath("//div[@class='errorMessageBox']/descendant::span[contains(.,'Please correct all errors in the fields highlighted in red.')]")).getText();
		System.out.println(err);
			
	}
}
		
		
		
		//WebElement logout=driver.findElement(By.xpath("//a[@id='logoutLink']"));
		//logout.click();
		
		/*driver.findElement(By.partialLinkText("Inc.")).click();
		Set<String>wins=driver.getWindowHandles();
		for(String win:wins)
		{
			driver.switchTo().window(win);
		}
		System.out.println(driver.getTitle());
		}
				*/
				
	

		
	
