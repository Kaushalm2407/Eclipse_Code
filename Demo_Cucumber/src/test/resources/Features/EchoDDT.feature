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
		Feature: Echo trak DDT scenarios
	  I want to use this template for my feature file

  @pri1 @Login
  	Scenario Outline: Login
    Given User is on Echo trak home page
    When User enters data as "<username>" and "<password>"
    Then An "<error message>" is displayed
    
    Examples: 
      | username  | password | error message             |
      | user001   | user001  | Invalid Username/Password |
      | user002   | user002  | Invalid Username/Password |
      
  @pri2 @Login  
     Scenario: Login
     Given User is on Echotrak Home Page
     When User enters data
     |username|password|
     |emp01   |emp01   |
     |emp02   |emp02   | 
     Then User is logged in
  @pri3 @Login
     Scenario: Employee Login 
     Given User is on Echotrak Home Page
     When User navigate to Employee Login page
     And User enters data
     |username|password|
     |emp01   |emp01   |
     |emp02   |emp02   | 
     Then User is logged in
