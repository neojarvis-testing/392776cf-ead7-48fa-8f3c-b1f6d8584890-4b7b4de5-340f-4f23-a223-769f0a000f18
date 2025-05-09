package pages;

import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.MadeInChinaSpicesPageContactLocators;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class MadeInChinaSpicesPageContact {
     WebDriverHelper helper;
     ExtentTest test;

    public MadeInChinaSpicesPageContact(ExtentTest test){
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
     * c.Description: Method to click on the search bar.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnSearchBar(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.searchBar, 10);
            helper.clickOnElement(MadeInChinaSpicesPageContactLocators.searchBar);
            test.log(Status.PASS, "Clicked on the search bar");
            LoggerHandler.info("Clicked on the search bar");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Not clicked on the search ba");
            test.log(Status.FAIL, "Not clicked on the search bar");
            LoggerHandler.info("Not clicked on the search bar");
        }
    }
    
    /*
     * a.Method Name: sendData
     * b.Author Name: Shashank Kondur
     * c.Description: Method to sent the data to search bar.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void sendDataToSearchBar(String value){
        try {
            helper.waitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.searchBar, 10);
            helper.sendKeys(MadeInChinaSpicesPageContactLocators.searchBar, value);
            test.log(Status.PASS, "Sent data to the search bar");
            LoggerHandler.info("Data sent to the search bar");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Did not sent data to the search bar");
            test.log(Status.FAIL, "Did not sent data to the search bar");
            LoggerHandler.info("Data not sent to the search bar");
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
            helper.waitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.searchBar, 10);
            helper.enterAction(MadeInChinaSpicesPageContactLocators.searchBar);
            test.log(Status.PASS, "Enter action performed");
            LoggerHandler.info("Enter action performed");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Enter action not performed");
            test.log(Status.FAIL, "Enter action not performed");
            LoggerHandler.info("Data not sent to the search bar");
        }
    }

    /*
     * a.Method Name: clickOnContactNow
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the contact now.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnContactNow(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.contactNow, 10);
            helper.clickOnElement(MadeInChinaSpicesPageContactLocators.contactNow);
            helper.switchToNewWindow();
            test.log(Status.PASS, "Clicked on the first contactNow");
            LoggerHandler.info("Clicked on the first contactNow");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Not clicked on the first contactNow");
            test.log(Status.FAIL, "Not clicked on the first contactNow");
            LoggerHandler.info("Not clicked on the first contactNow");
        }
    }

    /*
     * a.Method Name: clickOnFirstProduct
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the clickOnFirstProduct.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnFirstProduct(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.firstProduct, 10);
            helper.clickOnElement(MadeInChinaSpicesPageContactLocators.firstProduct);
            helper.switchToNewWindow();
            test.log(Status.PASS, "Clicked on the first product");
            LoggerHandler.info("Clicked on the first product");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Not clicked on the first product");
            test.log(Status.FAIL, "Not clicked on the first product");
            LoggerHandler.info("Not clicked on the first product");
        }
    }

    /*
     * a.Method Name: clickOnContactSupplier
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the clickOnContactSupplier.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnContactSupplier(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.contactSeller, 10);
            helper.clickOnElement(MadeInChinaSpicesPageContactLocators.contactSeller);
            helper.switchToNewWindow();
            test.log(Status.PASS, "Clicked on the contactSupplier");
            LoggerHandler.info("Clicked on the contactSupplier");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Not clicked on the contactSupplier");
            test.log(Status.FAIL, "Not clicked on the contactSupplier");
            LoggerHandler.info("Not clicked on the contactSupplier");
        }
    }


    /*
     * a.Method Name: clickOnTextArea
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the clickOnTextArea.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnTextArea(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.textArea, 10);
            helper.clickOnElement(MadeInChinaSpicesPageContactLocators.textArea);
            test.log(Status.PASS, "Clicked on the textArea");
            LoggerHandler.info("Clicked on the textArea");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Not clicked on the textArea");
            test.log(Status.FAIL, "Not clicked on the textArea");
            LoggerHandler.info("Not clicked on the textArea");
        }
    }

    /*
     * a.Method Name: sendDataToTextArea
     * b.Author Name: Shashank Kondur
     * c.Description: Method to send the data to textArea.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void sendDataToTextArea(String value){
        try {
            helper.waitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.textArea, 10);
            helper.sendKeys(MadeInChinaSpicesPageContactLocators.textArea, value);
            test.log(Status.PASS, "Data has sent to the textArea");
            LoggerHandler.info("Data sent to the textArea");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Data did not sent to the textArea");
            test.log(Status.FAIL, "Data did not sent to the textArea");
            LoggerHandler.info("Data not sent to the textArea");
        }
    }

    /*
     * a.Method Name: clickOnEmailInput
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on clickOnEmailInput.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnEmailInput(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.emailInput, 10);
            helper.clickOnElement(MadeInChinaSpicesPageContactLocators.emailInput);
            test.log(Status.PASS, "Clicked on the emailInput");
            LoggerHandler.info("Clicked on the emailInput");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Not clicked on the emailInput");
            test.log(Status.FAIL, "Not clicked on the emailInput");
            LoggerHandler.info("Not clicked on the emailInput");
        }
    }

    /*
     * a.Method Name: sendDataToEmailInput
     * b.Author Name: Shashank Kondur
     * c.Description: Method to send the data to emailInput.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void sendDataToEmailInput(String value){
        try {
            helper.waitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.emailInput, 10);
            helper.sendKeys(MadeInChinaSpicesPageContactLocators.emailInput, value);
            test.log(Status.PASS, "Data sent to the emailInput");
            LoggerHandler.info("Data has sent to the emailInput");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Data not sent to the emailInput");
            test.log(Status.FAIL, "Data not sent to the emailInput");
            LoggerHandler.info("Data did not sent to the emailInput");
        }
    }

    /*
     * a.Method Name: clickOnSendInquireNow
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the clickOnSendInquireNow.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnSendInquireNow(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.sendInquryNow, 10);
            helper.clickOnElement(MadeInChinaSpicesPageContactLocators.sendInquryNow);
            test.log(Status.PASS, "Clicked on the sendInquryNow");
            LoggerHandler.info("Clicked on the sendInquryNow");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Not clicked on the sendInquryNow");
            test.log(Status.FAIL, "Not clicked on the sendInquryNow");
            LoggerHandler.info("Not clicked on the sendInquryNow");
        }
    }

    public void clikOnPopupXMark(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.removePopup, 5);
            helper.clickOnElement(MadeInChinaSpicesPageContactLocators.removePopup);
            test.log(Status.PASS, "Clicked on the removePopup");
            LoggerHandler.info("Clicked on the removePopup");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Not clicked on the removePopup");
            test.log(Status.FAIL, "Not clicked on the removePopup");
            LoggerHandler.info("Not clicked on the removePopup");
        }
    }

    /*
     * a.Method Name: verifyTextSuccessfullySended
     * b.Author Name: Shashank Kondur
     * c.Description: Method to verify the text.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void verifyTextSuccessfullySended(){
        try {
            String text = helper.getText(MadeInChinaSpicesPageContactLocators.sentSuccessfully);
            Assert.assertEquals("Sent Successfully", text);
            test.log(Status.PASS, "Text Verified");
            LoggerHandler.info("Text Verified");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Text Not Verified");
            test.log(Status.PASS, "Text Not Verified");
            LoggerHandler.info("Text Not Verified");
        }
    }

    /*
     * a.Method Name: clickOnAccountPassword
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the clickOnAccountPassword.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnAccountPassword(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.accountPassword, 10);
            helper.clickOnElement(MadeInChinaSpicesPageContactLocators.accountPassword);
            test.log(Status.PASS, "Clicked on the accountPassword");
            LoggerHandler.info("Clicked on the accountPassword");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Not clicked on the accountPassword");
            test.log(Status.FAIL, "Not clicked on the accountPassword");
            LoggerHandler.info("Not clicked on the accountPassword");
        }
    }

    /*
     * a.Method Name: sendDataToAccountPassword
     * b.Author Name: Shashank Kondur
     * c.Description: Method to send the data to account password.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void sendDataToAccountPassword(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.accountPassword, 10);
            helper.sendKeys(MadeInChinaSpicesPageContactLocators.accountPassword, "testadmin@123");
            test.log(Status.PASS, "Data sent to the accountPassword");
            LoggerHandler.info("Data sent to the emailInput");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Data not sent to the accountPassword");
            test.log(Status.FAIL, "Data not sent to the accountPassword");
            LoggerHandler.info("Data not sent to the accountPassword");
        }
    }

    /*
     * a.Method Name: clickOncheckBox
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the clickOncheckBox.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOncheckBox(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.checkBox, 10);
            helper.clickOnElement(MadeInChinaSpicesPageContactLocators.checkBox);
            test.log(Status.PASS, "Clicked on the checkBox");
            LoggerHandler.info("Clicked on the checkBox");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Not clicked on the checkBox");
            test.log(Status.FAIL, "Not clicked on the checkBox");
            LoggerHandler.info("Not clicked on the checkBox");
        }
    }

    /*
     * a.Method Name: clickOnVerifyEmail
     * b.Author Name: Shashank Kondur
     * c.Description: Method to click on the clickOnVerifyEmail.
     * d.Return Type: void
     * e.Paramenter List: none
     */
    public void clickOnVerifyEmail(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaSpicesPageContactLocators.verifyEmail, 10);
            helper.clickOnElement(MadeInChinaSpicesPageContactLocators.verifyEmail);
            Screenshot.captureFullScreenshot("otp");
            Reporter.attachScreenshotToReport("otp page", test, "report of the otp page");
            test.log(Status.PASS, "Clicked on the verifyEmail");
            LoggerHandler.info("Clicked on the verifyEmail");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Not clicked on the verifyEmail");
            test.log(Status.FAIL, "Not clicked on the verifyEmail");
            LoggerHandler.info("Not clicked on the verifyEmail");
        }
    }
    
    



}