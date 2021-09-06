package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class ProgressBarForDownloadPage {

    WebDriver driver;

    By DOWNLOAD_BUTTON = By.id("cricle-btn");
    By PERCENT_TEXT = By.xpath("//*[@id=\"circle\"]//div[@class=\"percenttext\"]");

    public ProgressBarForDownloadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDownloadButton(){
        driver.findElement(DOWNLOAD_BUTTON).click();
    }

    public String getPercent(){
        return driver.findElement(PERCENT_TEXT).getText();
    }

    public void waitDownloadWithDuration(Integer durationOfSeconds){
        FluentWait wait = new FluentWait(driver).pollingEvery(Duration.ofSeconds(durationOfSeconds)).ignoring(TimeoutException.class);
        wait.until(ExpectedConditions.textToBe(PERCENT_TEXT, "100%"));
    }

}
