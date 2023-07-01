package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	@FindBy(xpath="//input[@placeholder='Username']")
	public static WebElement user;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	public static WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement submit;
	
	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	public static WebElement drop;
}
