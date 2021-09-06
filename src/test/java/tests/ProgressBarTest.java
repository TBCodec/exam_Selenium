package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import pages.ProgressBarForDownloadPage;

import java.time.Duration;

public class ProgressBarTest extends BaseTest{


    @Test
    public void TestProgressBarDownload()
    {
        Integer durationOfSeconds = 1;
        homePage.clickProgressBars();
        ProgressBarForDownloadPage progressBarForDownloadPage = homePage.clickBootstrap();
        progressBarForDownloadPage.clickDownloadButton();
        progressBarForDownloadPage.waitDownloadWithDuration(durationOfSeconds);
    }


}
