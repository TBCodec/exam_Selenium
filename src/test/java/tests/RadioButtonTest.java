package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.RadioButtonDemoPage;

public class RadioButtonTest extends BaseTest{


    @Test
    public void TestSingleCheckedButton()
    {
        String expectedResult = "Radio button 'Female' is checked";
        homePage.clickInputFormsButton();
        RadioButtonDemoPage radioButtonDemoPage = homePage.clickRadioButtons();
        radioButtonDemoPage.clickFemaleButton();
        radioButtonDemoPage.clickGetCheckedValue();
        String result = radioButtonDemoPage.getTextFromRadioButton();
        Assertions.assertEquals(expectedResult, result);
    }


    @Test
    public void TestMultipleCheckedButton()
    {
        String expectedResult = "Sex : Female\n" +
                "Age group: 15 - 50";
        homePage.clickInputFormsButton();
        RadioButtonDemoPage radioButtonDemoPage = homePage.clickRadioButtons();
        radioButtonDemoPage.clickFemaleButtonGroup();
        radioButtonDemoPage.clickAgeButtonGroup();
        radioButtonDemoPage.clickGetCheckedValueGroup();
        String result = radioButtonDemoPage.getTextFromRadioButtonGroup();
        Assertions.assertEquals(expectedResult, result);
    }
}
