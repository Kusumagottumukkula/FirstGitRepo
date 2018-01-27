Feature: login into yahoo website

  Scenario Outline: login to yahoo with various credentials
    Given I open yahoo website
    When I enter valid "<username>" and valid "<password>"
    And i click on login
    Then I should be able to login to yahoo website
    
    Examples:
      | username       | password |
      | abc@yahoo.com  | abc@123  |
      | abc1@yahoo.com | abc@123  |
      | abc2@yahoo.com | abc@123  |
