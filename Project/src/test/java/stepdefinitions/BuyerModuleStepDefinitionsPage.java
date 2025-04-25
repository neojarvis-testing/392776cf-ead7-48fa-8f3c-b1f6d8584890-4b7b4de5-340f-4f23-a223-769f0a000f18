package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MadeInChinaBuyerModulePage;
import utils.Base;

public class BuyerModuleStepDefinitionsPage extends Base {
    ExtentTest test= Hooks.report.createTest("testCase7");
    MadeInChinaBuyerModulePage madeInChinaBuyerModulePage=new MadeInChinaBuyerModulePage(test);
    @Given("I click On POP UP.")
    public void i_click_on_pop_up() {
        madeInChinaBuyerModulePage.closePopUp();
    }
    @When("I hover on buyer module.")
    public void i_hover_on_buyer_module() {
        madeInChinaBuyerModulePage.hoverOnBuyer();
    }
    @When("I click on new user guide.")
    public void i_click_on_new_user_guide() {
        madeInChinaBuyerModulePage.clickNewUserGuide();
    }
    @When("I verify Url which contains user guide {string}.")
    public void i_verify_url_which_contains_user_guide(String url) {
        madeInChinaBuyerModulePage.verifyURLNewUser(url);
    }
    @When("I verify Title Which contains source guide {string}.")
    public void i_verify_title_which_contains_source_guide(String value) {
        madeInChinaBuyerModulePage.verifyTitleSourceProducts(value);
    }
    @When("I click on MICLogo.")
    public void i_click_on_mic_logo() {
        madeInChinaBuyerModulePage.clickLogo();
    }
    @When("I hover on the buyer module.")
    public void i_hover_on_the_buyer_module() {
        madeInChinaBuyerModulePage.hoverOnBuyer();
    }
    @When("I click on Audited Supplier.")
    public void i_click_on_audited_supplier() {
        madeInChinaBuyerModulePage.clickAuditedSuppliers();
    }
    @When("I Verify Url which contains Audited supplier {string}.")
    public void i_verify_url_which_contains_audited_supplier(String string) {
        madeInChinaBuyerModulePage.verifyURLSourceProducts(string);
    }
    @When("I verify Title which contains Audited supplier {string}.")
    public void i_verify_title_which_contains_audited_supplier(String string) {
        madeInChinaBuyerModulePage.verifyTitleAuditedSupplier(string);
    }
    @When("I click on MLogo.")
    public void i_click_on_logo() {
        madeInChinaBuyerModulePage.clickLogo();
    }
    @When("I hover on the buyer module icon.")
    public void i_hover_on_the_buyer_module_icon() {
        madeInChinaBuyerModulePage.hoverOnBuyer();
    }
    @When("I click on meet suppliers.")
    public void i_click_on_meet_suppliers() {
        madeInChinaBuyerModulePage.clickMeetSuppliers();
    }
    @When("I verify Url which contains Private sourcing {string}.")
    public void i_verify_url_which_contains_private_sourcing(String string) {
        madeInChinaBuyerModulePage.verifyURLPrivateSourcing(string);
    }
    @Then("I verfy Title which contains Meet suppliers {string}.")
    public void i_verfy_title_which_contains_meet_suppliers(String string) {
        madeInChinaBuyerModulePage.verifyTitleMeetSuppliers(string);
    }
    
}
