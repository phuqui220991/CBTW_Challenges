package testBase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import driver.factory.DriverFactory;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;

public class BaseTest {
    protected WebDriver webDriver;
    protected AppiumDriver mobileDriver;
    protected static ExtentReports extent;
    protected static ExtentTest test;

    @BeforeSuite
    public void initReport() {
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");
        extent.attachReporter(spark);
    }

    @Parameters("platform")
    @BeforeClass
    public void setup(@Optional("web") String platform) throws MalformedURLException {
        if (platform.equalsIgnoreCase("web")) {
            webDriver = DriverFactory.createWebDriver();
        } else if (platform.equalsIgnoreCase("mobile")) {
            mobileDriver = DriverFactory.createMobileDriver();
        }
    }

    @AfterClass
    public void tearDown() {
        if (webDriver != null) webDriver.quit();
        if (mobileDriver != null) mobileDriver.quit();
    }

    @AfterSuite
    public void flushReport() {
        extent.flush();
    }
}
