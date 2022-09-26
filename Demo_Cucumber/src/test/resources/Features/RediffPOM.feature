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
Feature: Rediff Scenarios
  I want to use this template for my feature file

  @tag1
  Scenario: Valid Login
  Given User is on Rediff Home Page
  When User logs in as "master01" and "master@1"
  And User clicks on login Button
  Then User is navigated to the mail page
  
  @tag1
  Scenario: Invalid Login
  Given User is on Rediff Home Page
  When User logs in as "guest01" and "guest@1"
  And User clicks on login Button
  Then An error message "" is displayed on login page
	
	@Reg
	Scenario: Registration
	Given User is on Rediff home page
	And User navigated to the registration page
	When User enterd following data
	|name|xyz|
	|email|xyz@gmail.com|
	|gender|f|
	|country|India|
	Then User is registered Successfully
	
  