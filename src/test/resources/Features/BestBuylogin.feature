Feature: Best Buy sign in validation

  Scenario Outline: Signin using valid email and password
    Given user is in Best Buy Website
    When user click the Account button
    And user click the sign in button
    And user enter valid email address '<Email>'
    And user enter a valid password '<Password>'
    And user click Sign in button
    Then user will be able to sign in Best Buy

    Examples: 
    | Email  									| Password 		 |
    | Sktanvir999@gmail.com 	| Netherfield1 |