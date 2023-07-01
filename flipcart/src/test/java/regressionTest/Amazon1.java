package regressionTest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
public class Amazon1 {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		WebElement d=driver.findElement(By.id("twotabsearchtextbox"));
				d.sendKeys("Apple iPhone 14 Pro Max (128 GB) - Space Black");
		d.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement c = driver.findElement(By.xpath("//*[text()='Apple iPhone 14 Pro Max (128 GB) - Space Black']"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		//jsExecutor.executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:yellow')", c);
c.click();
String mainWindowHandle = driver.getWindowHandle();
Set<String> allWindowHandles = driver.getWindowHandles();
Iterator<String> iterator = allWindowHandles.iterator();
Set<String> s=driver.getWindowHandles();
while (iterator.hasNext()) {
    String ChildWindow = iterator.next();
        if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
        driver.switchTo().window(ChildWindow);
        WebElement cart =driver.findElement(By.xpath("//span[input[@id='add-to-cart-button'] and span[@id='submit.add-to-cart-announce']]"));
        System.out.println("Heading of child window is " + cart.getText());
        
}

driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}
	}
}
