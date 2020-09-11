Feature: Testing the login feature of vTiger application

Background: browser is launched and login page is loaded
Given the browser is launched
And the login page is loaded

Scenario: user enter valid username and password to login
When user enter username "admin" and password "manager"
And user clicks on login button 
Then Home page is displayed

Scenario Outline: user enter the invalid credentials to login to application
When user enter username "<username>" and password "<password>"
And user clicks on login button
Then Error message is dispayed
Examples:
	|username|password|
	|admin|manager123|
	|admin123|manager|
