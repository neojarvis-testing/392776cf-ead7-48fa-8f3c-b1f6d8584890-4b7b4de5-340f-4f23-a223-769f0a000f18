Feature: Checking Functionality of Led Page
    Scenario Outline: Ordering an Led Light
        Given I close the pop-up.
        When I click and send data "LED lights".
        When I click on More.
        And I click on Led Strip Light.
        And I click on Contact Now.
        When I verify in inquiry page "Send Inquiry".
        And I send an inquiry "light that shines on hacker boi 101".
        When I send an email "hackerboi@101".
        And I click on Send Inquiry Now.
        When I click on the cross mark.
        And I click on the logo.
        When I verify in homepage "Post My RFQ".
        And I hover on Lights and Lightning.
        When I click on Led Tube.
        And I verify the Led Tube page "LED Tube".
        When I click on Led Tube Filter.
        And I click on Color Temperature.
        Then I click on Warm White.