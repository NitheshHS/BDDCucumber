package stepDefForDataDriven;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	WebDriver driver;
	//@before order in ascending order 
	//@Afetr order  in descending order
	@Before(order = 1)
	public void setUp() {
		
		System.out.println("Pre condition");
	}
	
	@Before(order = 0)
	public void ConnectDB() {
		System.out.println("connect to DB");
	}
	
	@After(order=1)
	public void tearDown(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			String screenshot = scenario.getName()+".png";
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest =new File("./screenshot/"+screenshot);
			Files.copy(src, dest);
			System.out.println("Take screenshot");
		}
		
		System.out.println("Post condition");
	}
	
	@After(order = 0)
	public void closeDB() {
		System.out.println("close connection with DB");
	}

}
