package program;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNG_Listener implements ITestListener {
	@Override		
    public void onTestFailure(ITestResult result) {					
		System.out.println("TestCases failed and TestCase Details are :"+result.getName());
        		
    }		

    @Override		
    public void onTestSkipped(ITestResult result) {					
    	System.out.println("TestCases skipped and TestCase Details are :"+result.getName());
    }		

    @Override		
    public void onTestStart(ITestResult result) {					
    	System.out.println("TestCases started and TestCase Details are :"+result.getName());
    }		

    @Override		
    public void onTestSuccess(ITestResult result) {					
    	System.out.println("TestCases success and TestCase Details are :"+result.getName());	
    }		

}
