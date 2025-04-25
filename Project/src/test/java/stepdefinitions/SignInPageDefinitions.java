package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MadeInChinaSignInPage;

public class SignInPageDefinitions {
    public static ExtentTest test = Hooks.report.createTest("SignInPageTest");
    MadeInChinaSignInPage china = new MadeInChinaSignInPage(test);
        
    @Given("I close the close the popop")
    public void i_close_the_close_the_popop() {

    }
    @When("I verify the SignIn label text")
    public void i_verify_the_sign_in_label_text() {
            china.verifySignIn();
    }
    @When("I hover over the Sign Up or Join option")
    public void i_hover_over_the_sign_up_or_join_option() {
             china.hoverSignIn();
    }
    @When("I click on Join Free button")
    public void i_click_on_join_free_button() {
             china.clickJoinFree();
    }
    @When("I click and enter {string} in email bar")
    public void i_click_and_enter_in_email_bar(String string) {
            china.clickOnEmailBar();
            china.enterDataToEmail(string);
    }
    @When("I click on I Agree to check box")
    public void i_click_on_i_agree_to_check_box() {
 
    }
    @Then("I click on the Next button")
    public void i_click_on_the_next_button() {
             china.clickOnNext();
    }


    
    
}
