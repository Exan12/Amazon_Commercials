package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PomclassPractice {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		WebElement addr1 = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		// driver.navigate().refresh();
		System.out.println(addr1);
		addr1.click();
		
		// LOGIN
		driver.findElement(By.id("ap_email")).sendKeys("manikumar7864@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Abc@123");
		driver.findElement(By.id("signInSubmit")).click();
		
		// LOGOUT
		WebElement element=driver.findElement(By.xpath("//a[@class=\"nav-a nav-a-2 nav-truncate   nav-progressive-attribute\"]"));
		Actions ac =new Actions(driver);
		ac.moveToElement(element).perform();
		driver.findElement(By.xpath("//span[normalize-space()='Sign Out']")).click();
		driver.close();
	}

}

