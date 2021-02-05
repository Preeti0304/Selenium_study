package annotationsLearn;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_2 {
	@BeforeSuite
	public void bs()
	{
		System.out.println("Before suite");
	}
	@BeforeTest
	public void bT()
	{
		System.out.println("Before Test");
	}
	@BeforeClass
	public void beforeC()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void bmeforeM()
	{
		System.out.println("Before Method");
	}
	@Test
	public void tc1()
	{
		System.out.println("Hi..........from tc1");
	}
	@Test
	public void tc2()
	{
		System.out.println("Hi..... from tc2");
	}
	@AfterMethod
	public void  afterM()
	{
		System.out.println("After Method");
	}
	@AfterClass
	public void afterC()
	{
		System.out.println("After Class");
	}
	@AfterTest
	public void afterT()
	{
		System.out.println("After Test");
	}
	@AfterSuite
	public void afterS()
	{
		System.out.println("After Suit");
	}

}
