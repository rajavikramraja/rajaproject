

Feature: As a User, I want to Order the Oil in SCENT - Arts Website.
Background: 
Given The user enters the testing site.


@tag1
Scenario: The user downloads the Brochure
Given The user enters the testing site.
And click the About Us button.
Then scroll down and see the “Download Brochure (English)”
And check the Brochure is downloaded.

@tag2
Scenario: The user purchases the “Harmony”
And click the “Products” button.
Then mouse hover the “Products” button again hovers the “Aroma Oil”
And select the “Sweet”
Then Users can see the “Harmony” and choose the oil.
Then select the volume “1000ml” and add quality “3”
Then click “Add To Cart”
Then click the “Process To Checkout”

@tag3
Scenario: The user checks the missing product
And click the “Products” button.
Then mouse hover the “Products” button and clicks the “Car Diffusers”