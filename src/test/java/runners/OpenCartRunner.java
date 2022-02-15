package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src//test//resources//features//PlaceOrder.feature",
		glue = {"stepDefs"},
				monochrome=true
				
		)
public class OpenCartRunner extends AbstractTestNGCucumberTests {
	
	
}

