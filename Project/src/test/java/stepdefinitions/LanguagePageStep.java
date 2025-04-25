package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MadeInChinaLanguagePage;

public class LanguagePageStep {
    ExtentTest test = Hooks.report.createTest("Test case 5");
    MadeInChinaLanguagePage language = new MadeInChinaLanguagePage(test);
    @Given("I close the popup.")
    public void i_close_the_popup() {
        language.closePopUp();
    }
    @When("I hover on Sign In.")
    public void i_hover_on_sign_in() {
        language.hoverOnSignIn();
    }
    @When("I click on Join Free.")
    public void i_click_on_join_free() {
        language.clickOnJoinFree();
    }
    @When("I verify {string}.")
    public void i_verify(String string) {
        language.verifyCreateAccount(string);
    }
    @When("I click on Sign In Now.")
    public void i_click_on_sign_in_now() {
        language.clickOnSignInNow();
    }
    @When("I verify sign in page {string}.")
    public void i_verify_sign_in_page(String string) {
        language.verifySignInNow(string);
    }
    @When("I change the language to Spanish.")
    public void i_change_the_language_to_spanish() {
        language.changeToSpanish();
    }
    @When("I verify interface display in Spanish {string}.")
    public void i_verify_interface_display_in_spanish(String string) {
        language.verifySpanish(string);
    }
    @When("I change the language to French.")
    public void i_change_the_language_to_french() {
        language.changeToFrench();
    }
    @When("I verify interface display in French {string}.")
    public void i_verify_interface_display_in_french(String string) {
        language.verifyFrench(string);
    }
    @When("I change the language to German.")
    public void i_change_the_language_to_german() {
        language.changeToGerman();
    }
    @When("I verify interface display in German {string}.")
    public void i_verify_interface_display_in_german(String string) {
        language.verifyGerman(string);
    }
    @When("I change the language to Russian.")
    public void i_change_the_language_to_russian() {
        language.changeToRussian();
    }
    @When("I verify interface display in Russian {string}.")
    public void i_verify_interface_display_in_russian(String string) {
        language.verifyRussian(string);
    }
    @When("I change the language to Japanese.")
    public void i_change_the_language_to_japanese() {
        language.changeToJapanese();
    }   
    @When("I verify interface display in Japanese {string}.")
    public void i_verify_interface_display_in_japanese(String string) {
        language.verifyJapanese(string);
    }
    @When("I change the language to English.")
    public void i_change_the_language_to_english() {
        language.changeToEnglish();
    }
    @Then("I verify interface display in English {string}.")
    public void i_verify_interface_display_in_english(String string) {
        language.verifyEnglish(string);
    }
}
