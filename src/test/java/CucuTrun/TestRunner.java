package CucuTrun;

//import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",  // it selects all files in feature pkg OR /login.fea..
		glue="stepDefinition")            // glue ->pkg name



public class TestRunner extends AbstractTestNGCucumberTests{

}
