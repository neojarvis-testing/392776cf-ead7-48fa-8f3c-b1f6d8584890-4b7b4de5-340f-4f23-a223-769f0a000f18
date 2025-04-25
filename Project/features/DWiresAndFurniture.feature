Feature: Searching for wires and furniture.
    Scenario: Searching wires and furniture.
        Given I click on xmark on popup.
        When I click on SearchBar on top.
        And I send data to searchBar "Wires"
        And I enter action on searchBar.
        And I verify text that contains wire.
        And I click on first wire product.
        And I click on logo.
        And I click on SearchBar again.
        And I sent data to search bar "Furniture".
        And I perform an enter action.
        And I verify the Furniture text.
        And I click no pagination2Page.
        And I Again click on logo.
        Then I verify the home page title.
        

