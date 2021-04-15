
Feature: Login feature

This feature includesfollowing scnarioes to validate
1)Login as Admin
2)Login as linda.anderson
3)Login with negative data

  Background:
    Given I am on Login page
   @Login @InvalidLogin
  #Scenario: Login as Admin
    #When I enter the username as "Admin"
    #And I enter password as "admin123"
    #And I click on Submit button
    #Then I should see the username as "Welcome"
   #
  #Scenario: Login as linda.anderson
     #When I enter the username as "Admin"
    #And I enter password as "admin123"
    #And I click on Submit button
    #Then I should see the username as "Welcome"
    
      Scenario Outline: test Login with deifferent data
     When I enter the username as "<username>"
    And I enter password as "<password>"
    And I click on Submit button
    Then I should see the username as "<msg>"
    Examples:
    |username|password|msg|
    |Admin|admin123|Welcome|
    |Admin|admin123|Welcome|
    
    @InvalidLogin
   Scenario: Login with negative data
    When I enter the username as "Admi"
    And I enter password as "admin123"
    And I click on Submit button
    Then I should see error message as "Invalid credentials"