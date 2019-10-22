package main.core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SinglePatern {

    private static WebDriver driver;

    private SinglePatern() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = DriverFactory.init(BrowserType.CHROME);
        }
        return driver;
    }
}
