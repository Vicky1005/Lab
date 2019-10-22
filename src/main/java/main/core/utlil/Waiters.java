package main.core.utlil;

import main.core.driver.SinglePatern;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

final public class Waiters {
    final private static long DEFAULT_TIME = 15;

    private Waiters() {

    }

    public static WebElement waitUntilElementDisplayed(long time, By element) {
        return new WebDriverWait(SinglePatern.getDriver(), time).until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public static WebElement waitUntilElementDisplayed(long time, WebElement element) {
        return new WebDriverWait(SinglePatern.getDriver(), time).until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitUntilElementDisplayed(WebElement element) {
        return waitUntilElementDisplayed(DEFAULT_TIME, element);
    }

    public static WebElement waitUntilElementDisplayed(By element) {
        return waitUntilElementDisplayed(DEFAULT_TIME, element);
    }

    public static List<WebElement> waitUntilElementsDisplayed(WebDriver driver, long time, By element) {
        return new WebDriverWait(driver, time).until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
    }

    public static List<WebElement> waitUntilElementsDisplayed(WebDriver driver, By element) {
        return waitUntilElementsDisplayed(driver, DEFAULT_TIME, element);
    }


    public static List<WebElement> waitUntilElementsDisplayed(WebDriver driver, long time, List<WebElement> elements) {
        return new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    public static List<WebElement> waitUntilElementsDisplayed(WebDriver driver, List<WebElement> elements) {
        return waitUntilElementsDisplayed(driver, DEFAULT_TIME, elements);
    }
}