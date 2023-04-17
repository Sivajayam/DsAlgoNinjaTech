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
@Queue
Feature: Queue
  I want to use this template for my feature file
 # Background: User launch home page of an dsalgo project
#Given The user opens DS Algo portal link
#When The user clicks the Get Started button
#Then The user should be redirected to homepage
#When The user clicks Sign In
#Given The user is on the SignIn page
#When The user fills the form with the data from sheet '<WorkSheetName>' and clicks LoginButton
#Then The user sign in successfully 

  Scenario: User validate Implementation of Queue in Python page
    
    When User clicks on Getstarted button under Queue
   
    Then User clicks on Implementation of Queue in Python
    When User clicks on Try here under Implementation of Queue in Python
    When User enters the pythonCode of Implementation of Queue in Python
   And clicks on Run button of Implementation of Queue in Python
   Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
   
   Scenario: User validate Implementation using collections deque
  
    When User clicks on Getstarted button under Queue
   
    Then User clicks on Implementation using collections deque
    When User clicks on Try here under Implementation using collections deque
    When User enters the pythonCode of Implementation using collections deque
   And clicks on Run button of Implementation using collections deque in Python
   Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
   
   Scenario: User validate Implementation using array
    
    When User clicks on Getstarted button under Queue
    
    Then User clicks on Implementation using array
    When User clicks on Try here under Implementation using array
    When User enters the pythonCode of Implementation using array
   And clicks on Run button of Implementation using array
   Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
   
   Scenario: User validate Queue Operations
    
    When User clicks on Getstarted button under Queue
   
    Then User clicks on Implementation using Queue Operations
    When User clicks on Try here under Queue Operations
    When User enters the pythonCode of Queue Operations
   And clicks on Run button of Queue Operations
   Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
    

 