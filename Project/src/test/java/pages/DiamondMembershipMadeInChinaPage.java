package pages;

import org.junit.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.MadeInChinaDiamondMembershipPageLocator;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class DiamondMembershipMadeInChinaPage {
    WebDriverHelper helper;
    ExtentTest test;
    /*
    * a. Method Name: DiamondMembershipMadeInChinaPage (Constructor)
    * b. Author Name: Krishna
    * c. Description: Initializes the DiamondMembershipMadeInChinaPage with WebDriverHelper and assigns the test instance.
    * d. Return Type: None (Constructor)
    * e. Parameter List: ExtentTest test - Instance for logging test results.
    */
    public DiamondMembershipMadeInChinaPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }
    /*
    * a. Method Name: clickPopUp
    * b. Author Name: Krishna
    * c. Description: Waits for the pop-up element to be visible and clicks on it.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void clickPopUp(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaDiamondMembershipPageLocator.popUp, 10);
            helper.clickOnElement(MadeInChinaDiamondMembershipPageLocator.popUp);
            LoggerHandler.info("Clicked On pop Up");
            test.log(Status.PASS, "Clicked On pop Up");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked On pop Up");
            test.log(Status.FAIL, "Not Clicked On pop Up");
        }
    }
    /*
    * a. Method Name: clickOnSearchBar
    * b. Author Name: Krishna
    * c. Description: Waits for the search bar element to be visible and clicks on it.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void clickOnSearchBar(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaDiamondMembershipPageLocator.searchBar, 10);
            helper.clickOnElement(MadeInChinaDiamondMembershipPageLocator.searchBar);
            LoggerHandler.info("Clicked On Search Bar");
            test.log(Status.PASS, "Clicked On Search Bar");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked On Search Bar");
            test.log(Status.FAIL, "Not Clicked On Search Bar");
        }
    }
    /*
    * a. Method Name: enterDataToSearchBar
    * b. Author Name: Krishna
    * c. Description: Enters data from an Excel sheet into the search bar and clicks the search icon.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void enterDataToSearchBar(String value){
        try {
            helper.sendKeys(MadeInChinaDiamondMembershipPageLocator.searchBar, value);
            helper.clickOnElement(MadeInChinaDiamondMembershipPageLocator.searchIcon);
            LoggerHandler.info("Clicked on Search icon");
            test.log(Status.PASS, "Clicked on Search icon");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on Search icon");
            test.log(Status.FAIL, "Not Clicked on Search icon");
        }
    }
    /*
    * a. Method Name: verifyElectronics
    * b. Author Name: Krishna
    * c. Description: Retrieves the text of the verification element and asserts that it contains "Electronics".
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyElectronics(String value){
        try {
            String electronics = helper.getText(MadeInChinaDiamondMembershipPageLocator.verifyWord);
            Assert.assertTrue(electronics.contains(value));
            LoggerHandler.info("Verified Electronics");
            test.log(Status.PASS, "Verified Electronics");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Electronics");
            test.log(Status.FAIL, "Not Verified Electronics");
        }
    }
    /*
    * a. Method Name: clickOnSupplierList
    * b. Author Name: Krishna
    * c. Description: Waits for the supplier list element to be visible and clicks on it.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void clickOnSupplierLIst(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaDiamondMembershipPageLocator.supplierList,10);
            helper.clickOnElement(MadeInChinaDiamondMembershipPageLocator.supplierList);
            LoggerHandler.info("Clicked ON Supplier List");
            test.log(Status.PASS, "Clicked ON Supplier List");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked ON Supplier List");
            test.log(Status.FAIL, "Not Clicked ON Supplier List");
        }
    }
    /*
    * a. Method Name: clickOnConsumer
    * b. Author Name: Krishna
    * c. Description: Waits for the consumer electronics element to be visible and clicks on it.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void clickOnConsumer(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaDiamondMembershipPageLocator.consumerElectronics,10);
            helper.clickOnElement(MadeInChinaDiamondMembershipPageLocator.consumerElectronics);
            LoggerHandler.info("Clicked on consumer");
            test.log(Status.PASS, "Clicked on consumer");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked on consumer");
            test.log(Status.FAIL, "Not Clicked on consumer");
        }
    }
    /*
    * a. Method Name: verifyConsumer
    * b. Author Name: Krishna
    * c. Description: Retrieves the text of the consumer electronics filter element and asserts that it contains "Consumer".
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyConsumer(String value){
        try {
            String consumer = helper.getText(MadeInChinaDiamondMembershipPageLocator.filterconsumerElectronics);
            Assert.assertTrue(consumer.contains(value));
            LoggerHandler.info("Verified Consumer");
            test.log(Status.PASS, "Verified Consumer");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Consumer");
            test.log(Status.FAIL, "Not Verified Consumer");
        }
    }
    /*
    * a. Method Name: clickOnIs9000
    * b. Author Name: Krishna
    * c. Description: Waits for the IS9000 element to be visible and clicks on it.
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void clickOnIs9000(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaDiamondMembershipPageLocator.Is9000,10);
            helper.clickOnElement(MadeInChinaDiamondMembershipPageLocator.Is9000);
            LoggerHandler.info("Clicked On Is9000");
            test.log(Status.PASS, "Clicked On Is9000");
        } catch (Exception e) {
            LoggerHandler.error("Not Clicked On Is9000");
            test.log(Status.FAIL, "Not Clicked On Is9000");
        }
    }
    /*
    * a. Method Name: verifyIs9000
    * b. Author Name: Krishna
    * c. Description: Retrieves the text of the IS9000 filter element and asserts that it contains "9000".
    * d. Return Type: Void
    * e. Parameter List: None
    */
    public void verifyIs9000(String value){
        try {
            String isfilter = helper.getText(MadeInChinaDiamondMembershipPageLocator.filterIs9000);
            Assert.assertTrue(isfilter.contains(value));
            LoggerHandler.info("Verified Is9000");
            test.log(Status.PASS, "Verified Is9000");
        } catch (Exception e) {
            LoggerHandler.error("Not Verified Is9000");
            test.log(Status.FAIL, "Not Verified Is9000");
        }
    }
}
