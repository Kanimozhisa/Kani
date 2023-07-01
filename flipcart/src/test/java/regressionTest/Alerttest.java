package regressionTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerttest {
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		//driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		//driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		Alert a= driver.switchTo().alert();
		String alertMessage= a.getText();
		System.out.println(a.getText());
		a.accept();
		
	

	}

}
