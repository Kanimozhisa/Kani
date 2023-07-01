package regressionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Email {
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://mail.google.com/");
driver.findElement(By.id("identifierId")).sendKeys("kani175mozhi@gmail.com");
driver.findElement(By.xpath("//span[text()='Next']")).click();

		
		
		

	}

}
