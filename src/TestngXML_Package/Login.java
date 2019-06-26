package TestngXML_Package;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login{
	
	@Parameters("WebsiteURL")
	
	@Test
	public void ParameterTest(String WebsiteURL) {
		
		System.out.println(WebsiteURL);
		
	}
	@Test
	
	public void WebLogIn() 
	{
		System.out.println("Web LogIn Successful ");
	}
	
	@Test(groups="SmokeTC")
	
	public void MobileLogIn() 
	{
		System.out.println("Mobile LogIn Successful ");
	}
	
	@Test
	
	public void MobileSignIn() 
	{
		System.out.println("Mobile SignIn Successful ");
	}
	
	@Test
	
	public void APILogIn() 
	{
		System.out.println("API LogIn Successful ");
	}
	
	@BeforeTest
	
	public void BeforeTestMethod() 
	{
		System.out.println("BeforeTest Method executed prior to first test Successful and is scoped within the test folder of XML ");
	}
	
	@AfterTest
	
	public void AfterTestMethod() 
	{
		System.out.println("AfterTest Method executed post to all test Successful and is scoped within the test folder of XML ");
	}
}

