package pages;

import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.MadeInChinaBuyerModulePageLocator;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class MadeInChinaBuyerModulePage {
    ExtentTest test;
    WebDriverHelper helper;
    public MadeInChinaBuyerModulePage(ExtentTest test){
        helper=new WebDriverHelper(Base.driver);
        this.test = test;
    }
    /*
     * a.Method Name: close Pop Up
     * b.Author Name: Samhitha
     * c.Description: This method is used to close the pop up 
     * d.Return Type: void
     */
    public void closePopUp(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaBuyerModulePageLocator.ClosePopUp, 10);
            helper.clickOnElement(MadeInChinaBuyerModulePageLocator.ClosePopUp);
            test.log(Status.PASS, "pop up closed");
            LoggerHandler.info("popup closed");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Failed to close the pop up");
            test.log(Status.FAIL, "Failed to close the pop up");
            LoggerHandler.error("Failed to close the popup");
        }
    }
    /*
     * a.Method Name: hoverOnBuyer
     * b.Author Name: Samhitha
     * c.Description: This method hovers on the buyer 
     * d.Return Type: void
     */
    public void hoverOnBuyer(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaBuyerModulePageLocator.HoverOnBuyer, 10);
            helper.hoverOverElement(MadeInChinaBuyerModulePageLocator.HoverOnBuyer);
            Screenshot.captureFullScreenshot("Buyer Services");
            Reporter.attachScreenshotToReport("Buyer Services", test, "Screenshot Attached to the report");
            test.log(Status.PASS, "Hovered on Buyer");
            LoggerHandler.info("Hovered on  Buyer");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Failed to locate the element to hover");
            test.log(Status.FAIL, "Failed to locate the element to hover");
            LoggerHandler.error("Failed to locate the element to be hovered");
        }
    }
    /*
     * a.Method Name: clickNewUserGuide
     * b.Author Name: Samhitha
     * c.Description: This method is used to close the pop up 
     * d.Return Type: void
     */
    public void clickNewUserGuide(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaBuyerModulePageLocator.ClickNewUserGuide, 10);
            helper.clickOnElement(MadeInChinaBuyerModulePageLocator.ClickNewUserGuide);
            helper.switchToNewWindow();
            Screenshot.captureFullScreenshot("New User Guide");
            Reporter.attachScreenshotToReport("New User guide", test, "Screenshot attached to the NewUserGuide Report");
            test.log(Status.PASS, "Clicked on the new user guide");
            LoggerHandler.info("Clicked on new user guide");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Couldn't click on the New User Guide");
            test.log(Status.FAIL, "Couldn't click on the New User Guide");
            LoggerHandler.error("Couldn't click on new user guide");
        }
    }
    /*
     * a.Method Name: verifyURLNewUser
     * b.Author Name: Samhitha
     * c.Description: This method is used to Verify the URL 
     * d.Return Type: void
     */
    public void verifyURLNewUser(String urlNew){
        try {
            String url=Base.driver.getCurrentUrl();
            System.out.println(url);
            Assert.assertTrue(url.contains(urlNew));
            test.log(Status.PASS, "URL was Verified");
            LoggerHandler.info("URL Verified");
        } catch (AssertionError e) {
            Screenshot.captureFullErrorScreenshot("URL Verified");
            test.log(Status.FAIL, "Url didn't match");
            LoggerHandler.error("Url didi not match");
        }
    }
    /*
     * a.Method Name: verifyTitleSourceProducts
     * b.Author Name: Samhitha
     * c.Description: This method is used to Verify Title
     * d.Return Type: void
     */
    public void verifyTitleSourceProducts(String value){
        try{
            String title = Base.driver.getTitle();
            System.out.println(title);
            Assert.assertTrue(title.contains(value));
            test.log(Status.PASS, "Title verification successfully");
            LoggerHandler.info("Title verified successfully");
        }
        catch(AssertionError e){
            Screenshot.captureFullErrorScreenshot("Invalid Title");
            test.log(Status.FAIL, "Invalid Title");
            LoggerHandler.error("Not a valid Title");
        }
    }
    /*
     * a.Method Name: clickLogo
     * b.Author Name: Samhitha
     * c.Description: This method is used to click on logo 
     * d.Return Type: void
     */
    public void clickLogo(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaBuyerModulePageLocator.ClickLogo, 10);
            helper.clickAndSwitch(MadeInChinaBuyerModulePageLocator.ClickLogo);
            Screenshot.captureFullScreenshot("Made in china Logo");
            Reporter.attachScreenshotToReport("Made in china Logo", test, "Screentshot attached to the logo report");
            test.log(Status.PASS, "Clicked on Logo ");
            LoggerHandler.info("Clicked on logo");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Couldn't click on logo");
            test.log(Status.FAIL, "Couldn't click on logo");
            LoggerHandler.error("Couldn't click on logo");
        }
    }
    /*
     * a.Method Name: clickAuditedSuppliers
     * b.Author Name: Samhitha
     * c.Description: This method is used to click on audited suppliers 
     * d.Return Type: void
     */
    public void clickAuditedSuppliers(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaBuyerModulePageLocator.ClickAuditedSuppliers, 10);
            helper.clickAndSwitch(MadeInChinaBuyerModulePageLocator.ClickAuditedSuppliers);
            Screenshot.captureFullScreenshot("Audited Suppliers");
            Reporter.attachScreenshotToReport("Audited Suppliers", test, " Audited Suppliers ScreenShot Attached to the report");
            test.log(Status.PASS, "Clicked on Audited Suppliers");
            LoggerHandler.info("Clicked on Audited Suppliers");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Couldn't click on Audited Suupliers");
            test.log(Status.FAIL, "Couldn't click on Audited Suupliers");
            LoggerHandler.error("Couldn't click on Audited Suppliers");
        }
    }
    /*
    * a.Method Name: verifyUrlSourceProducts
    * b.Author Name: Samhitha
    * c.Description: This method is used to verify the url which contains audited supplier
    * d.Return Type: void
    */
    public void verifyURLSourceProducts(String url){
        try {
            String url2=Base.driver.getCurrentUrl();
            System.out.println(url2);
            Assert.assertTrue(url2.contains(url));
            test.log(Status.PASS, "Verified url contains Audited Suppliers");
            LoggerHandler.info("Verified url contains Audited Suppliers");
        } catch (AssertionError e) {
            Screenshot.captureFullErrorScreenshot("Invalid URL");
            test.log(Status.FAIL, "Invalid URL");
            LoggerHandler.error("Not valid URL");
        }
    }
    /*
    * a.Method Name: verifyTitleAudited
    * b.Author Name: Samhitha
    * c.Description: This method is used to Verify Title
    * d.Return Type: void
    */
    public void verifyTitleAuditedSupplier(String text){
        try {
            String title2=Base.driver.getTitle();
            System.out.println(title2);
            Assert.assertTrue(title2.contains(text));
            test.log(Status.PASS, "Audited Suppliers Title Verified Successfully");
            LoggerHandler.info("Audites Suppliers Title Verified Successfully");
        } catch (AssertionError e) {
            Screenshot.captureFullErrorScreenshot("Couldn't verify the title Audited Supplierd");
            test.log(Status.FAIL, "Couldn't verify the title Audited Suppliers");
            LoggerHandler.error("Couldn't verify the title Audited Suppliers");
        }
    }
    /*
    * a.Method Name: clickMeetSuppliers
    * b.Author Name: Samhitha
    * c.Description: This method is used to click on Meet suppliers
    * d.Return Type: void
    */
    public void clickMeetSuppliers(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaBuyerModulePageLocator.ClickMeetSupplier, 10);
            helper.clickAndSwitch(MadeInChinaBuyerModulePageLocator.ClickMeetSupplier);
            Screenshot.captureFullScreenshot("Meet Suppliers");
            Reporter.attachScreenshotToReport("Meet suppliers", test, "Meet suppliers ScreenShot Attached to report");
            test.log(Status.PASS, "Clicked on Meet suppliers link");
            LoggerHandler.info("Clicked on the Meet suppliers link");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Didn't Clicked on Meet suppliers link");
            test.log(Status.FAIL, "Couldn't find meet suppliers link");
            LoggerHandler.error("Didn't Clicked on Meet suppliers link");
        }
    }
    /*
    * a.Method Name: verifyUrlPrivateSourcing
    * b.Author Name: Samhitha
    * c.Description: This method is used to verify the url which contains private sourcing meeting
    * d.Return Type: void
    */
    public void verifyURLPrivateSourcing(String url){
        try {
            String url3=Base.driver.getCurrentUrl();
            System.out.println(url3);
            Screenshot.captureFullScreenshot("Private Souring");
            Reporter.attachScreenshotToReport("Private Sourcing", test, " Private Sourcing ScreenShot Attached to the report");
            Assert.assertTrue(url3.contains(url));
            test.log(Status.PASS, "Verified Private sourcing meeting url");
            LoggerHandler.info("Verified Private sourcing meeting url");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Invalid URL");
            test.log(Status.FAIL, "Invalid URL");
            LoggerHandler.error(" It is an invalid URL");
        }
    }
    /*
     * a.Method Name: verifyTitleMeetSuppliers
     * b.Author Name: Samhitha
     * c.Description: This method is used to Verify Title
     * d.Return Type: void
     */
    public void verifyTitleMeetSuppliers(String title){
        try {
            String title3=Base.driver.getTitle();
            System.out.println(title3);
            Assert.assertTrue(title3.contains(title));
            test.log(Status.PASS, "Meet Suppliers Verified Successfully");
            LoggerHandler.info("Meet Suppliers Verified Successfully");
        } catch (AssertionError e) {
            Screenshot.captureFullErrorScreenshot("Couldn't verify the title contains Meet Suppliers");
            test.log(Status.FAIL, "Couldn't verify the title contains Meet Suppliers");
            LoggerHandler.error("Couldn't verify the title contains Meet Suppliers");
        }
    }
}
