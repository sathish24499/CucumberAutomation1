Feature: Qafox shopping 
  Scenario: verify Qafox
    Given launching page of Qafox
    When user should enter username and password 
    And user should click the login button
    When user search an item 
    And user loacate an item 
   When user adding item into the cart
   And user get into the shipping page
   When user proceed to the checkout process
   And user enter the billing details
   When user enter the delivery details 
   And user mention the delivery method
   When user mention the payment mode
   And user finally confirm the order
   
  # Examples:
   #|email							 |password	|item   |
   #|skpks1224@gmail.com|ABCabc@123|macbook|
 
