package main.core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver init(BrowserType browserType) {
        switch (browserType) {
            case CHROME:
                return new ChromeDriverProvider().createWebdriver();
            case FIREFOX:
                return new FireFoxDriverProvider().createWebdriver();
            default:
                return new ChromeDriverProvider().createWebdriver();
        }
    }
}
