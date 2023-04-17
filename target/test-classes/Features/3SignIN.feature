Feature: SignIn Page

Background: User launch home page of an dsalgo project
Given The user opens DS Algo portal link
When The user clicks the Get Started button
Then The user should be redirected to homepage
When The user clicks Sign In

Scenario Outline: Validating SignIn Functionality

Given The user is on the SignIn page
When The user fills the form with the data from sheet '<WorkSheetName>' and clicks LoginButton
Then The user sign in successfully 
Examples:
	|WorkSheetName|
	|Data|