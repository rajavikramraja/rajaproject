Feature: To validate the MYNTRA web application
Scenario:
To validate the search tshirt product then close window and check bag
Given To launch browser
When To launch url to myntra application
And To search Tshirt 
And select first product and select  size
And Click the add to bag
And close the tab
Then Click bag icon and Screenshot

