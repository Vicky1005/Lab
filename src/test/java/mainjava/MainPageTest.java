package mainjava;

import main.pages.MainPage;
import org.junit.jupiter.api.*;
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
    @Tag("smoke")
    @DisplayName("Main Page Test")
    void mainPageTest() {
        MainPage mainPage = new MainPage();
        mainPage.navigateToMainPage();
//        mainPage.bestSellers();
        mainPage.searchForItem("Blouse").addToCard();
        mainPage.makeScreenshot();
    }

    @AfterAll
    void close(){
        driver.quit();
    }
}
