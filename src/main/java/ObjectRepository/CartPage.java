package ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibraries.WebDriverLibrary;

/**
 * @author HP
 *
 */
public class CartPage {
	
	// DECLARATION
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement SearchTextbox;
	
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	private WebElement SearchBtn;
	
	@FindBy(id = "add-to-cart-button")
	private WebElement AddToCartBtn;
	
	@FindBy(xpath = "//div[@class='s-main-slot s-result-list s-search-results sg-row']")
	private List<WebElement> AllMobiles;
	
	@FindBy(xpath = "//span[@class='a-size-small sc-action-delete']//span[@class='a-declarative']")
	private WebElement DeleteBtn;
	
	@FindBy(xpath = "//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")
	private WebElement CartButton;
	
	@FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal']"
			+ "[normalize-space()='Apple iPhone 12 (128GB) - White']") private WebElement Iphone12;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]"
			+ "/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]")
	private WebElement firstElement;
	
	
	// Iniatialization
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	// Utilization
	public WebElement getSearchTextbox() {
		return SearchTextbox;
	}

	public WebElement getSearchBtn() {
		return SearchBtn;
	}

	public WebElement getAddToCartBtn() {
		return AddToCartBtn;
	}

	public WebElement getDeleteBtn() {
		return DeleteBtn;
	}
	
	public List<WebElement> getAllMobiles() {
		return AllMobiles;
	}

	public WebElement getCartButton() {
		return CartButton;
	}

	public WebElement getIphone12() {
		return Iphone12;
	}
	
// BUSINESS LIBRARY LOGICS
	
	/**
	 * This Method is used to Add the Product To the Cart
	 * @param driver
	 * @param ItemName
	 */
	public void AddToCart(WebDriver driver,String ItemName)
	{
		WebDriverLibrary wLib = new WebDriverLibrary();
		SearchTextbox.sendKeys(ItemName);
		SearchBtn.click();
		System.out.println(AllMobiles.size());
		for(int i=0;i<AllMobiles.size();i++)
		{
			if(AllMobiles.get(i).getText().contains("Apple iPhone 12 (128GB) - White"))
			{
				Iphone12.click();
				break;
			}
		}
		wLib.switchToWindow(driver, "Galaxy");
		System.out.println("Switch to Galaxy Page");
		AddToCartBtn.click();
		System.out.println("Entered into Cart Page");
		CartButton.click();
		System.out.println("Item Added to cart Suceesfully");
		
	}
	
	/**
	 * This Method is used to Delete the Product From the Cart
	 * @param driver
	 * @param ItemName
	 */
	public void DeleteItemInCart(WebDriver driver,String ItemName)
	{
		WebDriverLibrary wLib = new WebDriverLibrary();
		SearchTextbox.sendKeys(ItemName);
		SearchBtn.click();
		System.out.println(AllMobiles.size());
		for(int i=0;i<AllMobiles.size();i++)
		{
			if(AllMobiles.get(i).getText().contains("Apple iPhone 12 (128GB) - White"))
			{
				Iphone12.click();
				break;
			}
		}
		wLib.switchToWindow(driver, "Galaxy");
		System.out.println("Switch to Galaxy Page");
		
		AddToCartBtn.click();
		wLib.switchToWindow(driver, "cart");
		CartButton.click();
		System.out.println("Item Added to cart Suceesfully");
		DeleteBtn.click();
		System.out.println("Deleted Item Succesfully ");
	}
	
	/**
	 * This Method is used to click on the First Item of the Product
	 * @param driver
	 * @param PRODUCT
	 * @throws Throwable
	 */
	public void ClickOnFirstItem(WebDriver driver,String PRODUCT) throws Throwable
	{
		WebDriverLibrary wLib = new WebDriverLibrary();
		SearchTextbox.sendKeys(PRODUCT);
		SearchBtn.click();
		firstElement.click();
		wLib.switchToWindow(driver, "keywords");
		System.out.println("Switched to "+PRODUCT+" Page");
		AddToCartBtn.click();
		wLib.switchToWindow(driver, "cart");
		CartButton.click();
		System.out.println("Item Added to cart Suceesfully");
	}
	
	/**
	 * This Method is used to Delete the First Item Added
	 * @param driver
	 * @param PRODUCT
	 * @throws Throwable
	 */
	public void DeleteFirstItem(WebDriver driver,String PRODUCT) throws Throwable
	{
		WebDriverLibrary wLib = new WebDriverLibrary();
		SearchTextbox.sendKeys(PRODUCT);
		SearchBtn.click();
		firstElement.click();
		wLib.switchToWindow(driver, "keywords");
		System.out.println("Switched to "+PRODUCT+" Page");
		AddToCartBtn.click();
		wLib.switchToWindow(driver, "cart");
		CartButton.click();
		System.out.println("Item Added to cart Suceesfully");
		DeleteBtn.click();
		System.out.println("Deleted Item Succesfully ");
	}
}
