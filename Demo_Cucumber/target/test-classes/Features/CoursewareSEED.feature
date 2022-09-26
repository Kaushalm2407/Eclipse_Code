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
Feature: Login
  Login courseware seed infotech

  @tag1
  Scenario: Invalid Login
    Given User is on Courseware login page
    When User enters the invalid username and password
    And User click on login button
    Then An error message show on display

  @tag1
 	Scenario: Valid Login
 	Given User is on Courseware Login page
 	When User enters Valid username and password 
 	And User click in login button
 	Then User navigate to login home page