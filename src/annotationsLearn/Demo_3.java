package annotationsLearn;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_3 {
	//(invocationCount=5)
	@Test(dependsOnMethods = {"tc2" ,"tc3"})  
	public void tc1()
	{
		Reporter.log("1Hey....!", true);
	}
	@Test  (dependsOnMethods = "tc3")//(enabled=false) //(invocationCount=0)
	public void tc2()
	{
		Reporter.log("2Hey....!", true);
	}
	@Test //(priority=-2)
	public void tc3()
	{
		Reporter.log("3Hey....!", true);
	}
	public void tc4()
	{
		Reporter.log("4Hey....!", true);
	}
	public void tc5()
	{
		Reporter.log("5Hey....!", true);
	}
	public void tc6()
	{
		Reporter.log("6Hey....!", true);
	}
	public void tc7()
	{
		Reporter.log("7Hey....!", true);
	}
}
