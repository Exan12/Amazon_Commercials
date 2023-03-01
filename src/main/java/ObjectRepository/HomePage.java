package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	
	// Declaration
	@FindBy(xpath = "//a[@id='nav-link-accountList']")
	private WebElement HelloManiBtn;
	
	@FindBy(linkText = "Sign Out")
	private WebElement SignoutLnk;
	
	// Initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	// Utilization
	public WebElement getHelloManiBtn() {
		return HelloManiBtn;
	}

	public WebElement getSignoutLnk() {
		return SignoutLnk;
	}

// BUSINESS LIBRARY LOGICS
	
	/**
	 * This Method is used to Logout from the Amazon Application
	 */
	public void Signout()
	{
		SignoutLnk.click();
	}
	
	
	

}
