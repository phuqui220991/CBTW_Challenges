package pages.web;

import org.openqa.selenium.WebDriver;
import pages.web.components.TopNavComponent;

public class HomePage {
    private WebDriver driver;

    private final TopNavComponent topNavComponent;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.topNavComponent = new TopNavComponent();
    }

    public LoginPage navigateToLoginPage() {
        topNavComponent.clickLoginBtn(driver);
        return new LoginPage(driver);
    }

    public CreateChallengePage navigateToCreateChallengePage() {
        topNavComponent.navigateToCreateChallenge(driver);
        return new CreateChallengePage(driver);
    }
}
