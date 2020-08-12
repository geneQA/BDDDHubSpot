@web

  Feature: HubSpot Login page feature

    Background:
      Given I am on HubSpot Login Page

      @hubSpotLogin
    Scenario: Verify invalid login from Hubspot login page
        When I enter gene@gmail.com into username field on the HubSpot login page
        And I enter Fg123123123 into password field on the HubSpot login page
        And I click on login button on HubSpot login page
        Then I verify invalid login message on sign in page