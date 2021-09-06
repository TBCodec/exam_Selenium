package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeEach
    public void Setup()
    {
        //Driver initialization, use WebDriverManager with update maven configuration
    }

    @AfterEach
    public void Close()
    {
        //Driver dispose
    }
}
