package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UrbanLadder {
	@FindBy(xpath="close-reveal-modal hide-mobile")
	private WebElement name;
	public UrbanLadder(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void click()
	{
		name.click();
	}
}
