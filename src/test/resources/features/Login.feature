Feature: Login
  As I user, I should be able to login

  @buyer
  Scenario: Login as a buyer
    Given I am on the login page
    When I login as a buyer
    Then dashboard should be displayed




