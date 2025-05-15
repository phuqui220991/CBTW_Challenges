package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageActionsHelper {
    private PageActionsHelper() {
    }

    public static void waitAndClick(WebDriver driver, By by) {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.findElement(by).click();
    }

    public static void waitAndClick(AppiumDriver driver, By androidBy, By iosBy) {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(androidBy));
        By byBasedOnMobilePlatform = getByBasedOnMobilePlatform(driver, androidBy, iosBy);
        driver.findElement(byBasedOnMobilePlatform).click();
    }

    public static void waitAndType(AppiumDriver driver, By androidBy, By iosBy, String value) {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(androidBy));
        By byBasedOnMobilePlatform = getByBasedOnMobilePlatform(driver, androidBy, iosBy);
        driver.findElement(byBasedOnMobilePlatform).sendKeys(value);
    }

    public static void waitAndType(WebDriver driver, By by, String value) {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(value);
    }

    public static boolean isElementDisplayed(WebDriver driver, By by) {
        return new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(by)).isDisplayed();
    }

    private static By getByBasedOnMobilePlatform(AppiumDriver driver, By androidBy, By iosBy) {
        return isAndroid(driver) ? androidBy : iosBy;
    }

    private static boolean isAndroid(AppiumDriver driver) {
        return driver instanceof AndroidDriver;
    }

}
