package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MadeInChinaSpicesPageContact;

public class CSpicesContactFeature {
    ExtentTest test = Hooks.report.createTest("Spices Contact Page");
    MadeInChinaSpicesPageContact mspc = new MadeInChinaSpicesPageContact(test);

    @Given("I click on the X mark on the popup.")
    public void i_click_on_the_x_mark_on_the_popup() {
        mspc.clickOnXmark();
    }
    @When("I click on the searchBar.")
    public void i_click_on_the_search_bar() {
        mspc.clickOnSearchBar();
    }
    @When("I send the data to searchBar {string}.")
    public void i_send_the_data_to_search_bar(String string) {
        mspc.sendDataToSearchBar(string);
    }
    @When("I performed the enter action.")
    public void i_performed_the_enter_action() {
        mspc.enterDataToSearchBar();
    }
    @When("I click on contact now.")
    public void i_click_on_contact_now() {
        mspc.clickOnContactNow();
    }
    @When("I click on TextArea.")
    public void i_click_on_text_area() {
        mspc.clickOnTextArea();
    }
    @When("I send data to text Area {string}.")
    public void i_send_data_to_text_area(String string) {
        mspc.sendDataToTextArea(string);
    }
    @When("I click on Email input.")
    public void i_click_on_email_input() {
        mspc.clickOnEmailInput();
    }
    @When("I send data to EmailInput {string}.")
    public void i_send_data_to_email_input(String string) {
        mspc.sendDataToEmailInput(string);
    }
    @When("I click on sendInquierNow.")
    public void i_click_on_send_inquier_now() {
        mspc.clickOnSendInquireNow();
    }
    @Then("I click on signIn popup xmark.")
    public void i_click_on_sign_in_popup_xmark() {
        mspc.clikOnPopupXMark();
    }
}

