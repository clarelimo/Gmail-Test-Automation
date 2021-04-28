Feature: Gmail Login
  Scenario: Successful login with Valid credentials
    Given I launch chrome browser
    When I open gmail login page
    And I enter my email address as "Your Email"
    And I click next button
    And I enter my password as "Your Password"
    And I click next button
    Then I am redirected to my inbox with name as "Gmail"
    And I Close the browser

