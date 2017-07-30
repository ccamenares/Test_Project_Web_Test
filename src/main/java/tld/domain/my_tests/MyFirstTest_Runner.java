package tld.domain.my_tests;

import io.testproject.java.classes.DriverSettings;
import io.testproject.java.enums.DriverType;
import io.testproject.java.sdk.generated.TestProjectRunner;

public class MyFirstTest_Runner {
	
	// Setting the development token
	private final static String devToken = "fW7hn0jEvJXASPoM1jK5IauH0ebp081";
	
	public static void main(String[] args) throws Exception {
		// Creating driver settings to be used when running the test   
		DriverSettings driverSettings = new DriverSettings(DriverType.Chrome);
	
		// Running the test using TestProjectRunner (the last 'true' parameter is there to enable logging)
		try(TestProjectRunner runner = new TestProjectRunner(devToken, driverSettings,  true)) 
		{
			// Creating a instance of the  test
			MyFirstTest verifyTest = new  MyFirstTest();
	
			// Running the test 
			runner.run(verifyTest);
		}
		catch(Throwable e) {
			System.out.println("Execution failed: " +  e.getMessage());
		}
	}
}
