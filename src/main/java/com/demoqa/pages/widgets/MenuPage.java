package com.demoqa.pages.widgets;

import com.demoqa.pages.BasePage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuPage extends BasePage {

    public MenuPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//a[.='Main Item 2']")
    WebElement mainItem2;

    @FindBy(xpath = "//a[.='SUB SUB LIST »']")
    WebElement suSubList;

    @FindBy(xpath = "//a[.='Sub Sub Item 1']")
    WebElement suSubItem1;



            public MenuPage selectSubMenu(){
                pause(1000);
                moveWithJS(0,200);

                Actions actions = new Actions(driver);
                actions.moveToElement(mainItem2).perform();
                actions.moveToElement(suSubList).perform();
                return this;
            }

    public MenuPage verifySubMenu() {
        Assert.assertTrue(isElementDisplayed(suSubItem1));
                return this;
    }
}
