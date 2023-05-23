Feature: My Activities


  @SMOKE
  Scenario Outline: User opens My Activities
    Given User has logged on as "<username>" "<password>"
    And navigated to My Activities
    When I do this
    Then this happens

    Examples:
      | username | password |
      | ihopbriz@gmail.com  | what   |