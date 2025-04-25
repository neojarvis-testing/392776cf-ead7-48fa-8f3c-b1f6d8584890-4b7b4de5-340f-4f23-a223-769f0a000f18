Feature: Diamond Membership Functionality

    Scenario: Search For Electronics
        Given I click on the Popup.
        When I clicked on the Search Bar.  
        And I send data into the Search Bar and clicked on Search Icon "Electronics".  
        And I Verify text Electronics "Electronics".
        And I click on the Supplier List.  
        And I click on the Consumer.  
        And I Verify text Consumer "Consumer"  
        And I click on IS9000 filter  
        Then I Verify filter "9000"