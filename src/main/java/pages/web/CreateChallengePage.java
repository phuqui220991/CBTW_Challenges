package pages.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PageActionsHelper;

public class CreateChallengePage {

    private WebDriver driver;

    private By TITLE_FLD = By.id("title");
    private By FLAG_FLD = By.id("flag");
    private By HOW_TO_SOLVE_FLD = By.id("howtosolve");
    private By SUBMIT_BTN = By.xpath("//button[@type='submit']");

    public CreateChallengePage(WebDriver driver) {
        this.driver = driver;
    }

    public void createAChallenge(String title, String flag, String solve) {

        PageActionsHelper.waitAndType(driver, TITLE_FLD, title);
        PageActionsHelper.waitAndType(driver, FLAG_FLD, "CTFlearn{" + flag + "}");
        PageActionsHelper.waitAndType(driver, HOW_TO_SOLVE_FLD, solve);
        PageActionsHelper.waitAndClick(driver, SUBMIT_BTN);
    }
}
