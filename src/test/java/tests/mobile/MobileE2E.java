package tests.mobile;

import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.mobile.*;
import testBase.BaseTest;

public class MobileE2E extends BaseTest {
    @BeforeMethod
    public void createTest() {
        test = extent.createTest("Mobile E2E Test");
    }

    @Test
    public void testMobileFlow() {
        test.info("Logging in to mobile app");
        new LoginPage(mobileDriver).login("user", "pass");
    }
}
