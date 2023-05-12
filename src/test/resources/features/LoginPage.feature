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
    |username  |password       |errorMessage              |
    |admin     |admin          |Invalid credentials       |
    |abc       |admin123       |Invalid credentials       |
    |abc       |abc123         |Invalid credentials       |
    |1$£"      | 45£"%         |Invalid credentials       |
 
   @ForgetPassword  
   Scenario: Verify Forget Password Functionality
   
    Given User is on Home page
    When User clicks on Forgot your password link
    Then User should be able to see new page which contains Reset Password button
   
  