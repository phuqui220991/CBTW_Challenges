package tests.web;

import com.aventstack.extentreports.ExtentTest;
import com.github.javafaker.Faker;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.web.*;
import testBase.BaseTest;

public class WebE2E extends BaseTest {
    private Faker faker;

    @BeforeMethod
    public void createTest() {
        test = extent.createTest("Web E2E Test");
        faker = new Faker();
    }

    @Test
    public void testWebFlow() {
        test.info("Navigating to CTF Learn");
        webDriver.get("https://ctflearn.com");
        test.info("Navigating to Login Page");
        LoginPage loginPage = new HomePage(webDriver).navigateToLoginPage();
        test.info("Logging in");
        loginPage.login("woxak18507@magpit.com", "1234567890");
        test.info("Verifying toast message after login");
        boolean isToastDisplayed = loginPage.isToastDisplayed();
        if (isToastDisplayed) {
            test.pass("Toast message displayed successfully");
        } else {
            test.fail("Toast message not displayed");
        }
        test.info("Navigating to Create Challenge");
        CreateChallengePage createChallengePage = new HomePage(webDriver).navigateToCreateChallengePage();
        String title = faker.lorem().sentence();
        String flag = String.valueOf(faker.random().nextInt(4));
        String solve = faker.lorem().paragraph();
        createChallengePage.createAChallenge(title, flag, solve);
        
    }
}
