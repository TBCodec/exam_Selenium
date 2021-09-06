package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected HomePage homePage;


    @BeforeEach
    public void Setup()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/");
        homePage = new HomePage(driver);
        wait = new WebDriverWait(driver, 10);
        homePage.closePopUp();
    }

    @AfterEach
    public void Close()
    {
        driver.quit();
    }
}
