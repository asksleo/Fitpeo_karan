Feature: To login into the functionality
Scenario:User with valid credential is able to login into the page
Given I am on login page of the application
When I enter the username and password
|username|password|
|papatestu12@gmail.com|@Papa007|
|karan.kumar.554@gmail.com|@Papa007|
|karan.kr12392@gmail.com|@Papa007|
Then I am on login page