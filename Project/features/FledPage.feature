Feature: Checking Functionality of Led Page
    Scenario: Ordering an Led Light
        Given I close the pop-up.
        When I click and send data "LED lights".
        And I verify the result page "LED lights".
        When I click on More.
        And I click on Led Strip Light.
        When I verify the filter "Led Strip Light".
        And I click on Contact Now.
        When I verify in inquiry page "Send Inquiry".
        And I send an inquiry.
        When I send an email.
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