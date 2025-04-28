package pages;

import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.MadeInChinaSpicesPageContactLocators;
import uistore.MadeInChinaWiresAndFurnitureLocatores;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class MadeInChinaWiresAndFurniturePage {
    WebDriverHelper helper;
    ExtentTest test;

    public MadeInChinaWiresAndFurniturePage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }

    /*
     * a.Method Name: clickOnXmark
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the x mark.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnXmark(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.xmark, 10);
            helper.clickOnElement(MadeInChinaSpicesPageContactLocators.xmark);
            test.log(Status.PASS, "Clicked on the xmark");
            LoggerHandler.info("Clicked on the xmark");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Not clicked on the xmark");
            test.log(Status.FAIL, "Not clicked on the xmark");
            LoggerHandler.info("Not clicked on the xmark");
        }
    }

    /*
     * a.Method Name: clickOnSearchBar
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the clickOnSearchBar.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnSearchBar(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaWiresAndFurnitureLocatores.searchBar, 10);
            helper.clickOnElement(MadeInChinaWiresAndFurnitureLocatores.searchBar);
            test.log(Status.PASS, "Clicked on the search bar");
            LoggerHandler.info("Clicked on the search bar");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Not clicked on the search bar");
            test.log(Status.FAIL, "Not clicked on the search bar");
            LoggerHandler.info("Not clicked on the search bar");
        }
    }

    /*
     * a.Method Name: sendData
     * b.Author Name: Shashank Kondur
     * c.Description: Method to send the data.
     * d.Return Type: String
     * e.Paramenter List: String value
     */
    public void sendDataToSearchBar(String value){
        try {
            helper.waitForElementToBeVisible(MadeInChinaWiresAndFurnitureLocatores.searchBar, 10);
            helper.sendKeys(MadeInChinaWiresAndFurnitureLocatores.searchBar, value);
            test.log(Status.PASS, "Data sent to the search bar");
            LoggerHandler.info("Data sent to the search bar");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Data not sent to the search bar");
            test.log(Status.FAIL, "Data not sent to the search bar");
            LoggerHandler.info("Data did not sent to the search bar");
        }
    }

    /*
     * a.Method Name: enterData
     * b.Author Name: Shashank Kondur
     * c.Description: Method to perform enter action.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void enterDataToSearchBar(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaWiresAndFurnitureLocatores.searchBar, 10);
            helper.enterAction(MadeInChinaWiresAndFurnitureLocatores.searchBar);
            test.log(Status.PASS, "Enter action performed");
            LoggerHandler.info("Enter action performed");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Enter action not performed");
            test.log(Status.FAIL, "Enter action not performed");
            LoggerHandler.info("Enter action not performed");
        }
    }

    /*
     * a.Method Name: veirfyTextContainsWire
     * b.Author Name: Shashank Kondur
     * c.Description: Method to verify the text.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void veirfyTextContainsWire(){
        try {
            String text = helper.getText(MadeInChinaWiresAndFurnitureLocatores.firstProduct);
            Assert.assertTrue(text.contains("Wire"));
            test.log(Status.PASS, "Text Verified");
            LoggerHandler.info("Text Verified");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Text Not Verified");
            test.log(Status.FAIL, "Text Not Verified");
            LoggerHandler.info("Text did not Verified");
        }   
    }

    /*
     * a.Method Name: clickOnFirstProductWire
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the clickOnFirstProductWire.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnFirstProductWire(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaWiresAndFurnitureLocatores.firstProduct, 10);
            helper.clickOnElement(MadeInChinaWiresAndFurnitureLocatores.firstProduct);
            helper.switchToNewWindow();
            test.log(Status.PASS, "Clicked on the firstProduct");
            LoggerHandler.info("Clicked on the firstProduct");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Not clicked on the firstProduct");
            test.log(Status.FAIL, "Not clicked on the firstProduct");
            LoggerHandler.info("Not clicked on the firstProduct");
        }
    }

    /*
     * a.Method Name: verifyContactSupplier
     * b.Author Name: Shashank Kondur
     * c.Description: Method to verify the text.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void verifyContactSupplier(){
        try {
            String contactText = helper.getText(MadeInChinaWiresAndFurnitureLocatores.firstProduct);
            System.out.println(contactText);
            org.junit.Assert.assertTrue(contactText.contains(contactText));
            test.log(Status.PASS, "Text Verified");
            LoggerHandler.info("Text is Verified");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Text Not Verified");
            test.log(Status.FAIL, "Text Not Verified");
            LoggerHandler.info("Text did not Verified");
        }
    }

    /*
     * a.Method Name: clickOnLogo
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the clickOnLogo.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnLogo(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaWiresAndFurnitureLocatores.logo, 10);
            helper.clickOnElement(MadeInChinaWiresAndFurnitureLocatores.logo);
            test.log(Status.PASS, "Clicked on the logo");
            LoggerHandler.info("Clicked on the logo");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Not clicked on the logo");
            test.log(Status.FAIL, "Not clicked on the logo");
            LoggerHandler.info("Not clicked on the logo");
        }
    }

    /*
     * a.Method Name: veirfyTextContainsFurniture
     * b.Author Name: Shashank Kondur
     * c.Description: Method to Method to verify the text.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void veirfyTextContainsFurniture(){
        try {
            String text = helper.getText(MadeInChinaWiresAndFurnitureLocatores.firstProduct);
            Assert.assertTrue(text.contains("Furniture"));
            test.log(Status.PASS, "Text Verified");
            LoggerHandler.info("Text Verified");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Text Not Verified");
            test.log(Status.FAIL, "Text Not Verified");
            LoggerHandler.info("Text is Not Verified");
        }   
    }

    /*
     * a.Method Name: clikOnPagination2Page
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the clikOnPagination2Page.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clikOnPagination2Page(){
        try {
            helper.clickOnElement(MadeInChinaWiresAndFurnitureLocatores.clickOn2InPagination);
            Reporter.captureScreenshot("Pigination 2");
            Reporter.attachScreenshotToReport("Pagination", test, "Pagination Picture");
            test.log(Status.PASS, "Clicked on the clickOn2InPagination");
            LoggerHandler.info("Clicked on the clickOn2InPagination");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Not clicked on the clickOn2InPagination");
            test.log(Status.FAIL, "Not clicked on the clickOn2InPagination");
            LoggerHandler.info("Not clicked on the clickOn2InPagination");
        }
    }

    /*
     * a.Method Name: verifyHomePage
     * b.Author Name: Shashank Kondur
     * c.Description: Method to verify the Home Page.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void verifyHomePage(){
        try {
            String title = Base.driver.getTitle();
            Assert.assertTrue(title.contains(title));
            test.log(Status.PASS, "Title Verified");
            LoggerHandler.info("Title Verified");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Title Not Verifie");
            test.log(Status.FAIL, "Title Not Verified");
            LoggerHandler.info("Title is Not Verified");
        }  
    }

    



}