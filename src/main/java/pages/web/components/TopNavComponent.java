package pages.web.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.PageActionsHelper.waitAndClick;

public class TopNavComponent {

    private static final By LOGIN_BTN = By.xpath("//div[@id='navbarSupportedContent']//a[text()='Login']");
    private static final By CHALLENGES_DROPDOWN = By.xpath("//div[@id='navbarSupportedContent']//a[@data-toggle='dropdown']");
    private static final By CREATE_CHALLENGE_OPTION = By.xpath("//div[@id='navbarSupportedContent']//a[text()='Create Challenge']");
    public TopNavComponent clickLoginBtn(WebDriver driver) {
        waitAndClick(driver, LOGIN_BTN);
        return this;
    }

    public TopNavComponent navigateToCreateChallenge(WebDriver driver) {
        waitAndClick(driver, CHALLENGES_DROPDOWN);
        waitAndClick(driver, CREATE_CHALLENGE_OPTION);
        return this;
    }
}
