package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.JavascriptAlertPage;

public class AlertTest extends BaseTest{


    @Test
    public void TestSubmitValidInput()
    {
        String name = "Monica Belucci";
        String expectedResult = "You have entered 'Monica Belucci' !";
        JavascriptAlertPage javascriptAlertPage = homePage.clickJavascriptAlerts();
        javascriptAlertPage.clickPromptBox();
        javascriptAlertPage.alertSetInput(name);
        javascriptAlertPage.alertClickToAccept();
        String result = javascriptAlertPage.getTextFromPrompt();
        Assertions.assertEquals(expectedResult, result);

    }

    @Test
    public void TestInputCancel()
    {
        String name1 = "Monica Belucci";
        String name2 = "Kim Basinger";
        String expectedResult = "You have entered 'Monica Belucci' !";
        JavascriptAlertPage javascriptAlertPage = homePage.clickJavascriptAlerts();
        javascriptAlertPage.clickPromptBox();
        javascriptAlertPage.alertSetInput(name1);
        javascriptAlertPage.alertClickToAccept();
        String result = javascriptAlertPage.getTextFromPrompt();
        Assertions.assertEquals(expectedResult, result);
        javascriptAlertPage.clickPromptBox();
        javascriptAlertPage.alertSetInput(name2);
        javascriptAlertPage.alertClickToCancel();
        result = javascriptAlertPage.getTextFromPrompt();
        Assertions.assertEquals(expectedResult, result);
    }


}
