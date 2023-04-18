Feature: Register Page

Background: User launch home page of an dsalgo project
Given The user opens DS Algo portal link
When The user clicks the Get Started button
Then The user should be redirected to homepage
When The user clicks Register

Scenario Outline: Validating Register Functionality

Given The user is on the Register page
When The user fills the form '<UserName>' '<Password>'  '<PasswordConfirmation>' '<MSG>'
Then The user clicks RegisterButton
Examples:
|UserName|Password|PasswordConfirmation|MSG|
|SivaShan|DsAlgo@123|DsAlgo@123|"password_mismatch:The two password fields didn’t match."|
|DianaWill|PeterJack@123|PeterJack@123|"password_mismatch:The two password fields didn’t match."|
|RajPatel|TestNg@123 |TestNg@123|"password_mismatch:The two password fields didn’t match."|
|HarryPotter|JKRowling@1|JKRowling@1|"password_mismatch:The two password fields didn’t match."|
|JackPercy|Jenkin@12|JenKin@12|"password_mismatch:The two password fields didn’t match."|
|KatieWinson|RJKate@12|RJKate@12|"password_mismatch:The two password fields didn’t match."|
#|HenryGeorge|Lotus@1234|Lotus@1234|"password_mismatch:The two password fields didn’t match."|
#|CutteRana|ManoXl@123|ManoXl@123|"New Account Created.You are logged in as FillTeller"|