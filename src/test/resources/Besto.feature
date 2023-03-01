
Feature: User want to order the food

Scenario: To validate the invalid username and password
Given To launch the chrome browser and maximize the window of besto app
When  To launch the url of the besto app
And  To click the account button
And  To pass invalid username in phone field of besto app
And  To pass invalid password in password field of besto app
And  To click the login button of besto app
And To check the output of besto app
Then close the browser of besto app

Scenario: User goes to add the masala dosa
Given To launch the chrome browser and maximize the window of besto app
When user hits the url of besto app
And user select the  dosa in dropdown labeled
And user select the masala dosa in list
And user check the available time

     
