package mainjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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

        /*driver.navigate().to("http://automationpractice.com");
        WebElement webElement = driver.findElement(By.xpath("//input[@id='search_query_top']"));
        webElement.sendKeys("Blouse");
        webElement.sendKeys(Keys.ENTER);
        WebElement webElement1 = driver.findElement(By.xpath("//span[contains(text(), 'result has been found.')]"));
        System.out.println(webElement1.isDisplayed());
        WebElement webElement2 = driver.findElement(By.xpath("//ul[@class='product_list grid row']/li"));
        System.out.println(webElement2.getText());*/

        /*driver.get("http://the-internet.herokuapp.com/iframe");
        WebElement element= driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(element);
        driver.findElement(By.xpath("//body[@id='tinymce']/p")).clear();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//body[@id='tinymce']/p"));*/


//        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
//        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//        alert.dismiss();
//        boolean result = driver.findElement(By.xpath("//p[@id='result']")).isDisplayed();
//        Assertions.assertTrue(result, "Element is no found");
//        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//        alert.sendKeys("test");
//        alert.accept();
//        boolean result2 = driver.findElement(By.xpath("//p[@id='result']")).isDisplayed();
//        Assertions.assertTrue(result2, "Text is not displayed");
//        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@id='result']")));

//
//        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
//        WebElement element = driver.findElement(By.xpath("//div[@id='finish']/h4"));

//
//        String script="var element=arguments[0];"
//                +"element.style.display='block';";
//        ((JavascriptExecutor)driver).executeScript(script, element);
//        String text= element.getText();
//        System.out.println(text);

//        String text = element.getAttribute("value");
//        System.out.println(text);


//        driver.get("http://the-internet.herokuapp.com/drag_and_drop");
//        WebElement source=driver.findElement(By.xpath("//div[@id='column-a']"));
//        WebElement target=driver.findElement(By.xpath("//div[@id='column-b']"));
//        Actions builder=new Actions(driver);
//        builder.dragAndDrop(source, target).perform();

        driver.get("http://the-internet.herokuapp.com/context_menu");
        WebElement element3=driver.findElement(By.xpath("//div[@id='hot-spot']"));
        Actions actions =new Actions(driver);
        actions.contextClick(element3).perform();

    }
}