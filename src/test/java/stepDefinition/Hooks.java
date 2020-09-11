package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before
	public void setUP() {
		System.out.println("Excecuted before scenario");
	}
	
	
	@After
	public void tearDown() {
		System.out.println("Exceuted after scenario");
	}
	
	@Before("@SmokeTest")
	public void smokeSetUp() {
		System.out.println("Exceuted before smoke scenario");
	}
	
	@After("@SmokeTest")
	public void smokeTearDown() {
		System.out.println("Exceuted after smoke scenario");
	}
	
	@Before(order=0)
	public void setUpFirst() {
		System.out.println("Exceuted first for each scenario");
	}
	
	@After(order=0)
	public void tearDownFirst() {
		System.out.println("Exceuted last for each scenario");
	}
}
