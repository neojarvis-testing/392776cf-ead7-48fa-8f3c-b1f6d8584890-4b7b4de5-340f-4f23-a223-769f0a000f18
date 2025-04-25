package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MadeInChinaLedLightPage;

public class LedPageStep {
    ExtentTest test = Hooks.report.createTest("Test case 6");
    MadeInChinaLedLightPage ledLightPage = new MadeInChinaLedLightPage(test);
    @Given("I close the pop-up.")
    public void i_close_the_pop_up() {
        ledLightPage.closePopUp();
    }
    @When("I click and send data {string}.")
    public void i_click_and_send_data(String string) {
        ledLightPage.clickAndSendData(string);
    }
    @When("I click on More.")
    public void i_click_on_more() {
        ledLightPage.clickOnMore();
    }
    @When("I click on Led Strip Light.")
    public void i_click_on_led_strip_light() {
        ledLightPage.clickOnLedStripLight();
    }
    @When("I click on Contact Now.")
    public void i_click_on_contact_now() {
        ledLightPage.clickOnContactNow();
    }
    @When("I verify in inquiry page {string}.")
    public void i_verify_in_inquiry_page(String string) {
        ledLightPage.verifyInquiry(string);
    }
    @When("I send an inquiry {string}.")
    public void i_send_an_inquiry(String string) {
       ledLightPage.clickAndSendInquiry(string);
    }
    @When("I send an email {string}.")
    public void i_send_an_email(String string) {
       ledLightPage.clickAndSendEmail(string);
    }
    @When("I click on Send Inquiry Now.")
    public void i_click_on_send_inquiry_now() {
        ledLightPage.clickOnSendInquiryNow();
    }
    @When("I click on the cross mark.")
    public void i_click_on_the_cross_mark() {
        ledLightPage.clickOnCrossMark();
    }
    @When("I click on the logo.")
    public void i_click_on_the_logo() {
        ledLightPage.clickOnLogo();
    }
    @When("I verify in homepage {string}.")
    public void i_verify_in_homepage(String string) {
        ledLightPage.verifyHomePage(string);
    }
    @When("I hover on Lights and Lightning.")
    public void i_hover_on_lights_and_lightning() {
        ledLightPage.hoverOnLigtsAndLightning();
    }
    @When("I click on Led Tube.")
    public void i_click_on_led_tube() {
        ledLightPage.clickOnLedTube();
    }
    @When("I verify the Led Tube page {string}.")
    public void i_verify_the_led_tube_page(String string) {
        ledLightPage.verifyLedTube(string);
    }
    @When("I click on Led Tube Filter.")
    public void i_click_on_led_tube_filter() {
        ledLightPage.clickOnLedTubeFilter();
    }
    @When("I click on Color Temperature.")
    public void i_click_on_color_temperature() {
        ledLightPage.clickOnColorTemprature();
    }
    @Then("I click on Warm White.")
    public void i_click_on_warm_white() {
        ledLightPage.clickOnWarmWhite();
    }
}
