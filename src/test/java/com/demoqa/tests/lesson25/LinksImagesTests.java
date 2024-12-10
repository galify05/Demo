package com.demoqa.tests.lesson25;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.elements.LinksImagesPage;
import com.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinksImagesTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getElements();
    }

    @Test
    public void checkAllLinksTest() {
        new SidePanel(driver).selectLinks().hideIframes();
        new LinksImagesPage(driver).checkAllLinks();
    }

    @Test
    public void checkBrokenlinks() {
        new SidePanel(driver).selecBrokenLinksImages().hideIframes();
        new LinksImagesPage(driver).checkBrokenLinks();
    }

    @Test
    public void checkBrokenImagesTest() {
        new SidePanel(driver).selecBrokenLinksImages();
        new LinksImagesPage(driver).checkBrokenImages();
    }
}
