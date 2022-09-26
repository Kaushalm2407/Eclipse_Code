#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: As a Registered user
  I want to be able to login to Rediffmail
  So that i can access my mailbox
  
  Various scenarios to test the login functionality

   @pri1 @Login
  Scenario: Valid Login
   Given user is on rediffmail home page
   When user enters valid username and password
   And user clicks on sign in button
   Then user is navigate to the inbox page
   
	 @pri2 @Login
  Scenario: Invalid Login
   Given user is on rediffmail home page
   When user enters invalid username and password
   And user clicks on sign in button
   Then An error is displayed
 