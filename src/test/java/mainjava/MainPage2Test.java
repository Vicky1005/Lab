package mainjava;

import io.qameta.allure.Description;
import main.pages.MainPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Disabled("причина")
public class MainPage2Test {

    private WebDriver driver;

    @BeforeAll
    void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    @DisplayName("My Test")
    void mainPageTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.navigateToMainPage();
//        mainPage.bestSellers();
        mainPage.searchForItem("Blouse").addToCard();
    }

    @Test
    @DisplayName("Onliner Test")
    @Description("Вход на сайт")
    void test1() {
        driver.get("https://www.onliner.by/");
    }
    @AfterAll
    void close() {
        driver.quit();
    }
}
