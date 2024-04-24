Feature: Facebook signup validation


Scenario Outline: signup facebook using Phone number and Email

Given user is in facebook signup page
When user enter firstname '<FirstName>' and last name '<LastName>'
And user enter Phone number '<Phn Number>'
And user enter Password '<Passwword>'
And user select DOB Month '<Month>' and '<Day>' and '<Year>'
And user click Gender '<Gender>'
And user click signup button
Then user able to signup

Examples:
|FirstName|LastName|Phn Number|Passwword|Month	|Day		|Year		|Gender|
|Sheikh   |Arafin  |214567889 | afsfh22$|		Jan		|20			|1971		|Male|
|Eric			|John			|3245666	|yegtuh65	|Mar			|3			|2001		|Female|