@Feature1
Feature: To validate the buy now  functionality  of flipcart application

Background:
Given To lauch the chrome browser and maximize window

Scenario: To validate buy now with search of mobile product
Given To lauch the chrome browser and maximize window

When To lauch the url of flipkart application
And To pass product in search field
And To click the search button
And To select the iphone pro product
And To handle the windows
And To select the buy now button
Then To close the browser

@Feature2

Scenario Outline: To validate the different product to search
When User has to hit the flipcart url
And User has to pass the data "<product>" in search field
And User has to click the search button

Examples:
|product| 
|Bat|
|Dress|
|Shoe|
