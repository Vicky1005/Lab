package mainjava;

import main.pages.MainPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MainPage1Test {

    private WebDriver driver;

    @BeforeAll
    void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    @Tag("smoke")
    @DisplayName("Main Page Test2")
    void mainPageTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.navigateToMainPage();
//        mainPage.bestSellers();
        mainPage.searchForItem("Blouse").addToCard();
    }

    @AfterAll
    void close(){
        driver.quit();
    }
}
