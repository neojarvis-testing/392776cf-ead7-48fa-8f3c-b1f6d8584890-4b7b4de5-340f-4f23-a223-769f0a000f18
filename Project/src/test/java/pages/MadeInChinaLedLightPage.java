package pages;

import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.MadeInChinaLanguagePageLocator;
import uistore.MadeInChinaLedLightPageLocator;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class MadeInChinaLedLightPage {
    WebDriverHelper helper;
    ExtentTest test;
    public MadeInChinaLedLightPage(ExtentTest test){
        this.test = test;
        helper = new WebDriverHelper(Base.driver);
    }
    /*
     * Method name: closePopUp.
     * AuthorName: Rishi Prashar.
     * Description: This method will help us to close the pop up.
     * Parameters: None.
     * return type: void.
     */
    public void closePopUp(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLanguagePageLocator.joinFree,3);
            helper.clickOnElement(MadeInChinaLanguagePageLocator.popup);
            test.log(Status.PASS, "closed pop up");
            LoggerHandler.info("closed pop up");
        } catch (Exception e) {Screenshot.captureFullErrorScreenshot("Did not close pop up");
            test.log(Status.FAIL, "Did not close pop up");
            LoggerHandler.error("Did not close pop up");
        }
    }
    /*
     * Method name: clickAndSendData.
     * AuthorName: Rishi Prashar.
     * Description: This method will click and send data to search bar.
     * Parameters: None.
     * return type: void.
     */
    public void clickAndSendData(String value){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightPageLocator.searchbar,3);
            helper.clickOnElement(MadeInChinaLedLightPageLocator.searchbar);
            helper.sendKeys(MadeInChinaLedLightPageLocator.searchbar,value);
            helper.enterAction(MadeInChinaLedLightPageLocator.searchbar);
            test.log(Status.PASS, "clicked and sent data to search bar");
            LoggerHandler.info("clicked and sent data to search bar");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Did not click and sent data to search bar");
            test.log(Status.FAIL, "Did not click and sent data to search bar");
            LoggerHandler.error("Did not click and sent data to search bar");
        }
    }
    /*
     * Method name: clickOnMore.
     * AuthorName: Rishi Prashar.
     * Description: This method will click on more button.
     * Parameters: None.
     * return type: void.
     */
    public void clickOnMore(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightPageLocator.more,3);
            helper.clickOnElement(MadeInChinaLedLightPageLocator.more);
            test.log(Status.PASS, "clicked on more");
            LoggerHandler.info("clicked on more");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Did not click on more");
            test.log(Status.FAIL, "Did not click on more");
            LoggerHandler.error("Did not click on more");
        }
    }
    /*
     * Method name: clickOnLedStripLight.
     * AuthorName: Rishi Prashar.
     * Description: This method will click on Led Strip Light.
     * Parameters: None.
     * return type: void.
     */
    public void clickOnLedStripLight(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightPageLocator.ledStripFilter,3);
            helper.clickOnElement(MadeInChinaLedLightPageLocator.ledStripFilter);
            test.log(Status.PASS, "clicked on ledStripFilter");
            LoggerHandler.info("clicked on ledStripFilter");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Did not click on ledStripFiltere");
            test.log(Status.FAIL, "Did not click on ledStripFilter");
            LoggerHandler.error("Did not click on ledStripFilter");
        }
    }
    /*
     * Method name: clickOnContactNow.
     * AuthorName: Rishi Prashar.
     * Description: This method will click on contact now button.
     * Parameters: None.
     * return type: void.
     */
    public void clickOnContactNow(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightPageLocator.contactNow,3);
            helper.clickAndSwitch(MadeInChinaLedLightPageLocator.contactNow);
            test.log(Status.PASS, "clicked on contact Now");
            LoggerHandler.info("clicked on contact Now");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Did not click on contact Now");
            test.log(Status.FAIL, "Did not click on contact Now");
            LoggerHandler.error("Did not click on contact Now");
        }
    }
    /*
     * Method name: verifyInquiry.
     * AuthorName: Rishi Prashar.
     * Description: This method will verify if the inquiry page.
     * Parameters: None.
     * return type: void.
     */
    public void verifyInquiry(String value){
        try {
            String text = helper.getText(MadeInChinaLedLightPageLocator.verifyInquiry);
            Assert.assertTrue(text.contains(value));
            test.log(Status.PASS, "Inquiry page is verified");
            LoggerHandler.info("Inquiry page is verified");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Inquiry page is not verified");
            test.log(Status.FAIL, "Inquiry page is not verified");
            LoggerHandler.error("Inquiry page is not verified");
        }
    }
    /*
     * Method name: clickAndSendInquiry.
     * AuthorName: Rishi Prashar.
     * Description: This method will click and send the enquiry.
     * Parameters: None.
     * return type: void.
     */
    public void clickAndSendInquiry(String value){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightPageLocator.content,3);
            helper.clickOnElement(MadeInChinaLedLightPageLocator.content);
            helper.sendKeys(MadeInChinaLedLightPageLocator.content,value);
            test.log(Status.PASS, "clicked and sent data to content field");
            LoggerHandler.info("clicked and sent data to content field");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Did not click and sent data to content field");
            test.log(Status.FAIL, "Did not click and sent data to content field");
            LoggerHandler.error("Did not click and sent data to content field");
        }
    }
     /*
     * Method name: clickAndSendInquiry.
     * AuthorName: Rishi Prashar.
     * Description: This method will click and send the email.
     * Parameters: None.
     * return type: void.
     */
    public void clickAndSendEmail(String value){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightPageLocator.email,3);
            helper.clickOnElement(MadeInChinaLedLightPageLocator.email);
            helper.sendKeys(MadeInChinaLedLightPageLocator.email,value);
            test.log(Status.PASS, "clicked and sent data to email field");
            LoggerHandler.info("clicked and sent data to email field");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Did not click and sent data to email field");
            test.log(Status.FAIL, "Did not click and sent data to email field");
            LoggerHandler.error("Did not click and sent data to email field");
        }
    }
     /*
     * Method name: clickAndSendInquiry.
     * AuthorName: Rishi Prashar.
     * Description: This method will click on send inquiry button.
     * Parameters: None.
     * return type: void.
     */
    public void clickOnSendInquiryNow(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightPageLocator.sendEnquiry,3);
            helper.clickOnElement(MadeInChinaLedLightPageLocator.sendEnquiry);
            test.log(Status.PASS, "clicked on sendEnquiry");
            LoggerHandler.info("clicked on sendEnquiry");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Did not click on sendEnquiry");
            test.log(Status.FAIL, "Did not click on sendEnquiry");
            LoggerHandler.error("Did not click on sendEnquiry");
        }
    }
     /*
     * Method name: clickOnCrossMark.
     * AuthorName: Rishi Prashar.
     * Description: This method will click on the cross mark.
     * Parameters: None.
     * return type: void.
     */
    public void clickOnCrossMark(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightPageLocator.crossMark,3);
            helper.clickOnElement(MadeInChinaLedLightPageLocator.crossMark);
            test.log(Status.PASS, "clicked on crossMark");
            LoggerHandler.info("clicked on crossMark");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Did not click on crossMark");
            test.log(Status.FAIL, "Did not click on crossMark");
            LoggerHandler.error("Did not click on crossMark");
        }
    }
    /*
     * Method name: clickOnCrossMark.
     * AuthorName: Rishi Prashar.
     * Description: This method will click on the made in china logo.
     * Parameters: None.
     * return type: void.
     */
    public void clickOnLogo(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightPageLocator.logo,3);
            helper.clickOnElement(MadeInChinaLedLightPageLocator.logo);
            test.log(Status.PASS, "clicked on logo");
            LoggerHandler.info("clicked on logo");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Did not click on logo");
            test.log(Status.FAIL, "Did not click on logo");
            LoggerHandler.error("Did not click on logo");
        }
    }
    /*
     * Method name: verifyHomePage.
     * AuthorName: Rishi Prashar.
     * Description: This method will verify if we are in home page or not.
     * Parameters: None.
     * return type: void.
     */
    public void verifyHomePage(String value){
        try {
            String text = helper.getText(MadeInChinaLedLightPageLocator.verifyHomePage);
            Assert.assertTrue(text.contains(value));
            test.log(Status.PASS, "Home page is verified");
            LoggerHandler.info("Home page is verified");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Home page is not verified");
            test.log(Status.FAIL, "Home page is not verified");
            LoggerHandler.error("Home page is not verified");
        }
    }
    /*
     * Method name: hoverOnLigtsAndLightning.
     * AuthorName: Rishi Prashar.
     * Description: This method will hover on lights.
     * Parameters: None.
     * return type: void.
     */
    public void hoverOnLigtsAndLightning(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightPageLocator.lightsAndLighting,3);
            helper.hoverOverElement(MadeInChinaLedLightPageLocator.lightsAndLighting);
            test.log(Status.PASS, "Hovered on lights And Lighting ");
            LoggerHandler.info("Hovered On lights And Lighting");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Did not hover on lights And Lighting");
            test.log(Status.FAIL, "Did not hover on lights And Lighting");
            LoggerHandler.error("Did not hover over lights And Lighting");
        }
    }
    /*
     * Method name: clickOnLedTube.
     * AuthorName: Rishi Prashar.
     * Description: This method will click on led tube.
     * Parameters: None.
     * return type: void.
     */
    public void clickOnLedTube(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightPageLocator.ledTube,3);
            helper.clickOnElement(MadeInChinaLedLightPageLocator.ledTube);
            test.log(Status.PASS, "clicked on ledTube");
            LoggerHandler.info("clicked on ledTube");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Did not click on ledTube");
            test.log(Status.FAIL, "Did not click on ledTube");
            LoggerHandler.error("Did not click on ledTube");
        }
    }
    /*
     * Method name: verifyLedTube.
     * AuthorName: Rishi Prashar.
     * Description: This method will verify the led tube page.
     * Parameters: None.
     * return type: void.
     */
    public void verifyLedTube(String value){
        try {
            String text = helper.getText(MadeInChinaLedLightPageLocator.verifyLedTube);
            Assert.assertTrue(text.contains(value));
            test.log(Status.PASS, "LED Tube page is verified");
            LoggerHandler.info("LED Tube page is verified");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("LED Tube page is not verified");
            test.log(Status.FAIL, "LED Tube page is not verified");
            LoggerHandler.error("LED Tube page is not verified");
        }
    }
    /*
     * Method name: clickOnLedTubeFilter.
     * AuthorName: Rishi Prashar.
     * Description: This method will click on led tube filter.
     * Parameters: None.
     * return type: void.
     */
    public void clickOnLedTubeFilter(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightPageLocator.ledTubeLightFilter,3);
            helper.clickOnElement(MadeInChinaLedLightPageLocator.ledTubeLightFilter);
            test.log(Status.PASS, "clicked on ledTubeLightFilter");
            LoggerHandler.info("clicked on ledTubeLightFilter");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Did not click on ledTubeLightFilter");
            test.log(Status.FAIL, "Did not click on ledTubeLightFilter");
            LoggerHandler.error("Did not click on ledTubeLightFilter");
        }
    }
    /*
     * Method name: clickOnColorTemprature.
     * AuthorName: Rishi Prashar.
     * Description: This method will click on color temprature in led page.
     * Parameters: None.
     * return type: void.
     */
    public void clickOnColorTemprature(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightPageLocator.colorTemp,3);
            helper.clickOnElement(MadeInChinaLedLightPageLocator.colorTemp);
            test.log(Status.PASS, "clicked on color Temprature");
            LoggerHandler.info("clicked on color Temprature");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Did not click on color Temprature");
            test.log(Status.FAIL, "Did not click on color Temprature");
            LoggerHandler.error("Did not click on color Temprature");
        }
    }
    /*
     * Method name: clickOnWarmWhite.
     * AuthorName: Rishi Prashar.
     * Description: This method will click on Warm white filter.
     * Parameters: None.
     * return type: void.
     */
    public void clickOnWarmWhite(){
        try {
            helper.waitForElementToBeVisible(MadeInChinaLedLightPageLocator.warmwhite,3);
            helper.clickOnElement(MadeInChinaLedLightPageLocator.warmwhite);
            test.log(Status.PASS, "clicked on color warm white");
            LoggerHandler.info("clicked on color warm white");
        } catch (Exception e) {
            Screenshot.captureFullErrorScreenshot("Did not click on color warm white");
            test.log(Status.FAIL, "Did not click on color warm white");
            LoggerHandler.error("Did not click on color warm white");
        }
    }
}