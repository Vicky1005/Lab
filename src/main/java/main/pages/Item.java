package main.pages;

import main.core.utlil.Waiters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Item {
    private By addButton = By.xpath(".//a[@title='Add to cart']");
    private By viewButton = By.xpath("//a[@title='View']");
    private final WebElement parent;

    public Item(WebElement parent) {
        this.parent = parent;
    }

    public void addToCard() {
        parent.findElement(addButton).click();
    }
}
