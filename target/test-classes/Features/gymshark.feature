#Feature: gymshark login validation
#
#Scenario Outline: login using valid email and password
#
#Given user is in gymshark website
#When user click the account button
#And user enter valid email '<email address>'
#And user enter valid password '<password>'
#And user click the login button
#Then user will be able to log in
#
#
#Examples:
#|email address      |password        |
#|07redking@gmail.com|31824QApractice!|


Feature: gymshark login validation

Scenario Outline: login using valid email and invalid password

Given user is in gymshark website
When user click the account button
And user enter valid email '<email address>'
And user enter invalid password '<password>'
And user click the login button
Then user will not be able to log in


Examples:
|email address      |password        |
|07redking@gmail.com|31824QApractice |