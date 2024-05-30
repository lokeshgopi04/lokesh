Feature: Adactin Hotel Booking Application 
Scenario: User Login The Adactin Application 
Given User Launches The Adactin Application 
When User Enters The Username In Username Field
 And User Enters The Password In Password Field 
 Then User Clicks The Login Button And Navigate To Next Page 
 
 
Scenario: User Navigated To Search Hotel Page 
 When User Selects The Location In The Location Field 
 And User Selects the Hotel Name.
 And User Enters The Hotels In Hotels Field
  And User Enters The RoomType In RoomType Field
   And User Enters The Number Of Rooms In Number Of Rooms Field
    And User Enters The Check-In Date In Check-In Date Field 
    And User Enters The Check-Out Date In Check-Out Date Field 
    And User Enters The Number Of Adults In Adults Per Room Field 
    And User Enters The Number Of Children In Children Per Room Field 
    Then User Clicks The Search Button 
    
    
  Scenario: User Provide the UserDetails to Book the Hotel
    When User Select the Hotels name and click the radiobutton.
    And User Click the continueButton. 
    And User Enters the User First Name in the First Name Field
    And User Enters the User Last Name in the Last Name Field
    And User Enters the Billing Address in the Billing Address Field
    And User Enters the Credit Card Number in the Credit Card Number Field
    And User Select the Credit Card Type in the Credit card list.
    And User Select the Expiry Date and Select the Year.
    And User Select the Expiry Month.
    And User Enter the Cvv Number in cvv field.
    Then Select the Booknow Button.
    
    Scenario: User Logout.
    When: User click the My Itinerary button.
    And User Click the Logout Button