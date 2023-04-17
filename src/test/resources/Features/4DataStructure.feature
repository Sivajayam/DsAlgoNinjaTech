#@DataStructures
Feature: DataStructure feature
 #Background: User launch home page of an dsalgo project
#Given The user opens DS Algo portal link
#When The user clicks the Get Started button
#Then The user should be redirected to homepage


#@DataStructures
 #Scenario Outline: The user is signing in
#When The user clicks the signin link
 #When The user fills the form '<UserName>' '<Password>'  
 #Then The user clicks LogIn button
 #Examples:
#|UserName|Password|
 #|AnkitaSoni|PaviJia@1234| 
  
  #Background: User launch home page of an dsalgo project
#Given The user opens DS Algo portal link
#When The user clicks the Get Started button
#Then The user should be redirected to homepage
#When The user clicks Sign In
#Given The user is on the SignIn page
#When The user fills the form with the data from sheet '<WorkSheetName>' and clicks LoginButton
#Then The user sign in successfully
 
 
 Scenario: Time Complexity Data Structure
    When The user click on Get started button in Data Structure
    When The user click the link  with title Time Complexity
    Then The user click on Data Strucure Try here
    And The user input the Python code in Data Structure
   Then The user click on run button
   Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
    
Scenario: Time Complexity  Invalid code Data Structure 
 When The user click on Get started button in Data Structure for invalid code
    When The user click the link  with title Time Complexity for invalid code
    Then The user click on Data Strucure Try here for invalid code
    And The user input the Python code in Data Structure for invalid code
    When User enter the invalid Python code
      | print Hello |
    And User Clicks on Run button for invalid code
    Then User Verify the error message for invalid code
    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"
