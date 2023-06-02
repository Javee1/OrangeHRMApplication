Feature:OrangeHRM Application Functionalities Testing

Background:
Given User Should Launch Chrome Browser
@sanity 
Scenario:VAlidating OrangeHRM Application LogIn Page
  
#Given User Should Launch Chrome Browser
When User Should Enter Valid OrangeHRM Application URL Address
Then User Should be Navigated to OrangeHRM LogIn Page
Then User Should Close The Browser along With The Application

@sanity @smoke
Scenario:VAlidating OrangeHRM Application LogIn Test
  
#Given User Should Launch Chrome Browser
When User Should Enter Valid OrangeHRM Application URL Address
Then User Should be Navigated to OrangeHRM LogIn Page
When User Should Enter Valid userName and Valid Password and Click On LogIn Button
Then User Should Navigated to HomePage Welcome Admin and Click On LogOut
Then User Should Close The Browser along With The Application

@smoke @logInTest
Scenario Outline:VAlidating OrangeHRM Application LogIn Functionality Test With Multiple Test DataS
  
#Given User Should Launch Chrome Browser
When User Should Enter Valid OrangeHRM Application URL Address
Then User Should be Navigated to OrangeHRM LogIn Page
When User Should Enter "<userName>" and "<password>" and Click On LogIn Button
Then User Should Navigated to HomePage Welcome Admin and Click On LogOut
Then User Should Close The Browser along With The Application

Examples:
  | userName | password     |
  | javeed   | Asijavee@123 |
  | hello    | Asijavee@123 |
  | javeed   | Asijavee@123 |
  | javeed   | asijavee@123 |