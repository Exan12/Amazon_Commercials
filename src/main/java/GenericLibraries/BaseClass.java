package GenericLibraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepository.HomePage;
import ObjectRepository.SignInPage;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class consists of the Prerequiste methods to start the testScript
 * @author HP
 *
 */
public class BaseClass {

	public PropertyFileLibrary pLib = new PropertyFileLibrary();
	public WebDriverLibrary wLib = new WebDriverLibrary();
	public WebDriver driver = null;
	public static WebDriver sDriver = null;

	@BeforeSuite
	public void bsConfigration()
	{
		// Reporter.log("- - - DataBase Connected Succesfully - - -",true);
	}
	
	@BeforeClass
	public void bcConfigration() throws Throwable
	{
		String BROWSER = pLib.getpropertyfile("browser");
		String URL = pLib.getpropertyfile("url");

		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			Reporter.log(" - - - "+BROWSER+" Has Launched Succesfully - - - ",true);
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			Reporter.log(" - - - "+BROWSER+" Has Launched Succesfully - - - ",true);
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			WebDriverManager.iedriver().setup();
			driver = new EdgeDriver();
			Reporter.log(" - - - "+BROWSER+" Has Launched Succesfully - - - ",true);
		}
		else
		{
			Reporter.log(" - - - Invalid Browser Name - - - ",true);
		}
		
		sDriver = driver;
		wLib.maximiseWindow(driver);
		wLib.waitForPageLoad(driver);
		driver.get(URL);
	}
	
	@BeforeMethod
	public void bmConfigration() throws Throwable
	{
		String EMAIL = pLib.getpropertyfile("email");
		String PASSWORD = pLib.getpropertyfile("password");
		
		SignInPage sp = new SignInPage(driver);
		sp.SignIn(EMAIL, PASSWORD);
		Reporter.log(" - - - Logged Into The Application Succesfully - - - ",true);
	}

	@AfterMethod
	public void amConfigration()
	{
		WebElement Element = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		wLib.mouseHoverOn(driver, Element);
		HomePage hp = new HomePage(driver);
		hp.Signout();
		Reporter.log(" - - - Logged Out From The Application Succesfully - - - ",true);
	}

	@AfterClass
	public void acConfigration() throws Throwable
	{
		String BROWSER = pLib.getpropertyfile("browser");
		driver.quit();
		Reporter.log(" - - - "+BROWSER+" Has Closed Succesfully - - - ",true);
	}

	@AfterSuite
	public void asConfigration()
	{
		// Reporter.log("- - - DataBase Closed Succesfully - - - ");
	}
}
