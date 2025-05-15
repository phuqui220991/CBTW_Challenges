package pages.mobile;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.PageActionsHelper;

public class LoginPage {
    private AppiumDriver driver;

    private By LoginOrSignUpBtn = AppiumBy.xpath("//android.widget.TextView[@text=\"Log in or sign up with WordPress.com\"]");
    private By EmailInput = AppiumBy.id("org.wordpress.android:id/input");

    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
    }

    public void login(String user, String pass) {
        PageActionsHelper.waitAndClick(driver, LoginOrSignUpBtn, LoginOrSignUpBtn);
        PageActionsHelper.waitAndType(driver, EmailInput, LoginOrSignUpBtn, "woxak18507@magpit.com");
    }
}
