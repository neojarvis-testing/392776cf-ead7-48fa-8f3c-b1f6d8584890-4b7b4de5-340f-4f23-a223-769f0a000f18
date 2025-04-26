Feature: Product Directory Functionality
	Scenario Outline: Product Directory Functionality
        Given I click on Popup.
        When I hover in Buyers.
        And I click on Product Directory
        And I click on Machine Tools and verify url "/Manufacturing-Processing-Machinery-Catalog/Machine-Tools.html" and navigate Back 
        And I click on Engineering Construction Machinery and verify url "/Manufacturing-Processing-Machinery-Catalog/Engineering-Construction-Machinery.html" and navigate Back 
        And I click on Wood working Machinery and verify url "/Manufacturing-Processing-Machinery-Catalog/Woodworking-Machinery.html" and navigate Back 
        And I click on Plastic Machinery and verify url "/Manufacturing-Processing-Machinery-Catalog/Plastic-Machinery.html" and navigate Back 
        And I click on Metallic Processing Machinery and verify url "/Manufacturing-Processing-Machinery-Catalog/Metallic-Processing-Machinery.html" and navigate Back
        And I click on Mould and verify url "/Manufacturing-Processing-Machinery-Catalog/Mould.html" and navigate Back 
        And I click on Laser Equipment and verify url "/Manufacturing-Processing-Machinery-Catalog/Laser-Equipment.html" and navigate Back 
        And I click on Casting Forging and verify url "/Manufacturing-Processing-Machinery-Catalog/Casting-Forging.html" and navigate Back 
        Then I click on Agricultural Machinery and verify url "/Manufacturing-Processing-Machinery-Catalog/Agricultural-Machinery.html" 
