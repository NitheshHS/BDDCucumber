package browserStack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchApp {
	public static void main(String[] args) throws MalformedURLException {
		final String USERNAME = "nitheshhs2";
		final String AUTOMATE_KEY = "9ksdZcoktyvM3b2SXZsP";
		final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
		
		DesiredCapabilities caps = new DesiredCapabilities();
        
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "80");
		caps.setCapability("name", "nitheshhs2's First Test");
		
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		
		driver.get("https://www.google.com/");
		driver.quit();
		
		
		
		
	}

}
