


Feature: US1002 User logins with correct email and password

  Scenario: TC02 Login user with correct email and password

   Given Navigate to url 'http://automationexercise.com'
   Then Verify that home page is visible successfully
   And Click on 'Signup / Login' button
   #And Verify 'Login to your account' is visible
   And Enter incorrect "aeValidEmail" address
   And Enter incorrect "aeInvalidPassword" password
   And Click 'login' button
   And Verify 'Your email or password is incorrect' is visible
   And Quits