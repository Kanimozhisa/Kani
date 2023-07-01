package regressionTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> l=driver.findElements(By.id("nav-xshop"));
		for(WebElement ls:l)
		{
			System.out.println(ls.getText());
			if(ls.getText().equalsIgnoreCase("Prime"))
			{
				System.out.println("Homepage verified sucessfully and text is" +ls.getText());
			}
		}
		

	}

}
