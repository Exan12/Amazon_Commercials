package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * This classs is used to find the Elements of Sign-In Page
 * @author HP
 *
 */
public class SignInPage {
	
	// Declaration
	@FindBy(id = "ap_email")
	private WebElement EmailTextField;
	
	@FindBy(id = "continue")
	private WebElement ContinueBtn;
	
	@FindBy(id = "ap_password")
	private WebElement Password;
	
	@FindBy(id = "signInSubmit")
	private WebElement SubmitButton;
	
	@FindBy(id = "nav-link-accountList-nav-line-1")
	private WebElement AccountsAndListBtn;
	
	// Initialization
	public SignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	// Utilization
	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getContinueBtn() {
		return ContinueBtn;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}
	
	public WebElement getAccountsAndListBtn() {
		return AccountsAndListBtn;
	}


// BUSINESS LIBRARY LOGICS
	

	/**
	 * This method is used for Sign-In in Amazon Application
	 * @param email
	 * @param password
	 * @throws Throwable 
	 */
	public void SignIn(String email,String password)
	{
		AccountsAndListBtn.click();
		System.out.println("Accounts And List Button Clicked Successfully....");
		
		EmailTextField.sendKeys(email);
		System.out.println("Email entered Succesfully.....");
		
		ContinueBtn.click();
		System.out.println("Continue Button Clicked Sucessfully....");
		
		Password.sendKeys(password);
		System.out.println("Password Entered Succesfully");
		
		SubmitButton.click();
		System.out.println("Submit button Clicked Succesfully........");
		
	}
	
	
}
