package mainjava;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class SimpleTest {

    @Test
    void test() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.get("http://litecart.stqa.ru/ru/");
//        driver.quit();

        driver.manage().window().setSize(new Dimension(800, 600));
        /*driver.get("http://automationpractice.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        By locator = By.xpath("//img[@title='Faded Short Sleeve T-shirts']");
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(locator));
        WebElement element = driver.findElement(locator);
        element.click();*/

        /*driver.get("http://the-internet.herokuapp.com/windows");
        By locator2 = By.xpath("//a[text()='Click Here']");
        WebElement webElement = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(locator2));
        webElement.click();
        Set<String> windows=driver.getWindowHandles();
        driver.switchTo().window((String) windows.toArray()[1]);
        System.out.println(windows);
        driver.close();*/

        driver.navigate().to("http://automationpractice.com");
        WebElement webElement = driver.findElement(By.xpath("//input[@id='search_query_top']"));
        webElement.sendKeys("Blouse");
        webElement.sendKeys(Keys.ENTER);
        WebElement webElement1 = driver.findElement(By.xpath("//span[contains(text(), 'result has been found.')]"));
        System.out.println(webElement1.isDisplayed());
        WebElement webElement2 = driver.findElement(By.xpath("//ul[@class='product_list grid row']/li"));
        System.out.println(webElement2.getText());


    }
}

