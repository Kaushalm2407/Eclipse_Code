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
Feature: Amazon Search
  All scenarios related to search functionality

  Background: Search
    Given User is on Amazon home page
    When User search for "Mobile"
    Then Result for "Mobile" are displayed
  
  
   Scenario: Sort results
    When User sorts by "Avg. Customer Review"
    Then Result are sorted
    
    
    Scenario: Filter results
    When User Filters by "Brand"
    Then Results are filtered