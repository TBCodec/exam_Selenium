package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavascriptAlertPage {

    WebDriver driver;

    By PROMPT_BOX = By.xpath("//*[@id=\"easycont\"]//button[@onclick=\"myPromptFunction()\"]");
    By PROMPT_TEXT = By.id("prompt-demo");

    public JavascriptAlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickPromptBox(){
        driver.findElement(PROMPT_BOX).click();
    }

    public void alertSetInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public void alertClickToAccept(){
        driver.switchTo().alert().accept();
    }
    public void alertClickToCancel(){
        driver.switchTo().alert().dismiss();
    }

    public String getTextFromPrompt(){
        return driver.findElement(PROMPT_TEXT).getText();
    }

}
