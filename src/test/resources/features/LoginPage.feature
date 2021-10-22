Feature: Login to HRM  

   @ValidCredentials
   Scenario: Login with valid credentials
   
    Given User is on Home page
    When User enters username as "Admin"
    And User enters password as "admin123"
    Then User should be able to login successfully
    
    @InValidCredentials    
    Scenario Outline: Login with invalid credentials
   
    Given User is on Home page
    When User enters username as '<username>'
    And User enters password as '<password>'
    Then User should be able to see error message '<errorMessage>'
      
   Examples:
    |username  |password  |errorMessage                    |
    |admin     |admin     |Invalid credentials             |
    |          |admin123  |Username cannot be empty        | 
    |Admin     |          |Password cannot be empty        |
    |          |          |Username can be empty        |
 
   @ForgetPassword  
   Scenario: Verify Forget Password Functionality
   
    Given User is on Home page
    When User clicks on Forgot your password link
    Then User should be able to see new page which contains Reset Password button
   
  