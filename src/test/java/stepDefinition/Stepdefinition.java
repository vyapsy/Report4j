package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class Stepdefinition {
static WebDriver driver;
    @Given("^User is on Home page$")
    public void user_is_on_home_page() throws Throwable {
        // code
    	System.out.println("Sri Aurobindo");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vyapari\\Documents\\driver\\chromedriver.exe");
	    //"C:\\Manju Old\\DRIVER\\chromedriver.exe"

		 driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    }

    @When("^User login with id and pass$")
    public void user_login_with_id_and_pass() throws Throwable {
    	// code
    	System.out.println("Life");
    	
    	
    }

    @Then("^Home page appears$")
    public void home_page_appears() throws Throwable {
    	System.out.println("yoga");
    }
    
    @When("^User login with \"([^\"]*)\" and pass \"([^\"]*)\"$")
    public void user_login_with_something_and_pass_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    	driver.findElement(By.name("login")).sendKeys(strArg1);
    	driver.findElement(By.name("passwd")).sendKeys(strArg2);
    	driver.findElement(By.name("proceed")).click();
    	
    }

    @Then("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are(String arg1) throws Throwable {
       
    	System.out.println(arg1);
    }

}