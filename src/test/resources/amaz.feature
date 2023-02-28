Feature: To validate the account creation in amazon
Scenario: To create a new account account
Given To launch url
When To launch the amazon url
And To mouse hover hello sign and click the sign in button
And To click the create new amazon account
And To pass the name in first and last name text box
|Vikram|Raja|Ajith|Lakshmi|Suja|
And To pass the phone number in mobile number in text box
|8512456589|9578913456|8912345678|9523145678|
And To pass the email in email text box
|vikram@gmail.com|raja@gmail.com|amaar@gmail.com|
|selenium@gmail.com|test@gmail.com|visual@gmail.com|
|civil@gmail.com|Testing@gmail.com|vishal@gmail.com|
And To pass the password in password text box
And To click the continue button
Then acs
