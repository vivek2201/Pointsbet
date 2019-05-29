
Feature: As a User, want to deposit 
 @Test2
  Scenario: Deposit through Credit/Debit card
    Given User is logged in
   	When Click on right menu
   	And Click on Deposit button
   	And Click on Other Methods
   	And Click on Credit/debit Card option
   	And Enter Cardnumber "4111 1111 1111 1111" and Expiry date "1232" and CVV "357" and Amount "500"
   	And Hit the Deposit button
   	Then Deposit should successfully happen
   	
   	
   