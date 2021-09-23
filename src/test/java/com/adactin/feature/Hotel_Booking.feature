Feature: Testing the end to end functionality of hotel booking application named Adactin

Scenario: Check whether user can login using valid credentials
    Given User entered the application URL successfully
    When user enters the Email value
    And user enters the valid password
    And hit Login button
    Then user has to login into the booking page
 
 Scenario: check user can search hotel by filling all necessary details
 	Given User already logged into the application using valid credentials
 	And user chooses the location using location drop down
 	And user chooses the hotels using hotels drop down
 	And user chooses the Roomtype using Roomtype drop down
 	And user chooses the Number of Rooms using Number of Rooms drop down
 	And user chooses the Check-in Dates using Check-in dates drop down
 	And user chooses the Check-out dates using Check-out dates drop down
 	And user chooses the Adults per room using Adults per room drop down
 	And user chooses the Children per room using Children per room drop down
 	And user hits Search button
 	Then User should navigate to select hotel page where all chosen details were displayed
 	
 	Scenario: verify user able to continue with selected hotel
 	Given User naviagted to select hotel page
 	And user chooses the radio button under select field
 	Then user hits the CONTINUE button
 	
 	
 Scenario: Verify user able to book a hotel by filling out mandatory address field
 	Given User navigated to Book a hotel page by selecting the desired hotel
 	And User enters Name in First name field
 	And user enters Last name in Last name field
 	And User enters Billing address in Billing address field
 	And user enters Credit card Number in Credit Card No field
 	And user enters Credit card type in Credit card type field
 	And User chooses Expiry date from drop down
 	And user keyed in CVV number in CVV field
 	Then user hits Book now button
 	
 	Scenario: Verify user able to view Itinerary
 	Given All chosen details were auto generated in the Booking confirmation page
 	And user hits MY ITINERARY button
 	Then all booked itinerary should be displayed 
 	
 	Scenario: Verify user able to cancel booked hotel
 		Given All booked hotel details were displayed
 		And User check box the hotel which need to be cancelled
 		And User hits Cancel selected button
 		And user hits OK in warning pop up
 		Then selected hotel booking gets cancelled
 		
 
 	

 	