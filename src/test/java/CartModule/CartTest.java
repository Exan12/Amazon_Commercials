package CartModule;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass;
import GenericLibraries.WebDriverLibrary;
import ObjectRepository.CartPage;

@Listeners(GenericLibraries.ListenersImplementationLibrary.class)
public class CartTest extends BaseClass {

	@Test
	
	
	public void AddToCart()
	{
		
		CartPage cp = new CartPage(driver);
		WebDriverLibrary wlib=new WebDriverLibrary();
		cp.getSearchTextbox().sendKeys("Fridge");
		cp.getSearchBtn().click();

		driver.findElement(By.xpath("//span[normalize-space()='LG 242 L 3 Star Smart Inverter Frost-Free Double "
				+ "Door Refrigerator (GL-I292RPZX, Shiny Steel, Door Cooling+, Gross Volume- 260 L)']")).click();
		wlib.switchToWindow(driver, "Inverter");
		System.out.println("Switch to Inveter Page");
		cp.getAddToCartBtn().click();
		driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")).click();
		System.out.println("Entered into Cart Page");
		System.out.println("Item Added to cart Suceesfully");

	}
	
	@Test
	public void DeleteItem() throws Throwable
	{
		CartPage cp = new CartPage(driver);
		WebDriverLibrary wlib=new WebDriverLibrary();
		cp.getSearchTextbox().sendKeys("laptop");
		cp.getSearchBtn().click();
		driver.findElement(By.xpath("//span[text()='HP Chromebook X360 Intel Celeron N4020 14 inch(35.6 cm) Micro-Edge, "
				+ "Touchscreen, 2-in-1 Laptop (4GB RAM/64GB eMMC/Chrome OS/Intel UHD Graphics,1.49Kg), 14a-ca0506TU']")).click();
		wlib.switchToWindow(driver, "Galaxy");
		System.out.println("Switch to Galaxy Page");
		cp.getAddToCartBtn().click();
		driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")).click();
		System.out.println("Entered into Cart Page");
		Thread.sleep(5000);
		wlib.switchToWindow(driver, "gp");
		
		cp.getDeleteBtn().click();
		System.out.println("Deleted Item Succesfully ");
		
		
	}
	

}
