package stepdefinitions;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.Base;
import utils.Reporter;

public class Hooks extends Base {
static ExtentReports report;
     ExtentTest test;
     static String reportFilePath;
         /*
          * a.Method Name: initializeReport
          * b.Author Name: Team_09
          * c.Description: Intializes the ExtentReport before the tests execution.
          * d.Return Type: void
          * e.Paramenter List:none
          */
    @BeforeAll
    public static void initializeReport(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        String timestamp = dateFormat.format(new Date());
        reportFilePath = System.getProperty("user.dir") + "/reports/MADE_IN_CHINA_Report" + timestamp + ".html";
        report = Reporter.generateExtentReport(reportFilePath);
    }
    /*
     * a. Method Name: openTheBrowser
     * b. Author Name: Team_09
     * c. Description: Opens the browser before each test.
     * d. Return Type: void
     * e. Parameter List: None
     */
    @Before
    public void openTheBrowser(){
        openBrowser();
    }
    
    /*
     * a. Method Name: closeTheBrowser
     * b. Author Name: Team_09
     * c. Description: Closes the browser after each test.
     * d. Return Type: void
     * e. Parameter List: None
     */
    @After
    public void closeTheBrowser() {
        driver.quit();
    }
    /*
     * a.Method Name: finalizeReport
     * b.Author Name: Team_09
     * c.Description: Flushes the ExtentReport after the tests execution.
     * d.Return Type: void
     * e.Paramenter List:none
     */
	@AfterAll
	public static void finalizeReport() {
		report.flush();
        Reporter.sendEmailWithReport(reportFilePath);
    }


}
