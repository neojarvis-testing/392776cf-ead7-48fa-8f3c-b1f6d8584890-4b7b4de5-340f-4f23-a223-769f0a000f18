package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MadeInChinaWiresAndFurniturePage;

public class DWireAndFurnitureFeature {
    ExtentTest test = Hooks.report.createTest("Wires And Furniture");
    MadeInChinaWiresAndFurniturePage mfp = new MadeInChinaWiresAndFurniturePage(test);

    @Given("I click on xmark on popup.")
    public void i_click_on_xmark_on_popup() {
        mfp.clickOnXmark();
    }
    @When("I click on SearchBar on top.")
    public void i_click_on_search_bar_on_top() {
        mfp.clickOnSearchBar();
    }
    @When("I send data to searchBar {string}")
    public void i_send_data_to_search_bar(String string) {
        mfp.sendDataToSearchBar(string);
    }
    @When("I enter action on searchBar.")
    public void i_enter_action_on_search_bar() {
        mfp.enterDataToSearchBar();
    }
    @When("I verify text that contains wire.")
    public void i_verify_text_that_contains_wire() {
        mfp.veirfyTextContainsWire();
    }
    @When("I click on first wire product.")
    public void i_click_on_first_wire_product() {
        mfp.clickOnFirstProductWire();
    }
    @When("I click on logo.")
    public void i_click_on_logo() {
        mfp.clickOnLogo();
    }
    @When("I click on SearchBar again.")
    public void i_click_on_search_bar_again() {
        mfp.clickOnSearchBar();
    }
    @When("I sent data to search bar {string}.")
    public void i_sent_data_to_search_bar(String string) {
        mfp.sendDataToSearchBar(string);
    }
    @When("I perform an enter action.")
    public void i_perform_an_enter_action() {
        mfp.enterDataToSearchBar();
    }
    @When("I verify the Furniture text.")
    public void i_verify_the_furniture_text() {
        mfp.veirfyTextContainsFurniture();
    }
    @When("I click no pagination2Page.")
    public void i_click_no_pagination2page() {
        mfp.clikOnPagination2Page();
    }
    @When("I Again click on logo.")
    public void i_again_click_on_logo() {
        mfp.clickOnLogo();
    }
    @Then("I verify the home page title.")
    public void i_verify_the_home_page_title() {
        mfp.verifyHomePage();
    }
}
