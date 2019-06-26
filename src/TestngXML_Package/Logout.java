package TestngXML_Package;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Logout{
	
	@Test
	
	public void WebLogout() 
	{
		System.out.println("Web Logout Successful ");
	}
	
	@Test(groups="SmokeTC")
	
	public void MobileLogout() 
	{
		System.out.println("Mobile Logout Successful ");
		Assert.assertTrue(false);
	}
	
	@Test
	
	public void MobileSignOut() 
	{
		System.out.println("Mobile SignOut Successful ");
	}
	
	@Test
	
	public void APILogout() 
	{
		System.out.println("API Logout Successful ");
	}
	
	@BeforeSuite
	
	public void BeforeSuiteMethod() 
	{
		System.out.println("BeforeSuite Method executed prior to first test Successful ");
	}
	
	@AfterSuite
	
	public void AfterSuiteMethod() 
	{
		System.out.println("AfterSuite Method executed post to all test Successful ");
	}
}