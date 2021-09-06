package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonDemoPage {

    private WebDriver driver;
    private WebDriverWait wait;

    By FEMALE_BUTTON = By.xpath("//*[@id=\"easycont\"]//input[@value=\"Female\"][@name=\"optradio\"]");
    By GET_CHECKED_VALUE = By.id("buttoncheck");
    By VALUE_FIELD = By.xpath("//*[@id=\"easycont\"]//p[@class='radiobutton']");

    By FEMALE_BUTTON_GROUP = By.xpath("//*[@id=\"easycont\"]//input[@value=\"Female\"][@name=\"gender\"]");
    By AGE_BUTTON_GROUP = By.xpath("//*[@id=\"easycont\"]//input[@value='15 - 50']");
    By GET_CHECKED_VALUE_GROUP = By.xpath("//*[@id=\"easycont\"]//button[@onclick='getValues();']");
    By VALUE_FIELD_GROUP = By.xpath("//*[@id=\"easycont\"]//p[@class='groupradiobutton']");

    public RadioButtonDemoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFemaleButton(){
        driver.findElement(FEMALE_BUTTON).click();
    }

    public void clickGetCheckedValue(){
        driver.findElement(GET_CHECKED_VALUE).click();
    }

    public String getTextFromRadioButton(){
        return driver.findElement(VALUE_FIELD).getText();
    }

    public void clickFemaleButtonGroup(){
        driver.findElement(FEMALE_BUTTON_GROUP).click();
    }

    public void clickAgeButtonGroup(){
        driver.findElement(AGE_BUTTON_GROUP).click();
    }

    public void clickGetCheckedValueGroup(){
        driver.findElement(GET_CHECKED_VALUE_GROUP).click();
    }

    public String getTextFromRadioButtonGroup(){
        return driver.findElement(VALUE_FIELD_GROUP).getText();
    }

}
