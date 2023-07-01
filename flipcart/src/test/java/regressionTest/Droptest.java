package regressionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;





import io.github.bonigarcia.wdm.WebDriverManager;

public class Droptest {
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement drop =driver.findElement(By.xpath("//select"));
		//Select d=new Select(driver.findElement(By.xpath("//select")));
		Select d = new Select(drop);
		d.selectByVisibleText("Angola");
		d.selectByIndex(1);
		d.selectByValue("AIA");

	}

}
