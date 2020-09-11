Feature: Testing the login feature of vTiger application

Scenario: login to vTiger application with valid credentials
Given the browser is launched
And the login page is loaded
When enter username and password
And click on login button
Then home page should be displayed

Scenario: user enter valid username and password to login
Given the browser is launched
And the login page is loaded
When user enter username "admin" and password "manager"
And user clicks on login button 
Then Home page is displayed
