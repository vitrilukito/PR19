Feature: Test Web Automation

  @web
  Scenario: Test login web normal
    Given open web login page
    And user inputs username "standard_user"
    And user inputs password "secret_sauce"
    And user clicks login button
    Then user will see the cart icon in the homepage
