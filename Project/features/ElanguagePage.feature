Feature: Language Change Functionality
    Scenario Outline: Checking the language changes
        Given I close the popup. 
        When I hover on Sign In.
        And I click on Join Free. 
        And I verify "Create an account". 
        When I click on Sign In Now.
        And I verify sign in page "Sign in with Email Code".
        When I change the language to Spanish. 
        And I verify interface display in Spanish "Cuenta". 
        When I change the language to French. 
        And I verify interface display in French "Compte". 
        When I change the language to German.
        And I verify interface display in German "Konto". 
        When I change the language to Russian. 
        And I verify interface display in Russian "Аккаунт". 
        When I change the language to Japanese.
        And I verify interface display in Japanese "アカウント". 
        When I change the language to English. 
        Then I verify interface display in English "Account". 