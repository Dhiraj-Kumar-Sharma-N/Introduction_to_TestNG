package TestngXML_Package;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VehicleLoan {

@Test
	
	public void WebVehicleLoan() 
	{
		System.out.println("Web  Vehicle Loan clicked  Successful ");
	}
	
	@Test (groups="SmokeTC")
	
	public void MobileVehicleLoan() 
	{
		System.out.println("Mobile Vehicle Loan clicked  Successful ");
	}
	
	@Test(dependsOnMethods= {"WebVehicleLoan","MobileVehicleLoan"} )
	
	public void APIVehicleLoan() 
	{
		System.out.println("API Vehicle loan clicked  Successful ");
	}
	
	@Test(enabled=true , timeOut= 4000)
	
	public void DummyMethod () 
	{
		System.out.println("DummyMethod clicked  Successful ");
	}
	
	@BeforeMethod
	
public void beforemethod() {
		
		System.out.println("Before method executed successfully and is executed before every test in the class in which it is specified ");
	}
	
	@AfterMethod
	
public void Aftermethod() {
		
		System.out.println("After method executed successfully and is executed after every test in the class in which it is specified ");
	}
	
@Parameters("VehicleLoanURL")
	
	@Test
	public void ParameterTest(String VehicleLoanURL) {
		
		System.out.println(VehicleLoanURL);
	
}

}
