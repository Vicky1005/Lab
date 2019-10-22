package main.core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverProvider  implements  WebdriverProvider{
    @Override
    public WebDriver createWebdriver() {
        return new FirefoxDriver();
    }
}
