package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(xpath = "//span[normalize-space()='LG 242 L 3 Star Smart Inverter Frost-Free Double \"\r\n"
			+ "				+ \"Door Refrigerator (GL-I292RPZX, Shiny Steel, Door Cooling+, Gross Volume- 260 L)']")
	private WebElement LgFridge;
	
	@FindBy(xpath = "//span[@class='a-size-small sc-action-delete']//span[@class='a-declarative']")
	private WebElement DeleteBtn;
	
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

	public WebElement getLgFridge() {
		return LgFridge;
	}

	public WebElement getDeleteBtn() {
		return DeleteBtn;
	}
	
}
