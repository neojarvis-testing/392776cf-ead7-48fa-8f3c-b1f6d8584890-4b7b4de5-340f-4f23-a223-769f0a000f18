package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HotItemsMadeInChinaPage;

public class HHotItems {
    ExtentTest test = Hooks.report.createTest("Hot Items");
    HotItemsMadeInChinaPage hotItemsMadeInChinaPage = new HotItemsMadeInChinaPage(test);
    @Given("I close the PopUp.")
    public void i_close_the_pop_up() {
        hotItemsMadeInChinaPage.clickOnPopUp();
    }
    @When("I click on the Furniture.")
    public void i_click_on_the_furniture() {
        hotItemsMadeInChinaPage.clickOnFurniture();
    }
    @When("I Verify the Furniture Url {string}.")
    public void i_verify_the_furniture_url(String string) {
        hotItemsMadeInChinaPage.verifyFurnitureUrl(string);
    }
    @When("I Verify the Furniture Title {string}.")
    public void i_verify_the_furniture_title(String string) {
        hotItemsMadeInChinaPage.verifyFurnitureTitle(string);
    }
    @When("I click on the ApparelClothing.")
    public void i_click_on_the_apparel_clothing() {
        hotItemsMadeInChinaPage.clickOnLogo();
        hotItemsMadeInChinaPage.clickOnApparelClothing();
    }
    @When("I Verify the ApparelClothing Url {string}.")
    public void i_verify_the_apparel_clothing_url(String string) {
        hotItemsMadeInChinaPage.verifyApparelUrl(string);
    }
    @When("I Verify the ApparelClothing Title {string}.")
    public void i_verify_the_apparel_clothing_title(String string) {
        hotItemsMadeInChinaPage.verifyApparelTitle(string);
    }
    @When("I click on the AutoParts.")
    public void i_click_on_the_auto_parts() {
        hotItemsMadeInChinaPage.clickOnLogo();
        hotItemsMadeInChinaPage.clickOnAutoParts();
    }
    @When("I Verify the AutoParts Url {string}.")
    public void i_verify_the_auto_parts_url(String string) {
        hotItemsMadeInChinaPage.verifyAutoPartsUrl(string);
    }
    @When("I Verify the AutoParts Title {string}.")
    public void i_verify_the_auto_parts_title(String string) {
        hotItemsMadeInChinaPage.verifyAutoPartsTitle(string);
    }
    @When("I click on the BagsCases.")
    public void i_click_on_the_bags_cases() {
        hotItemsMadeInChinaPage.clickOnLogo();
        hotItemsMadeInChinaPage.clickOnBagsCases();
    }
    @When("I Verify the BagsCases Url {string}.")
    public void i_verify_the_bags_cases_url(String string) {
        hotItemsMadeInChinaPage.verifyBagsCasesUrl(string);
    }
    @When("I Verify the BagsCases Title {string}.")
    public void i_verify_the_bags_cases_title(String string) {
        hotItemsMadeInChinaPage.verifyBagsCasesTitle(string);
    }
    @When("I click on the ComputerProducts.")
    public void i_click_on_the_computer_products() {
        hotItemsMadeInChinaPage.clickOnLogo();
        hotItemsMadeInChinaPage.clickOnComputerProducts();
    }
    @When("I Verify the ComputerProducts Url {string}.")
    public void i_verify_the_computer_products_url(String string) {
        hotItemsMadeInChinaPage.verifyComputerProductsUrl(string);
    }
    @When("I Verify the ComputerProducts Title {string}.")
    public void i_verify_the_computer_products_title(String string) {
        hotItemsMadeInChinaPage.verifyComputerProductsTitle(string);
    }
    @When("I click on the ConsumerElectronics.")
    public void i_click_on_the_consumer_electronics() {
        hotItemsMadeInChinaPage.clickOnLogo();
        hotItemsMadeInChinaPage.clickOnConsumerElectronics();
    }
    @When("I Verify the ConsumerElectronics Url {string}.")
    public void i_verify_the_consumer_electronics_url(String string) {
        hotItemsMadeInChinaPage.verifyConsumerElectronicsUrl(string);
    }
    @When("I Verify the ConsumerElectronics Title {string}.")
    public void i_verify_the_consumer_electronics_title(String string) {
        hotItemsMadeInChinaPage.verifyConsumerElectronicsTitle(string);
    }
    @When("I click on the ElectricalEquipment.")
    public void i_click_on_the_electrical_equipment() {
        hotItemsMadeInChinaPage.clickOnLogo();
        hotItemsMadeInChinaPage.clickOnElectricalEquipment();
    }
    @When("I Verify the ElectricalEquipment Url {string}.")
    public void i_verify_the_electrical_equipment_url(String string) {
        hotItemsMadeInChinaPage.verifyElectricalEquipmentUrl(string);
    }
    @When("I Verify the ElectricalEquipment Title {string}.")
    public void i_verify_the_electrical_equipment_title(String string) {
        hotItemsMadeInChinaPage.verifyElectricalEquipmentTitle(string);
    }
    @When("I click on the ElectronicComponents.")
    public void i_click_on_the_electronic_components() {
        hotItemsMadeInChinaPage.clickOnLogo();
        hotItemsMadeInChinaPage.clickOnElectronicComponents();
    }
    @When("I Verify the ElectronicComponents Url {string}.")
    public void i_verify_the_electronic_components_url(String string) {
        hotItemsMadeInChinaPage.verifyElectronicComponentsUrl(string);
    }
    @When("I Verify the ElectronicComponents Title {string}.")
    public void i_verify_the_electronic_components_title(String string) {
        hotItemsMadeInChinaPage.verifyElectronicComponentsTitle(string);
    }
    @When("I click on the GiftsCrafts.")
    public void i_click_on_the_gifts_crafts() {
        hotItemsMadeInChinaPage.clickOnLogo();
        hotItemsMadeInChinaPage.clickOnGiftsCrafts();
    }
    @When("I Verify the GiftsCrafts Url {string}.")
    public void i_verify_the_gifts_crafts_url(String string) {
        hotItemsMadeInChinaPage.verifyGiftsCraftsUrl(string);
    }
    @When("I Verify the GiftsCrafts Title {string}.")
    public void i_verify_the_gifts_crafts_title(String string) {
        hotItemsMadeInChinaPage.verifyGiftsCraftsTitle(string);
    }
    @When("I click on the SealingPackage.")
    public void i_click_on_the_sealing_package() {
        hotItemsMadeInChinaPage.clickOnLogo();
        hotItemsMadeInChinaPage.clickOnSealingPackage();
    }
    @When("I Verify the SealingPackage Url {string}.")
    public void i_verify_the_sealing_package_url(String string) {
        hotItemsMadeInChinaPage.verifySealingPackageUrl(string);
    }
    @When("I Verify the SealingPackage Title {string}.")
    public void i_verify_the_sealing_package_title(String string) {
        hotItemsMadeInChinaPage.verifySealingPackageTitle(string);
    }
    @When("I click on the BuildingMaterials.")
    public void i_click_on_the_building_materials() {
        hotItemsMadeInChinaPage.clickOnLogo();
        hotItemsMadeInChinaPage.clickOnBuildingMaterials();
    }
    @When("I Verify the BuildingMaterials Url {string}.")
    public void i_verify_the_building_materials_url(String string) {
        hotItemsMadeInChinaPage.verifyBuildingMaterialsUrl(string);
    }
    @Then("I Verify the BuildingMaterials Title {string}.")
    public void i_verify_the_building_materials_title(String string) {
        hotItemsMadeInChinaPage.verifyBuildingMaterialsTitle(string);
    }
}
