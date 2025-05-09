package utils;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import com.google.common.io.Files;
public class Screenshot extends Base {
    private static final String time = "yyyy.MM.dd.HH.mm.ss";
    private static final String directory = "user.dir";
    private static final String screenshotDirectory = "/screenshots";
    private static final String errorScreenshot="/errorScreenshots";
    /*
   * MethodName: captureFullScreenshot
   * AuthorName: SaiRohith
   * Description: This method is used to capture full screenshot of the page when called
   * Parameters: String filename
   * ReturnType: void
   */
    public static void captureFullScreenshot(String filename) {
        String timestamp = new SimpleDateFormat(time).format(new Date());
        String name = filename + timestamp + ".png";
        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        File screenshotsDir = new File(System.getProperty(directory) + screenshotDirectory);
        if (!screenshotsDir.exists()) {
            screenshotsDir.mkdirs();
        }
        File target = new File(screenshotsDir, name);
        try {
            Files.copy(file, target);
        } catch (IOException e) {
            LoggerHandler.error("captureFullScreenshot not working");
        }
    }
    /*
   * MethodName: captureFullErrorScreenshot
   * AuthorName: SaiRohith
   * Description: This method is used to capture full screenshot of the page when called
   * Parameters: String filename
   * ReturnType: void
   */
  public static void captureFullErrorScreenshot(String filename) {
    String timestamp = new SimpleDateFormat(time).format(new Date());
    String name = filename + timestamp + ".png";
    TakesScreenshot ts = (TakesScreenshot) driver;
    File file = ts.getScreenshotAs(OutputType.FILE);
    File screenshotsDir = new File(System.getProperty(directory) + errorScreenshot);
    if (!screenshotsDir.exists()) {
        screenshotsDir.mkdirs();
    }
    File target = new File(screenshotsDir, name);
    try {
        Files.copy(file, target);
    } catch (IOException e) {
        LoggerHandler.error("captureFullScreenshot not working");
    }
}
     /*
   * MethodName: captureHighlightedElementScreenshot
   * AuthorName: SaiRohith
   * Description: This method is used to capture the full size of the page but highlights the element of the specified xpath.
   * Parameters: By xpath, String filename
   * ReturnType: void
   */
    public static void captureHighlightedElementScreenshot(By xpath, String filename) {
    	WebElement element = driver.findElement(xpath);
        String timestamp = new SimpleDateFormat(time).format(new Date());
        String name = filename + timestamp + ".png";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid red'", element);
        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        File screenshotsDir = new File(System.getProperty(directory) + screenshotDirectory);
        if (!screenshotsDir.exists()) {
            screenshotsDir.mkdirs();
        }
        File target = new File(screenshotsDir, name);
        try {
            Files.copy(file, target);
        } catch (IOException e) {
            LoggerHandler.error("captureHighlightedElementScreenshot not working");
        } finally {
            js.executeScript("arguments[0].style.border=''", element);
        }
    }
   /*
   * MethodName: captureElementOnlyScreenshot
   * AuthorName: SaiRohith
   * Description: This method is used to capture only the screenshot of the element of the specified element.
   * Parameters: By xpath, String filename
   * ReturnType: void
   */
    public static void captureElementOnlyScreenshot(By xpath, String filename) {
    	WebElement element = driver.findElement(xpath);
        String timestamp = new SimpleDateFormat(time).format(new Date());
        String name = filename + timestamp + ".png";
        File file = element.getScreenshotAs(OutputType.FILE);
        File screenshotsDir = new File(System.getProperty(directory) + screenshotDirectory);
        if (!screenshotsDir.exists()) {
            screenshotsDir.mkdirs();
        }
        File target = new File(screenshotsDir, name);
        try {
            Files.copy(file, target);
        } catch (IOException e) {
            LoggerHandler.error("captureElementOnlyScreenshot not working");
        }
    }
}