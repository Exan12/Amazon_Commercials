import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Delete {
public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
WebDriver	driver=new ChromeDriver();
driver.get("https://www.amazon.in/ref=nav_logo");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone14");
driver.findElement(By.id("nav-search-submit-button")).click();
driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]")).click();
Set<String> allWindows = driver.getWindowHandles();
List<String> windowslist= new ArrayList(allWindows);
driver.switchTo().window(windowslist.get(1));
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")).click();
System.out.println(allWindows.size());
driver.findElement(By.xpath("//span[@class='a-size-small sc-action-delete']//span[@class='a-declarative']")).click();
}
}
