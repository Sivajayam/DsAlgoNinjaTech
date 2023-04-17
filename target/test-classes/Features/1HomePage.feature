

Feature: HomePage

Scenario: User launch home page of an dsalgo project
Given The user opens DS Algo portal link
When The user clicks the Get Started button
Then The user should be redirected to homepage

Scenario: User is on Home page and click on sign in
Given The user opens Home Page
When The user clicks Sign In
Then The user should be redirected to Sign in page

Scenario:  User is on Home page and click on Register
Given The user opens Home Page
When The user clicks Register
Then The user should be redirected to Register form