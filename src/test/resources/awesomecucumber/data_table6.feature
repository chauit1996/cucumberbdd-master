Feature: Math Operations

  Scenario Outline: Addition
    Given I have two numbers
    When I add them
    Then the result should be correct

    Examples:
      | Number1 | Number2 | Result |
      | 5       | 10      | 15     |
      | 8       | 2       | 10     |
      | 15      | 20      | 35