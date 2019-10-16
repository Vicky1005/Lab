package main.core.utlil;

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

    public static WebElement waitUntilElementDisplayed(WebDriver driver, long time, By element) {
        return new WebDriverWait(driver, time).until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public static WebElement waitUntilElementDisplayed(WebDriver driver, long time, WebElement element) {
        return new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitUntilElementDisplayed(WebDriver driver, WebElement element) {
        return waitUntilElementDisplayed(driver, DEFAULT_TIME, element);
    }

    public static WebElement waitUntilElementDisplayed(WebDriver driver, By element) {
        return waitUntilElementDisplayed(driver, DEFAULT_TIME, element);
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