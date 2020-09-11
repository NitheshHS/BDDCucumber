package stepDefinition;

import cucumber.api.java.en.Given;

public class TagsTestDemoStepDefinition {
	@Given("^Exceute scenario_One$")
	public void exceute_scenario_One() throws Throwable {
	    System.out.println("Exceute scenario_One");
	}

	@Given("^Execute scenario_Two$")
	public void execute_scenario_Two() throws Throwable {
		System.out.println("Exceute scenario_Two");
	}

	@Given("^Execute scenario_Three$")
	public void execute_scenario_Three() throws Throwable {
		System.out.println("Exceute scenario_Three");
	}

	@Given("^Execute scenario_Four$")
	public void execute_scenario_Four() throws Throwable {
		System.out.println("Exceute scenario_Four");
	}

	@Given("^Execute scenario_Five$")
	public void execute_scenario_Five() throws Throwable {
		System.out.println("Exceute scenario_Five");
	}

}
