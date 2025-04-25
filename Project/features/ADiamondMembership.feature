Feature: Diamond Membership Functionality

    Scenario:
        When I clicks on the Popup  
        And I clicks on the search bar  
        And I enters data into the search bar and clicks search  
        And I result should contain "Electronics"  
        And I clicks on the supplier list  
        And I clicks on the consumer electronics option  
        And I result should contain "Consumer"  
        And I selects the IS9000 filter  
        Then I result should contain "9000"  