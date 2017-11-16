Feature: Facebook Login
  This feature deals with the login functionality

  Scenario Outline: Login with valid credentials
    Given I am on CarSales signin page
    When I enter valid "<username>" and "<password>"
    And I click on login button
    Then I logged into CarSales
    Examples:
      | username          | password |
      | talktive01@gmail.com | talktive01 |

  Scenario: Login with invalid credentials
    Given I am on CarSales signin page
    And I enter the users email address as email:"admin"
    And I enter the following
      | username          | password |
      | talktive01@gmail.com | talktive02 |
    And I click on login button
    Then I will get a notification for invalid username/password