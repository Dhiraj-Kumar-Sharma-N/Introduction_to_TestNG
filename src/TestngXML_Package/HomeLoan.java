package TestngXML_Package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoan {

@Test
	
	public void WebPersonalLoan() 
	{
		System.out.println("Web  Home Loan clicked  Successful ");
	}
	
	@Test (groups="SmokeTC")
	
	public void MobileHomeLoan() 
	{
		System.out.println("Mobile Home Loan clicked  Successful ");
	}
	
	@Test
	
	public void APIHomeLoan() 
	{
		System.out.println("API Home loan clicked  Successful ");
	}
	
	
	@BeforeClass
	
	public void beforeclassmethod() {
		
		System.out.println("Before class method executed successfully and is scoped within the class  in which it is specified ");
	}
	
	@AfterClass
	
	public void afterClassmethod() {
		
		System.out.println("After class method executed successfully and is scoped within the class  in which it is specified ");
	}
	
	@Parameters({"HomeLoanURL","UserName","Password"})
	
	@Test
	public void ParameterTest(String HomeLoanURL,String UserName,String Password) {
		
		System.out.println(HomeLoanURL);
		
		System.out.println(UserName);
		
		System.out.println(Password);
	}
}
