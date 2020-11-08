Feature: DataDriven Testing


Background:
	Given user launch the browser and enters the url "http://localhost:8888"
	And user enter valid crendential "admin" and "manager"

@RegressionTest
Scenario Outline: user enters the multiple username and password
When user enter "<username>" and "<password>"
Examples:
	|username|password|
	|Nithesh|12345|
	|chandrashekar|764321|
	|Vindya|12345|
	|Bhagya|7890|

@SmokeTest
Scenario: data driven testing using list
When user enter FirstName and Lastname
	|FirstName|LastName|
	|Nithesh|Gowda|
	
@Functional @RegressionTest
Scenario: user buy a product
When user add a product to cart
And Do the payment using NetBanking
