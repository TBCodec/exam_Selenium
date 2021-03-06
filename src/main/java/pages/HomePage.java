package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    By POP_UP_CLOSE_BUTTON = By.xpath("//*[@id=\"at-cv-lightbox-close\"]");
    By INPUT_FORMS_BUTTON = By.xpath("//li[@class='tree-branch']//a[@href='#'][text()='Input Forms']");
    By ALERTS_BUTTON = By.xpath("//li[@class='tree-branch']//a[@href='#'][text()='Alerts & Modals']");
    By SIMPLE_FORM_BUTTON = By.xpath("//li[@class='tree-branch']//a[text()='Simple Form Demo']");
    By RADIO_BUTTONS = By.xpath("//li[@class='tree-branch']//a[@href='./basic-radiobutton-demo.html']");
    By JAVASCRIPT_ALERTS_BUTTONS = By.xpath("//li[@class='tree-branch']//a[@href='./javascript-alert-box-demo.html']");
    By LIST_BOX_BUTTON = By.xpath("//li[@class='tree-branch']//a[text()='List Box']");
    By JQUERY_LIST_BUTTONS = By.xpath("//li[@class='tree-branch']//a[@href='./jquery-dual-list-box-demo.html']");
    By PROGRESS_BAR_BUTTON = By.xpath("//li[@class='tree-branch']//a[text()='Progress Bars & Sliders']");
    By BOOTSTRAP_BUTTONS = By.xpath("//li[@class='tree-branch']//a[@href='./bootstrap-download-progress-demo.html']");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public SimpleFormDemoPage clickSimpleFormButton(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SIMPLE_FORM_BUTTON));
        driver.findElement(SIMPLE_FORM_BUTTON).click();
        return new SimpleFormDemoPage(driver);
    }

    public RadioButtonDemoPage clickRadioButtons(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(RADIO_BUTTONS));
        driver.findElement(RADIO_BUTTONS).click();
        return new RadioButtonDemoPage(driver);
    }


    public void clickInputFormsButton(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(INPUT_FORMS_BUTTON));
        driver.findElement(INPUT_FORMS_BUTTON).click();

    }

    public JavascriptAlertPage clickJavascriptAlerts(){
        driver.findElement(ALERTS_BUTTON).click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(JAVASCRIPT_ALERTS_BUTTONS));
        driver.findElement(JAVASCRIPT_ALERTS_BUTTONS).click();
        return new JavascriptAlertPage(driver);
    }

    public void clickListBoxButton(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(LIST_BOX_BUTTON));
        driver.findElement(LIST_BOX_BUTTON).click();
    }

    public JQueryDualListBoxPage clickJQueryButton(){
        driver.findElement(JQUERY_LIST_BUTTONS).click();
        return new JQueryDualListBoxPage(driver);
    }

    public void clickProgressBars(){
        driver.findElement(PROGRESS_BAR_BUTTON).click();
    }

    public ProgressBarForDownloadPage clickBootstrap(){
        driver.findElement(BOOTSTRAP_BUTTONS).click();
        return new ProgressBarForDownloadPage(driver);
    }

    public void closePopUp(){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(POP_UP_CLOSE_BUTTON));
        driver.findElement(POP_UP_CLOSE_BUTTON).click();
    }



}
