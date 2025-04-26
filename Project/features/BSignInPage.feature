Feature:Obsrerve the working of Signin process
    Scenario Outline:Check the Registration and login process in the Made In China Website
        Given I close the close the popop
        When I verify the SignIn label text
        And I hover over the Sign Up or Join option
        And I click on Join Free button
        And I click and enter "gyunnji@gmail.com" in email bar
        And I click on I Agree to check box
        Then I click on the Next button
