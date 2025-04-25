package stepdefinitions;
 
import com.aventstack.extentreports.ExtentTest;
 
import io.cucumber.java.en.When;
import pages.MadeInChinaNavigationPage;
 
public class NavigationPage {
    ExtentTest test=Hooks.report.createTest("Navigation Page");
    MadeInChinaNavigationPage madeInChinaNavigationPage =new MadeInChinaNavigationPage(test);
   @When("I click on popup and click on Manufacturing & Processing Machinery  and verify heading {string} and navigate Back")
public void i_click_on_popup_and_click_on_manufacturing_processing_machinery_and_verify_heading_and_navigate_back(String string) {
    madeInChinaNavigationPage.clickOnManufacturing(string);
}
@When("I click on popup and click on Consumer Electronics   and verify heading {string} and navigate Back")
public void i_click_on_popup_and_click_on_consumer_electronics_and_verify_heading_and_navigate_back(String string) {
    madeInChinaNavigationPage.clickOnConsumerElectronics(string);
}
@When("I click on popup and click on Industrial Equipment & Components  and verify heading {string} and navigate Back")
public void i_click_on_popup_and_click_on_industrial_equipment_components_and_verify_heading_and_navigate_back(String string) {
    madeInChinaNavigationPage.clickOnIndustrialEquipmentComponents(string);
}
@When("I click on popup and click on Electrical & Electronics   and verify heading {string} and navigate Back")
public void i_click_on_popup_and_click_on_electrical_electronics_and_verify_heading_and_navigate_back(String string) {
    madeInChinaNavigationPage.clickOnElectricalElectronics(string);
}
@When("I click on popup and click on Construction & Decoration   and verify heading {string} and navigate Back")
public void i_click_on_popup_and_click_on_construction_decoration_and_verify_heading_and_navigate_back(String string) {
    madeInChinaNavigationPage.clickOnConstructionDecoration(string);
}
@When("I click on popup and click on Light Industry & Daily Use   and verify heading {string} and navigate Back")
public void i_click_on_popup_and_click_on_light_industry_daily_use_and_verify_heading_and_navigate_back(String string) {
    madeInChinaNavigationPage.clickOnLightIndustryDailyUse(string);
}
@When("I click on popup and click on Auto, Motorcycle Parts & Accessories   and verify heading {string} and navigate Back")
public void i_click_on_popup_and_click_on_auto_motorcycle_parts_accessories_and_verify_heading_and_navigate_back(String string) {
    madeInChinaNavigationPage.clickOnAutoMotorcyclePartsAccessories(string);
}
@When("I click on popup and click on Apparel & Accessories   and verify heading {string} and navigate Back")
public void i_click_on_popup_and_click_on_apparel_accessories_and_verify_heading_and_navigate_back(String string) {
    madeInChinaNavigationPage.clickOnApparelAccessories(string);
}
@When("I click on popup and click on Lights & Lighting   and verify heading {string} and navigate Back")
public void i_click_on_popup_and_click_on_lights_lighting_and_verify_heading_and_navigate_back(String string) {
   madeInChinaNavigationPage.clickOnLightsLighting(string);
}
@When("I click on popup and click on Sporting Goods & Recreation   and verify heading {string} and navigate Back")
public void i_click_on_popup_and_click_on_sporting_goods_recreation_and_verify_heading_and_navigate_back(String string) {
   madeInChinaNavigationPage.clickOnSportingGoodsRecreation(string);
}
}