@Actitime
Feature: Login feature
@Valid
Scenario Outline: Valid login to actitime application
Given User enters the url as "http://localhost/login.do"
When He enters the username as "<username>"
And he enters the password as "<password>"
And he clicks on login button
Then Home page should be displayed
Examples: 
|username|password|
|admin|manager|

