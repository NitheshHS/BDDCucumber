Feature: Testing the login feature of vTiger application

Background: browser is launched and login page is loaded
Given the browser is launched
And the login page is loaded

Scenario: user enter valid username and password to login
When user enter username and password
|username|password|
|admin|manager|
|admin|manager1|
And user clicks on login button 
Then Home page is displayed

Scenario: user enter valid username and password to login
When user enter username and password
|admin|manager|
|admin|manager1|
And user clicks on login button 
Then Home page is displayed