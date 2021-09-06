package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class JQueryDualListBoxPage {

    WebDriver driver;

    By ADD_BUTTON = By.xpath("//*[@id=\"pickList\"]//button[text()=\"Add\"]");
    By ADD_ALL_BUTTON = By.xpath("//*[@id=\"pickList\"]//button[text()=\"Add All\"]");
    By LIST_RESULT = By.xpath("//*[@id=\"pickList\"]//select[@class=\"form-control pickListSelect pickListResult\"]//option");
    By LIST_NAMES = By.xpath("//*[@id=\"pickList\"]//select[@class=\"form-control pickListSelect pickData\"]//option");

    public JQueryDualListBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddAllButton(){
        driver.findElement(ADD_ALL_BUTTON).click();
    }

    public List<WebElement> listElements(By by){
        List<WebElement> elements = driver.findElements(by);
        return elements;
    }

    public void clickSelectedName(String name){
        for (WebElement element : listElements(LIST_NAMES)){
            if (element.getText().equals(name)) element.click();
            }
    }


    public Integer getListDataNumberRight(){
        return listElements(LIST_RESULT).size();
    }

    public Integer getListDataNumberLeft(){
        return listElements(LIST_NAMES).size();
    }

    public Boolean isThereThisName(String name){
        String resultName = driver.findElement(LIST_RESULT).getText();
        return name.equals(resultName);
    }

    public void clickAddButton(){
        driver.findElement(ADD_BUTTON).click();
    }


}
