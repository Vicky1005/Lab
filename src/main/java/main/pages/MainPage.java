package main.pages;

import main.core.utlil.Waiters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {

    private WebDriver driver;

    @FindBy(xpath = "//a[text()='Popular']")
    private WebElement popular;

    @FindBy(xpath = "//a[text()='Best Sellers']")
    private WebElement bestSellers;

    @FindBy(xpath = "//ul[@id='homefeatured']/li")
    private List<WebElement> items;


    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainPage popular() {
        Waiters.waitUntilElementDisplayed(driver, popular).click();
        return this;
    }

    public MainPage bestSellers() {
        Waiters.waitUntilElementDisplayed(driver, bestSellers).click();
        return this;
    }

    public MainPage navigateToMainPage() {
        driver.get("http://automationpractice.com/index.php");
        return this;
    }

    public Item searchForItem(String itemName) {
        List<WebElement> elements = Waiters.waitUntilElementsDisplayed(driver, items);
        for (int i = 0; i < elements.size(); i++) {
            WebElement parentElement = elements.get(i);
            WebElement childElement = parentElement.findElement(By.xpath(".//h5/a"));
            if (childElement.getText().equalsIgnoreCase(itemName)) {
                return new Item(parentElement);
            }
        }
        throw new RuntimeException("Нет вещей с таким именем " + itemName);
    }
}