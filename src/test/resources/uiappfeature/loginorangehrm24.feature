

Feature: Login Functionallity
 
    Scenario: Login to Orange HRM
    Given I am at the Login page
    When user enter username "Admin"
    And enter password "admin123"
    And user click on Login button
    Then user should be able land on Dashboard
    

  