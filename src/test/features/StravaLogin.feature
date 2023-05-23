Feature: StravaLogin


  @SMOKE
  Scenario Outline: Valid user login to Strava
    Given User is on strava.com login page
    When User logins with username "<username>" and password "<password>"
    Then Strava home page displayed

    Examples:
      | username | password |
      | ihopbriz@gmail.com  | noCHANCE   |