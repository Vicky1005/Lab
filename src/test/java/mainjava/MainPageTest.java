package mainjava;

import main.pages.MainPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MainPageTest {

    private WebDriver driver;

    @BeforeAll
    void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    void mainPageTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.navigateToMainPage();
//        mainPage.bestSellers();
        mainPage.searchForItem("Blouse").addToCard();
    }
}
