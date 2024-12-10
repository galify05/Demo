package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.interactions.DroppablePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragDropTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getInteractions();
        new SidePanel(driver).selectDroppable().hideIframes();
    }

    @Test
    public void actionDirectMeTest() {
        new DroppablePage(driver).actionDragMe()
                .verifyDropped("Dropped!");
    }

    @Test
    public void dragAndRopbyTest() {
        new DroppablePage(driver).dragAndDropBy(20, 20)
                .verifyDropped("Dropped!");
    }
}
