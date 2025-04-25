package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.MadeInChinaCategoriesPageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class MadeInChinaNavigationPage {
    WebDriverHelper helper;
    ExtentTest test;

    public MadeInChinaNavigationPage(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }

    /*
     * a. Method Name: clickOnCategory
     * b. Author Name: Pruthviraj Batti
     * c. Description: Method to click on a category and log the action.
     * d. Return Type: void
     * e. Parameter List: By path, String heading
     */
    public void clickOnCategory(By path, String heading) {
        try {
            helper.clickOnElement(MadeInChinaCategoriesPageLocators.popup);
            helper.waitForElementToBeVisible(path, 10);
            helper.clickOnElement(path);
            LoggerHandler.info("Successfully Clicked on the " + heading);
            test.log(Status.PASS, "Successfully Clicked on the " + heading);
        } catch (Exception e) {
            LoggerHandler.error("Failed to Click on the " + heading);
            test.log(Status.FAIL, "Failed to Click on the " + heading);
        }
    }

    /*
     * a. Method Name: navigateBack
     * b. Author Name: Pruthviraj Batti
     * c. Description: Method to navigate back to the previous page and log the action.
     * d. Return Type: void
     * e. Parameter List: None
     */
    public void navigateBack() {
        try {
            helper.navigateBack();
            LoggerHandler.info("Successfully navigated Back");
            test.log(Status.PASS, "Successfully navigated Back");
        } catch (Exception e) {
            LoggerHandler.info("Failed to navigated Back");
            test.log(Status.PASS, "Failed to navigated Back");
        }
    }

    /*
     * a. Method Name: verifyheading
     * b. Author Name: Pruthviraj Batti
     * c. Description: Method to verify the heading of the current page and log the action.
     * d. Return Type: void
     * e. Parameter List: String heading
     */
    public void verifyheading(String heading) {
        try {
            String text = helper.getText(MadeInChinaCategoriesPageLocators.title);
            Assert.assertEquals(text, heading);
            LoggerHandler.info("Successfully verified the heading " + heading);
            test.log(Status.PASS, "Successfully verified the heading " + heading);
        } catch (Exception e) {
            LoggerHandler.info("Failed to verified the heading " + heading);
            test.log(Status.FAIL, "Failed to verified the heading " + heading);
        }
    }

    /*
     * a. Method Name: clickOnManufacturing
     * b. Author Name: Pruthviraj Batti
     * c. Description: Method to click on the Manufacturing category and verify the heading.
     * d. Return Type: void
     * e. Parameter List: String heading
     */
    public void clickOnManufacturing(String heading) {
        clickOnCategory(MadeInChinaCategoriesPageLocators.Manufacturing, heading);
        verifyheading(heading);
        navigateBack();
    }

    /*
     * a. Method Name: clickOnConsumerElectronics
     * b. Author Name: Pruthviraj Batti
     * c. Description: Method to click on the Consumer Electronics category and verify the heading.
     * d. Return Type: void
     * e. Parameter List: String heading
     */
    public void clickOnConsumerElectronics(String heading) {
        clickOnCategory(MadeInChinaCategoriesPageLocators.consumerElectronics, heading);
        verifyheading(heading);
        navigateBack();
    }

    /*
     * a. Method Name: clickOnIndustrialEquipmentComponents
     * b. Author Name: Pruthviraj Batti
     * c. Description: Method to click on the Industrial Equipment Components category and verify the heading.
     * d. Return Type: void
     * e. Parameter List: String heading
     */
    public void clickOnIndustrialEquipmentComponents(String heading) {
        clickOnCategory(MadeInChinaCategoriesPageLocators.industrialEquipmentComponents, heading);
        verifyheading(heading);
        navigateBack();
    }

    /*
     * a. Method Name: clickOnElectricalElectronics
     * b. Author Name: Pruthviraj Batti
     * c. Description: Method to click on the Electrical Electronics category and verify the heading.
     * d. Return Type: void
     * e. Parameter List: String heading
     */
    public void clickOnElectricalElectronics(String heading) {
        clickOnCategory(MadeInChinaCategoriesPageLocators.electricalElectronics, heading);
        verifyheading(heading);
        navigateBack();
    }

    /*
     * a. Method Name: clickOnConstructionDecoration
     * b. Author Name: Pruthviraj Batti
     * c. Description: Method to click on the Construction Decoration category and verify the heading.
     * d. Return Type: void
     * e. Parameter List: String heading
     */
    public void clickOnConstructionDecoration(String heading) {
        clickOnCategory(MadeInChinaCategoriesPageLocators.constructionDecoration, heading);
        verifyheading(heading);
        navigateBack();
    }

    /*
     * a. Method Name: clickOnLightIndustryDailyUse
     * b. Author Name: Pruthviraj Batti
     * c. Description: Method to click on the Light Industry Daily Use category and verify the heading.
     * d. Return Type: void
     * e. Parameter List: String heading
     */
    public void clickOnLightIndustryDailyUse(String heading) {
        clickOnCategory(MadeInChinaCategoriesPageLocators.lightIndustryDailyUse, heading);
        verifyheading(heading);
        navigateBack();
    }

    /*
     * a. Method Name: clickOnAutoMotorcyclePartsAccessories
     * b. Author Name: Pruthviraj Batti
     * c. Description: Method to click on the Auto Motorcycle Parts Accessories category and verify the heading.
     * d. Return Type: void
     * e. Parameter List: String heading
     */
    public void clickOnAutoMotorcyclePartsAccessories(String heading) {
        clickOnCategory(MadeInChinaCategoriesPageLocators.autoMotorcyclePartsAccessories, heading);
        verifyheading(heading);
        navigateBack();
    }

    /*
     * a. Method Name: clickOnApparelAccessories
     * b. Author Name: Pruthviraj Batti
     * c. Description: Method to click on the Apparel Accessories category and verify the heading.
     * d. Return Type: void
     * e. Parameter List: String heading
     */
    public void clickOnApparelAccessories(String heading) {
        clickOnCategory(MadeInChinaCategoriesPageLocators.apparelAccessories, heading);
        verifyheading(heading);
        navigateBack();
    }

    /*
     * a. Method Name: clickOnLightsLighting
     * b. Author Name: Pruthviraj Batti
     * c. Description: Method to click on the Lights Lighting category and verify the heading.
     * d. Return Type: void
     * e. Parameter List: String heading
     */
    public void clickOnLightsLighting(String heading) {
        clickOnCategory(MadeInChinaCategoriesPageLocators.lightsLighting, heading);
        verifyheading(heading);
        navigateBack();
    }

    /*
     * a. Method Name: clickOnSportingGoodsRecreation
     * b. Author Name: Pruthviraj Batti
     * c. Description: Method to click on the Sporting Goods Recreation category and verify the heading.
     * d. Return Type: void
     * e. Parameter List: String heading
     */
    public void clickOnSportingGoodsRecreation(String heading) {
        clickOnCategory(MadeInChinaCategoriesPageLocators.sportingGoodsRecreation, heading);
        verifyheading(heading);
        navigateBack();
    }
}
