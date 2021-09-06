package tests;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.JQueryDualListBoxPage;

public class DualListBoxTest extends BaseTest{


    @Test
    public void TestAddSingleElement()
    {
        Integer expectedResult = 15;
        homePage.clickListBoxButton();
        JQueryDualListBoxPage jQueryDualListBoxPage = homePage.clickJQueryButton();
        jQueryDualListBoxPage.clickAddAllButton();
        Integer result = jQueryDualListBoxPage.getListDataNumberRight();
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void TestAddAllElementButton()
    {
        Integer expectedResult = 14;
        String name = "Isabella";
        homePage.clickListBoxButton();
        JQueryDualListBoxPage jQueryDualListBoxPage = homePage.clickJQueryButton();
        jQueryDualListBoxPage.clickSelectedName(name);
        jQueryDualListBoxPage.clickAddButton();
        Integer result = jQueryDualListBoxPage.getListDataNumberLeft();
        Assertions.assertEquals(expectedResult, result);
        Assertions.assertTrue(jQueryDualListBoxPage.isThereThisName(name));
    }

}
