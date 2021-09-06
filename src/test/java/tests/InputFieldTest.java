package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.SimpleFormDemoPage;

public class InputFieldTest extends BaseTest{


    @Test
    public void TestSumTwoNumbers()
    {
        String numberA = "5";
        String numberB = "6";
        String expected = "11";
        homePage.clickInputFormsButton();
        SimpleFormDemoPage simpleFormDemoPage = homePage.clickSimpleFormButton();
        simpleFormDemoPage.typeABField(numberA, numberB);
        simpleFormDemoPage.clickGetTotalButton();
        String result = simpleFormDemoPage.getTotal();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void TestSumTwoInvalidInputs()
    {
        String numberA = "abc";
        String numberB = "def";
        String expected = "NaN";
        homePage.clickInputFormsButton();
        SimpleFormDemoPage simpleFormDemoPage = homePage.clickSimpleFormButton();
        simpleFormDemoPage.typeABField(numberA, numberB);
        simpleFormDemoPage.clickGetTotalButton();
        String result = simpleFormDemoPage.getTotal();
        Assertions.assertEquals(expected, result);
    }
}
