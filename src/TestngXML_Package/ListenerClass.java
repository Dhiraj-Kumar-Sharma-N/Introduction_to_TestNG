package TestngXML_Package;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// ITestListener API INTERFACE which implements  TestNG Listener

public class ListenerClass implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub ( at the end of all the test cases)
		System.out.println("Test Cases Executed Successfully ");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub  ( On Start of class )
		System.out.println("Test Started Successfully ");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Cases failed but within Success %  Successfully ");
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("Test Cases Failed " + arg0.getName());
		System.out.println("The method name that failed is : " + arg0.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub  ( On Start of test )
		
		System.out.println("Test Cases Skipped Successfully ");
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Cases Started  Successfully ");
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub ( if all the test cases are executed successfully )
		System.out.println("Successfully Testing  ");
		
	}

	
}
