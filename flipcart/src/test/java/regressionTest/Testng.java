package regressionTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Testng {
	@BeforeSuite
	public void Suite()
	{
		System.out.println("Before suite");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("Before test");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("Before class");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before method");
	}
	@Test 
	public void Login()
	{
		System.out.println("Sucessfully Logged in");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("After Method");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("After Class");
	}
	@AfterTest
	public void at()
	{
		System.out.println("After test");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("After suite");
	}
	
		
	
}
