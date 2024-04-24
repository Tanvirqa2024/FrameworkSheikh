
Feature: Run signup validation


Scenario Outline: Signup Run using valid Email and valid Password
  
Given user is in Run signup page
When user enter firstname '<FirstName>' and lastname '<LastName>'
And user enter valid Email '<Email>'
And user enter valid Password '<Password>'
And user enter Address '<Address>'
And user enter Zip Code '<ZipCode>'
And user enter City '<City>'
And user select Country '<Country>'
And user enter DOB '<DOB>'
And user enter Phone Number '<PhoneNumber>'
And user select Gender '<Gender>'
And user click Check Box
And user click CrtAcntBtn
Then user able to Create Account


Examples: 

|FirstName |LastName |Email 	 			 |Password	 |Address   		|ZipCode |City	|Country |DOB			 |PhoneNumber |Gender	|
|Olivia		 |Jackson	 |Olive@abc.com  |Abc123$	 	 |1 Java St 		|77777	 |Dhaka |BD			 |03181971 |8801722222  |F			|
|Kevin 		 |Hart		 |Khart.com			 |abcd			 |1 selenium st |75036	 |Frisco|US			 |05102000 |2144777777	|M			|


