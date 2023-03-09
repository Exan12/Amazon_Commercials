package CartModule;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibraries.BaseClass;
import ObjectRepository.CartPage;

@Listeners(GenericLibraries.ListenersImplementationLibrary.class)
public class CartTest extends BaseClass {

	@Test
	public void AddToCart()
	{
		
		CartPage cp = new CartPage(driver);
		cp.AddToCart(driver, "iphone 12");
	}
	
	@Test
	public void DeleteItem()
	{

		CartPage cp = new CartPage(driver);
		cp.DeleteItemInCart(driver,"iphone 12");
	}
	
	@Test
	public void FirstItem() throws Throwable
	{
		CartPage cp = new CartPage(driver);
		String PRODUCT = pLib.getpropertyfile("product");
		cp.ClickOnFirstItem(driver, PRODUCT);
	}
	
	@Test
	public void DeleteAddedFirstItem() throws Throwable
	{
		CartPage cp = new CartPage(driver);
		String PRODUCT = pLib.getpropertyfile("product");
		cp.DeleteFirstItem(driver, PRODUCT);
	}
}
