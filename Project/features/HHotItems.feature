Feature: HotItems Functionality
    @ta
    Scenario: Verifying all HotItems
        Given I close the PopUp.
        When I click on the Furniture.
        And I Verify the Furniture Url "Furniture.html".
        And I Verify the Furniture Title "Furniture".
        And I click on the ApparelClothing.
        And I Verify the ApparelClothing Url "Apparel-Clothing.html".
        And I Verify the ApparelClothing Title "Apparel & Clothing".
        And I click on the AutoParts.
        And I Verify the AutoParts Url "Auto-Parts-Accessories.html".
        And I Verify the AutoParts Title "Auto Parts & Accessories".
        And I click on the BagsCases.
        And I Verify the BagsCases Url "Bags-Cases-Luggages.html".
        And I Verify the BagsCases Title "Bags, Cases & Luggages".
        And I click on the ComputerProducts.
        And I Verify the ComputerProducts Url "Computer-Products.html".
        And I Verify the ComputerProducts Title "Computer Products".
        And I click on the ConsumerElectronics.
        And I Verify the ConsumerElectronics Url "Consumer-Electronics.html".
        And I Verify the ConsumerElectronics Title "Consumer Electronics".
        And I click on the ElectricalEquipment.
        And I Verify the ElectricalEquipment Url "Electrical-Equipments.html".
        And I Verify the ElectricalEquipment Title "Electrical Equipment".
        And I click on the ElectronicComponents.
        And I Verify the ElectronicComponents Url "Electronic-Components.html".
        And I Verify the ElectronicComponents Title "Electronic Components".
        And I click on the GiftsCrafts.
        And I Verify the GiftsCrafts Url "Gifts-Crafts-Collectibles.html".
        And I Verify the GiftsCrafts Title "Gifts, Crafts & Collectibles".
        And I click on the SealingPackage.
        And I Verify the SealingPackage Url "Sealing-Packaging-Storage-Shelving.html".
        And I Verify the SealingPackage Title "Sealing, Packaging, Storage & Shelving".
        And I click on the BuildingMaterials.
        And I Verify the BuildingMaterials Url "Building-Materials-Supplies.html".
        Then I Verify the BuildingMaterials Title "Building Materials & Supplies".