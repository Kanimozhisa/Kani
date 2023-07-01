package regressionTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.Login;
import pageObject.LoginObject;
import pageObject.Utilits;

public class OrangeHrm {
public static WebDriver driver;
@Test
	public void dropdown()
	{
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//WebElement user =driver.findElement(By.xpath("//input[@placeholder='Username']"));
		PageFactory.initElements(driver,Login.class);
		Login.user.sendKeys("Admin");
		PageFactory.initElements(driver,Utilits.class);
		//user.sendKeys("Admin");
		//WebElement pass=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		PageFactory.initElements(driver,Login.class);
		Login.pass.sendKeys("admin123");
		PageFactory.initElements(driver,Utilits.class);
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		PageFactory.initElements(driver,Login.class);
		Login.submit.click();
		PageFactory.initElements(driver,Utilits.class);
		//driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		PageFactory.initElements(driver,Login.class);
		Login.drop.click();
		PageFactory.initElements(driver,Utilits.class);
		List<WebElement> l= driver.findElements(By.xpath("//li//a[@class='oxd-userdropdown-link']"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//System.out.println("Size of list : "+l.size());
		for(WebElement item : l)
		{
			if(item.getText().equalsIgnoreCase("Logout"))
			{
				item.click();
				System.out.println("Sucessfully logged out");
				break;
			}
			else
			{
				System.out.println("Not found");
			}
		}
		
	}

}
