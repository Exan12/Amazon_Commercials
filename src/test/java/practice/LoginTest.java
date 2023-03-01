package practice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass;

@Listeners(GenericLibraries.ListenersImplementationLibrary.class)
public class LoginTest extends BaseClass{

	@Test
	public void LoginAndLogoutTest()
	{
		Assert.fail();
		driver.findElement(By.xpath("//a[normalize-space()='Amazon miniTV']")).click();
		System.out.println("Hurreh!.... Its's Worked..........");
	}
	

}