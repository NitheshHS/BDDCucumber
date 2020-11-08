package stepDefForDataDriven;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDef {
	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String username, String password) throws Throwable {
	   System.out.println("username "+ username);
	   System.out.println("password "+ password);
	}
	@When("^user enter FirstName and Lastname$")
	public void user_enter_FirstName_and_Lastname(DataTable dataTable) throws Throwable {
	     List<Map<String, String>> map = dataTable.asMaps(String.class, String.class);
	    System.out.println(map.get(0).get("FirstName"));
	    System.out.println(map.get(0).get("LastName"));
	    
	    List<List<String>> list = dataTable.asLists(String.class);
	    System.out.println(list.get(1).get(0));
	    System.out.println(list.get(1).get(1));
	    Assert.assertTrue(false);
	}
	@Given("^user launch the browser and enters the url \"([^\"]*)\"$")
	public void user_launch_the_browser_and_enters_the_url(String url) throws Throwable {
		
	    System.out.println(url);
	    
	}

	@And("^user enter valid crendential \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_valid_crendential_and(String username, String password) throws Throwable {
	   System.out.println(username);
	   System.out.println(password);
	   
	}
	@When("^user add a product to cart$")
	public void user_add_a_product_to_cart() throws Throwable {
	   System.out.println("user added a Adidas Shoes to cart");
	  
	}

	@When("^Do the payment using NetBanking$")
	public void do_the_payment_using_NetBanking() throws Throwable {
	    System.out.println("user done netbanking using yono sbi");
	    
	}

}
