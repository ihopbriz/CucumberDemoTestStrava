Feature: BingSearch

  Basic bing search tests that should validate that site is up
  and running and user has possibility to search something

  @SMOKE
  Scenario Outline: Search normal word in bing.com
    Given User is on bing.com webpage
    When User searches for "<queryString>"
    Then First three results contains "<resultString>"

    Examples:
    | queryString | resultString |
    | light beer  | light beer   |
    | dark beer   | dark beer    |


  @TC_5645
  Scenario: Search not normal word in bing.com
    Given User is on bing.com webpage
    When User searches for "oidnfgiousnbdfguiosbnriu sodfuingosudfgb"
    Then there are not search results in bing