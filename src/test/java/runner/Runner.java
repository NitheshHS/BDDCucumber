package runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@Test
@CucumberOptions(features=".\\src\\test\\java\\featureFiles\\DataDriven.feature",
glue= {"stepDefinition"},
dryRun=false,
plugin="pretty")
public class Runner extends AbstractTestNGCucumberTests{

}
//tags={"@SmokeTest","@End2End"}==> AND

//tags={"@SmokeTest,@End2End"}==> OR

//tags= {"~@SmokeTest","~@RegressionTest"}==> ignore the tags