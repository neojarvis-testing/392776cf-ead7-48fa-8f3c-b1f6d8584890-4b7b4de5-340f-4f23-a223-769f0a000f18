Feature: Contacting the supplier on the Spices page.
    Scenario: Spices page contact supplier.
        Given I click on the X mark on the popup.
        When I click on the searchBar.
        And I send the data to searchBar "<values>".
        And I performed the enter action.
        And I click on contact now.
        And I click on TextArea.
        And I send data to text Area "<details>".
        And I click on Email input.
        And I send data to EmailInput "<email>".
        And I click on sendInquierNow.
        Then I click on signIn popup xmark.
        Examples:
            |values|details|email|
            |spices|I want to know more details about the item.|testmic@gmail.com|
            