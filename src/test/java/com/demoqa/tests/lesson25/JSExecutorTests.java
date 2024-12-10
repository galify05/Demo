package com.demoqa.tests.lesson25;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.elements.TextBoxPage;
import com.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JSExecutorTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getElements();
        new SidePanel(driver).selectTextBox().hideIframes();
    }

    @Test
    public void jsExecutorTest() {
        new TextBoxPage(driver).enterDataWithJs("Robert Pupkov", "robopup@gmail.com")
                .clickOnSubmitWithJS()
                .refreshWithJS()
                .getInnerTextWithJS()
                .verifyUrlWithJS()
                .navigateToNewPageWithJS()
                .verifyTitleOfPageWithJs()
                .generateAlertWithJS();
    }
}
