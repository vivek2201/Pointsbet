
Feature: Deposit
In order to deposit using credit card 
As a User
I am able to deposit

 Background:
    Given user is created with "userpriya504" and password "password1" 
    @Test1
  Scenario: Deposit through Credit/Debit card
    Given User is logged in
   	When Click on right menu
   	And Click on Deposit button
   	And Click on Other Methods
   	And Click on Credit/debit Card option
   	And Enter Cardnumber "4111 1111 1111 1111" and Expiry date "1232" and CVV "357" and Amount "10"
   	And Hit the Deposit button
   	Then Deposit should successfully happen
   	@Test2
   	Scenario: Deposit through Pay with my bank
    Given User is logged in
   	When Click on right menu
   	And Click on Deposit button
   	And Click on Online banking
   	And Click on Other banks
   	And Enter "demobank"
   	And Click on demo bank
   	
   	
   	
   	
   