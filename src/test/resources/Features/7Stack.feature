Feature: Stack
#Background: User launch home page of an dsalgo project
#Given The user opens DS Algo portal link
#When The user clicks the Get Started button
#Then The user should be redirected to homepage
#When The user clicks Sign In
#Given The user is on the SignIn page
#When The user fills the form with the data from sheet '<WorkSheetName>' and clicks LoginButton
#Then The user sign in successfully


  Scenario: User validates Operations in Stack page
    
    When User clicks on Getstarted button under Stack
    Then User clicks on Operations in Stack
    When User clicks on Try here in Operations in Stack 
    When User enters the Python code in Operations in Stack
    And clicks on Run button in Operations in Stack
    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"

  Scenario: User validates Implementation in Stack page
    
    When User clicks on Getstarted button under Stack
    Then User clicks on Implementation in Stack
    When User clicks on Try here in Implementation in Stack
    When User enters the Python code in Implementation in Stack
    And clicks on Run button in Implementation in Stack
    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"

 Scenario: User validates Applications in stack
    When User clicks on Getstarted button under Stack
    Then User clicks on Applications in Stack
    When User clicks on Try here in Applications in Stack
    When User enters the invalid Python code in Applications in Stack
    And clicks on Run button in Applications in Stack
   Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
   

 