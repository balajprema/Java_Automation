Feature: Online Shopping functionality

Background: User wants to login the adactin application
        Given User launches the application
        When User enters the "standard_user" as Username
        And User enters the "secret_sauce" as Password
        And User clicks the login button
        Then User validates the login button
   
@login
Scenario: User wants to login the adactin application
        Given User launches the application
        When User enters the "standard_user" as Username
        And User enters the "secret_sauce" as Password
        And User clicks the login button
        Then User validates the login button
        
        
@smokeTest
Scenario: User wants to purchase some products
     When User adds the backpack to cart
     And User adds the jacket to cart
     And User adds the tshirt to cart
     And User clicks the Shopping cart 
     Then User validates the Shopping cart
     
@smokeTest
Scenario: User Wants to checkout
     When User clicks the checkout button
     Then User validates the checkout button
  
Scenario: User needs to provide personal information
     When User enters "Padma" as firstname
     And User enters "Priya" as lastname
     And User enters "620102" as postal code
     And User clicks continue button
     Then User validates the continue button

Scenario: User completes the shopping process
    When User clicks the finish button
    Then User validates the finish button