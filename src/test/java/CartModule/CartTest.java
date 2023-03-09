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
	public void DeleteItem() throws Throwable
	{

		CartPage cp = new CartPage(driver);
		cp.DeleteItemInCart(driver,"iphone 12");
	}
	

}
