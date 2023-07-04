package regressionTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.Utilits3;

public class Flipcartlogin extends Utilits3{
	public static WebDriver driver;
	public static ExtentTest test;
public static void main(String[] args)
{
	test = report.createTest("logintestcaseresults");
try
	{
		
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		WebElement d=driver.findElement(By.id("twotabsearchtextbox"));
		d.sendKeys("black kurti");
		d.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Chikankari Kurti for Women']")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		System.out.println("added to cart sucessfully");
		test.log(Status.PASS, "Login test case passed");
	}
	catch(Exception e)
	{
		System.out.println("Something went wrong");
		test.log(Status.FAIL, "Login test case failed");
	}
}
}
