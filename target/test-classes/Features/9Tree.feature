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
@TC06Tree
Feature: Tree

 #Background: User launch home page of an dsalgo project
#Given The user opens DS Algo portal link
#When The user clicks the Get Started button
#Then The user should be redirected to homepage
#When The user clicks Sign In
#Given The user is on the SignIn page
#When The user fills the form with the data from sheet '<WorkSheetName>' and clicks LoginButton
#Then The user sign in successfully 

    
  Scenario: Overview of Trees page 
    
    Given User clicks on Getstarted button under Tree
     When User clicks on Overview of Trees
     Then User clicks on Try here under Overview of Trees
   When User enters the pythonCode of Overview of Trees
  Then clicks on Run button of Overview of Trees
   Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"

 
  Scenario: Terminologies page 
    When User clicks on Getstarted button under Tree
    When User clicks on Terminologies
    When User clicks on Try here under Terminologies
     When User enters the pythonCode of Terminologies
  Then clicks on Run button of Terminologies
   Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
    

  

  Scenario: Types of Trees page 
     When User clicks on Getstarted button under Tree
    When User clicks on Types of Trees
    When User clicks on Try here under Types of Trees
     When User enters the pythonCode of Types of Trees
  Then clicks on Run button of Types of Trees
   Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"

Scenario: Tree Traversals page
     When User clicks on Getstarted button under Tree
    When User clicks on Tree Traversals page
    When User clicks on Try here under Tree Traversals page
     When User enters the pythonCode of Tree Traversals page
  Then clicks on Run button of Tree Traversals page
   Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
   
   Scenario: Traversals-Illustration page
     When User clicks on Getstarted button under Tree
    When User clicks on Traversals-Illustration page
    When User clicks on Try here under Traversals-Illustration page
     When User enters the pythonCode of Traversals-Illustration page
  Then clicks on Run button of Traversals-Illustration page
   Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
   
Scenario:  Binary Trees page
     When User clicks on Getstarted button under Tree
    When User clicks on  Binary Trees page
    When User clicks on Try here under  Binary Trees page
     When User enters the pythonCode of  Binary Trees page
  Then clicks on Run button of  Binary Trees page
   Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"

Scenario:  Types of Binary Trees page
     When User clicks on Getstarted button under Tree
    When User clicks on  Types of Binary Trees page
    When User clicks on Try here under  Types of Binary Trees page
     When User enters the pythonCode of  Types of Binary Trees page
  Then clicks on Run button of  Types of Binary Trees page
   Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"

Scenario:  Implementation in Python page
     When User clicks on Getstarted button under Tree
    When User clicks on  Implementation in Python page
    When User clicks on Try here under  Implementation in Python page
     When User enters the pythonCode of  Implementation in Python page
  Then clicks on Run button of  Implementation in Python page
   Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
   
Scenario:  Binary Tree Traversals page
     When User clicks on Getstarted button under Tree
    When User clicks on  Binary Tree Traversals page
    When User clicks on Try here under  Binary Tree Traversals page
     When User enters the pythonCode of  Binary Tree Traversals page
  Then clicks on Run button of  Binary Tree Traversals page
   Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
   
Scenario:  Implementation of Binary Trees page
     When User clicks on Getstarted button under Tree
    When User clicks on  Implementation of Binary Trees page
    When User clicks on Try here under  Implementation of Binary Trees page
     When User enters the pythonCode of  Implementation of Binary Trees page
  Then clicks on Run button of Implementation of Binary Trees page
   Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"

Scenario:  Applications of Binary Trees page
     When User clicks on Getstarted button under Tree
    When User clicks on  Applications of Binary Trees page
    When User clicks on Try here under Applications of Binary Trees page
     When User enters the pythonCode of  Applications of Binary Trees page
  Then clicks on Run button of Applications of Binary Trees page
   Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
   
Scenario:  Binary Search Trees page
     When User clicks on Getstarted button under Tree
    When User clicks on  Binary Search Trees page
    When User clicks on Try here under Binary Search Trees page
     When User enters the pythonCode of  Binary Search Trees page
  Then clicks on Run button of Binary Search Trees page
   Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
   
   Scenario:  Implementation of BST page
     When User clicks on Getstarted button under Tree
    When User clicks on  Implementation of BST page
    When User clicks on Try here under Implementation of BST page
     When User enters the pythonCode of  Implementation of BST page
  Then clicks on Run button of Implementation of BST page
   Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"

  
  #Scenario: SignOut validation
    #Given User is on Home page after logged in
    #When User clicks on Getstarted button under Tree
    #When User clicks on signout button
    #Then User is redirected to homepage