package main.core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverProvider implements  WebdriverProvider {
    @Override
    public WebDriver createWebdriver() {
        return new ChromeDriver();
    }
}
