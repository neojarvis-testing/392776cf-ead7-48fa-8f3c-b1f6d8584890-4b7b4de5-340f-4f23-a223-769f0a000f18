package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DiamondMembershipMadeInChinaPage;

public class ADiamondMembership {
    ExtentTest test = Hooks.report.createTest("Diamond Membership");
    DiamondMembershipMadeInChinaPage diamondMembershipMadeInChinaPage = new DiamondMembershipMadeInChinaPage(test);
    @Given("I click on the Popup.")
    public void i_click_on_the_popup() {
        diamondMembershipMadeInChinaPage.clickPopUp();
    }
    @When("I clicked on the Search Bar.")
    public void i_clicked_on_the_search_bar() {
        diamondMembershipMadeInChinaPage.clickOnSearchBar();
    }
    @When("I send data into the Search Bar and clicked on Search Icon {string}.")
    public void i_send_data_into_the_search_bar_and_clicked_on_search_icon(String string) {
        diamondMembershipMadeInChinaPage.enterDataToSearchBar(string);
    }
    @When("I Verify text Electronics {string}.")
    public void i_verify_text_electronics(String string) {
        diamondMembershipMadeInChinaPage.verifyElectronics(string);
    }
    @When("I click on the Supplier List.")
    public void i_click_on_the_supplier_list() {
        diamondMembershipMadeInChinaPage.clickOnSupplierLIst();
    }
    @When("I click on the Consumer.")
    public void i_click_on_the_consumer() {
        diamondMembershipMadeInChinaPage.clickOnConsumer();
    }
    @When("I Verify text Consumer {string}")
    public void i_verify_text_consumer(String string) {
        diamondMembershipMadeInChinaPage.verifyConsumer(string);
    }
    @When("I click on IS9000 filter")
    public void i_click_on_is9000_filter() {
        diamondMembershipMadeInChinaPage.clickOnIs9000();
    }
    @Then("I Verify filter {string}")
    public void i_verify_filter(String string) {
        diamondMembershipMadeInChinaPage.verifyIs9000(string);
    }
}
