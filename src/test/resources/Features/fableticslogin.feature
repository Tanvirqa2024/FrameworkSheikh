Feature: fabletics login validation

Scenario Outline: Signin using valid email address and password

Given user is in fabletics website
When user click on body
And user click the signin button
And user enter an valid email address '<email address>'
And user enter valid password '<password>'
And user will click the signin button
Then user will be able to sign in fabletics


Examples:
|email address     |password  |
|starafin@gmail.com |Qawait24	|