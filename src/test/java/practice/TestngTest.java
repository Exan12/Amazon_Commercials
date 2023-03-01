package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass;

public class TestngTest extends BaseClass{

	@Test
	public void normaltest()
	{
		System.out.println("Hi...........");
	}

	@BeforeSuite
	public void bsConfig()
	{
		System.out.println("Testing bs Config.....");
	}

	@BeforeClass
	public void bcConfig()
	{
		System.out.println("Testing bc Config....");
	}

	@BeforeMethod
	public void bmConfig()
	{
		System.out.println("Testing bm Config....");
	}

	@AfterMethod
	public void amConfig()
	{
		System.out.println("Testing am Config.....");
	}

	@AfterClass
	public void acConfig()
	{
		System.out.println("Testing ac Config....");
	}

	@AfterSuite
	public void asConfig()
	{
		System.out.println("Testing as Config....");
	}

}
