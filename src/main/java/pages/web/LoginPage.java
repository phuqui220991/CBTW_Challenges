package pages.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PageActionsHelper;

public class LoginPage {
    private WebDriver driver;

    private By username = By.id("identifier");
    private By password = By.id("password");
    private By loginBtn = By.xpath("//button[text()='Login']");
    private By toastContainer = By.id("toast-container");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String user, String pass) {
        PageActionsHelper.waitAndType(driver, username, user);
        PageActionsHelper.waitAndType(driver, password, pass);
        PageActionsHelper.waitAndClick(driver, loginBtn);
    }

    public boolean isToastDisplayed() {
        return PageActionsHelper.isElementDisplayed(driver, toastContainer);
    }
}
