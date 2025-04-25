package stepdefinitions;
 
import com.aventstack.extentreports.ExtentTest;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MadeInChinaProductDirectoryPage;
 
public class ProductDirectory {
    ExtentTest test=Hooks.report.createTest("Production directory");
    MadeInChinaProductDirectoryPage madeInChinaProductDirectoryPage =new MadeInChinaProductDirectoryPage(test);
@Given("I click on Popup.")
public void i_click_on_popup() {
    madeInChinaProductDirectoryPage.clickOnPopUp();
}
@When("I hover in Buyers.")
public void i_hover_in_buyers() {
    madeInChinaProductDirectoryPage.hoverOverBuyers();
}
@When("I click on Product Directory")
public void i_click_on_product_directory() {
    madeInChinaProductDirectoryPage.clickOnProductDirectory();
}
@When("I click on Machine Tools and verify url {string} and navigate Back")
public void i_click_on_machine_tools_and_verify_url_and_navigate_back(String string) {
    madeInChinaProductDirectoryPage.clickOnMachineTools(string);
}
@When("I click on Engineering Construction Machinery and verify url {string} and navigate Back")
public void i_click_on_engineering_construction_machinery_and_verify_url_and_navigate_back(String string) {
    madeInChinaProductDirectoryPage.clickOnEngineeringConstructionMachinery(string);
}
@When("I click on Wood working Machinery and verify url {string} and navigate Back")
public void i_click_on_wood_working_machinery_and_verify_url_and_navigate_back(String string) {
    madeInChinaProductDirectoryPage.clickOnWoodworkingMachinery(string);
}
@When("I click on Plastic Machinery and verify url {string} and navigate Back")
public void i_click_on_plastic_machinery_and_verify_url_and_navigate_back(String string) {
    madeInChinaProductDirectoryPage.clickOnPlasticMachinery(string);
}
@When("I click on Metallic Processing Machinery and verify url {string} and navigate Back")
public void i_click_on_metallic_processing_machinery_and_verify_url_and_navigate_back(String string) {
   madeInChinaProductDirectoryPage.clickOnMetallicProcessingMachinery(string);
}
@When("I click on Mould and verify url {string} and navigate Back")
public void i_click_on_mould_and_verify_url_and_navigate_back(String string) {
   madeInChinaProductDirectoryPage.clickOnMould(string);
}
@When("I click on Laser Equipment and verify url {string} and navigate Back")
public void i_click_on_laser_equipment_and_verify_url_and_navigate_back(String string) {
   madeInChinaProductDirectoryPage.clickOnLaserEquipment(string);
}
@When("I click on Casting Forging and verify url {string} and navigate Back")
public void i_click_on_casting_forging_and_verify_url_and_navigate_back(String string) {
   madeInChinaProductDirectoryPage.clickOnCastingForging(string);
}
@Then("I click on Agricultural Machinery and verify url {string}")
public void i_click_on_agricultural_machinery_and_verify_url(String string) {
    madeInChinaProductDirectoryPage.clickOnAgriculturalMachinery(string);
}
}