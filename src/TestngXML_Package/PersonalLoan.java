package TestngXML_Package;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PersonalLoan {

@Test
	
	public void WebPersonalLoan() 
	{
		System.out.println("Web  Personal Loan clicked  Successful ");
	}
	
	@Test (groups="SmokeTC")
	
	public void MobilePersonalLoan() 
	{
		System.out.println("Mobile Personal Loan clicked  Successful ");
	}
	
	@Test
	public void APIPersonalLoan() 
	{
		System.out.println("API Personal loan clicked  Successful ");
	}
	
	@Test(dataProvider= "Getdata")
	
	public void DataProviderDemioMethod(String USERNAME,String PASSWORD) 
	{
		System.out.println(USERNAME);
		
		System.out.println(PASSWORD);
	}
	
	
	@DataProvider
	
	public Object[][] Getdata() {
		
		Object[][] objData = new Object[3][2];
		
		// 1ST SET OF COMBONATION IN AN OBJECT ARRAY OF SIZE 3,2
		
		objData[0][0] ="Dhiraj";
		objData[0][1] ="944842";
		
		// 2ND SET OF COMBONATION IN AN OBJECT ARRAY OF SIZE 3,2
		
		objData[1][0] ="Kumar";
		objData[1][1] ="953580";
		
		// 3RD SET OF COMBONATION IN AN OBJECT ARRAY OF SIZE 3,2
		
		objData[2][0] ="Sharma";
		objData[2][1] ="741159";
		
		return objData;
				
	}
	
}
