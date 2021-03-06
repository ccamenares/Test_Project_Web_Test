package tld.domain.my_tests;

import org.openqa.selenium.WebDriver;

import io.testproject.java.enums.ExecutionResultType;
import io.testproject.java.sdk.generated.codeblocks.Test;

public class MyFirstTest extends Test {

	@Override
	protected ExecutionResultType execute() throws Exception {
		// TODO Auto-generated method stub
		
		// Get driver initialized by TestProject  Agent
		// No need to specify browser type, it can be done later via UI
		WebDriver  driver  =  this.getWebDriver();
		
		// Navigate to Google
		driver.navigate().to("https://www.google.com/ncr");
		
		// Retrieve page title
		String title = driver.getTitle();
		
		if  (title.contains("Google")) {
			// Assert success for the entire test 
			return ExecutionResultType.Passed;
			}
		else {
			// Setting the general test failure  message
			this.setMessage(String.format("Actual title is: %s",  title));
			
			// Assert failure for the entire test
			return ExecutionResultType.Failed;

			}
	}

}
