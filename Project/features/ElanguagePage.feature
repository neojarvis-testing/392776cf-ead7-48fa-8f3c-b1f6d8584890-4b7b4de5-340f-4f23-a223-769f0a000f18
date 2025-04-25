Feature: Language Change Functionality
    Scenario: Checking the language changes
        Given I close the popup. 
        When I hover on Sign In.
        And I click on Join Free. 
        And I should see the Create Account verification. 
        When I click on Sign In Now.
        And I should see the Sign In Now verification.
        When I change the language to Spanish. 
        And I should see the interface display in Spanish. 
        When I change the language to French. 
        And I should see the interface display in French. 
        When I change the language to German.
        And I should see the interface display in German. 
        When I change the language to Russian. 
        And I should see the interface display in Russian. 
        When I change the language to Japanese.
        And I should see the interface display in Japanese. 
        When I change the language to English. 
        Then I should see the interface display in English. 