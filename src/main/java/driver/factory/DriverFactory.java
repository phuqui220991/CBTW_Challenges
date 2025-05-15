package driver.factory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    public static WebDriver createWebDriver() {
        return new EdgeDriver();
    }

    public static AppiumDriver createMobileDriver() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("emulator-5554");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("org.wordpress.android");
        options.setAppActivity("org.wordpress.android.ui.WPLaunchActivity");
        options.setApp("C:\\Qui.Ngo\\Automation\\Selenium\\CBTW_Challenges\\src\\main\\resources\\app.apk");
        return new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
    }
}
