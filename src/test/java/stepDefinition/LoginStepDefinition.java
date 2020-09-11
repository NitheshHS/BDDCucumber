package stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;
	@Given("the browser is launched")
	public void the_browser_is_launched() {
	    System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
	    driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@Given("the login page is loaded")
	public void the_login_page_is_loaded() {
	    driver.get("http://localhost:8888/");
	}

	@When("enter username and password")
	public void enter_username_and_password() {
	    driver.findElement(By.name("user_name")).sendKeys("admin");
	    driver.findElement(By.name("user_password")).sendKeys("manager");
	}

	@When("click on login button")
	public void click_on_login_button() {
	    driver.findElement(By.id("submitButton")).click();
	}

	@Then("home page should be displayed")
	public void home_page_should_be_displayed() {
		Assert.assertTrue(driver.getTitle().contains("vtiger CRM 5"));
	    driver.close();
	}
	@When("^user enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enter_username_and_password(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("user_name")).sendKeys(arg1);
	    driver.findElement(By.name("user_password")).sendKeys(arg2);
	}

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.id("submitButton")).click();
	}

	@Then("^Home page is displayed$")
	public void home_page_is_displayed() throws Throwable {
		driver.close();
	}
	
	@Then("^Error message is dispayed$")
	public void error_message_is_dispayed() throws Throwable {
	 String  errormsg= driver.findElement(By.xpath("//div[@class='errorMessage']")).getText();
	 Assert.assertEquals(errormsg, "You must specify a valid username and password.");
	 driver.close();
	}
	
	@When("^user enter username and password$")
	public void user_enter_username_and_password(DataTable data) throws Throwable {
	   // List<List<String>> dataTable = data.asLists(String.class);
	    List<Map<String, String>> dataTable = data.asMaps(String.class, String.class);
	    driver.findElement(By.name("user_name")).sendKeys(dataTable.get(0).get("username"));
	    driver.findElement(By.name("user_password")).sendKeys(dataTable.get(0).get("password"));
	    
	}
}
