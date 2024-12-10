package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.widgets.MenuPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MuneTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getWidgets();
        new SidePanel(driver).getMenu().hideAd();
    }

    @Test
    public void moveToMenuTest(){
        new MenuPage(driver).selectSubMenu()
                .verifySubMenu();
    }
}
