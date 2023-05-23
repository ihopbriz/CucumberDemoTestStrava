Feature: BingSearch

  Basic bing search tests that should validate that site is up
  and running and user has possibility to search something

  @SMOKE
  Scenario: Search normal word in bing.com
    Given User is on bing.com webpage
    When User searches for "light beer"
    Then First three results contains "light beer"

  @TC_5645
  Scenario: Search not normal word in bing.com
    Given User is on bing.com webpage
    When User searches for "dark beer"
    Then First three results contains "dark beer"


  @TC_5645
  Scenario: Search not normal word in bing.com
    Given User is on bing.com webpage
    When User searches for "oidnfgiousnbdfguiosbnriu sodfuingosudfgb"
    Then there are not search results in bing