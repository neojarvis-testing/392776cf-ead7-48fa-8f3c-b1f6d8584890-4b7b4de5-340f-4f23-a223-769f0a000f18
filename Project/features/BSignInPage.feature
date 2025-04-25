Feature:Obsrerve the working of Signin process
    Scenario:Check the Registration and login process in the Made In China Website
        Given I close the close the popop
        When I verify the SignIn label text
        And I hover over the Sign Up or Join option
        And I click on Join Free button
        And I click and enter "sair66912@gmail.com" in email bar
        And I click on I Agree to check box
        And I click on the Next button
        And I verify "Please enter the verification code." message displayed
        And I click on SignIn Now option
        And I enter "sairunsc@gmail.com" in the email bar
        And I enter "ajhbicub1234" in the password bar
        And I click on Login or Sign In button
        And I verify "This Email Address is not yet registered" after it  displayed
        And I click on forget your password link
        And I open new page and I click on continue button
        Then I verify the text "Please enter the text in the image" after it displayed