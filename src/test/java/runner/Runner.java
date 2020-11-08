package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@Test
@CucumberOptions(features=".\\src\\test\\java\\featureFiles\\DataDrivenTest.feature",
glue= {"stepDefForDataDriven"},
dryRun=false,
monochrome = true,
tags = {"@Functional,@RegressionTest"},
plugin={"pretty","html:target/cucumber-report",
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})
public class Runner extends AbstractTestNGCucumberTests{
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(".\\src\\test\\java\\extent-config.xml");
        
    }
}
//tags={"@SmokeTest","@End2End"}==> AND

//tags={"@SmokeTest,@End2End"}==> OR

//tags= {"~@SmokeTest","~@RegressionTest"}==> ignore the tags