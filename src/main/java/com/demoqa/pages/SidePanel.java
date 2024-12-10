package com.demoqa.pages;

import com.demoqa.pages.alertsFrameWindows.AlertsPage;
import com.demoqa.pages.alertsFrameWindows.BrowserWindows;
import com.demoqa.pages.alertsFrameWindows.FramePage;
import com.demoqa.pages.elements.LinksImagesPage;
import com.demoqa.pages.elements.TextBoxPage;
import com.demoqa.pages.forms.PracticeFormPage;
import com.demoqa.pages.interactions.DroppablePage;
import com.demoqa.pages.bookStore.LoginPage;
import com.demoqa.pages.widgets.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePage {


    @FindBy(xpath = "//span[.='Auto Complete']")
    WebElement autoComplete;

    public AutoCompletePage selectAutoComplete(){
        click(autoComplete);
        return new AutoCompletePage(driver);
    }




    @FindBy(xpath = "//span[.='Buttons']")
    WebElement buttons;

    public BasePage selectButtons() {
        click(buttons);
        return new BasePage(driver);
    }

    public SidePanel(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[.='Login']")
    WebElement login;

    public LoginPage selectLogin() {
        clickWithJS(login, 0, 800);
        return new LoginPage(driver);
    }

    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alerts;

    public AlertsPage selectAlerts() {
//clickWithJS(alerts,0,300);
        click(alerts);
        return new AlertsPage(driver);
    }

    @FindBy(xpath = "//span[.='Frames']")
    WebElement frames;

    public SidePanel selectFrame() {
        // clickWithJS(frames, 0, 300);
        click(frames);
        return new SidePanel(driver);
    }

    @FindBy(xpath = "//span[.='Nested Frames']")
    WebElement nestedFrames;

    public FramePage selectNestedFrames() {
        click(nestedFrames);
        // clickWithJS(nestedFrames,0,300);
        return new FramePage(driver);
    }

    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement browserWindows;

    public BrowserWindows selectBrowserWindows() {
        click(browserWindows);
//clickWithJS(browserWindows,0,300);
        return new BrowserWindows(driver);
    }

    @FindBy(xpath = "//span[.='Select Menu']")
    WebElement selectMenu;

    public SelectMenuPage getSelectMenu() {
//click(selectMenu); // не работает, слишком низко элкмкет
        clickWithJS(selectMenu, 0, 500);
        return new SelectMenuPage(driver);
    }

    @FindBy(xpath = "//span[.='Menu']")
    WebElement menu;

    public MenuPage getMenu() {
        clickWithJS(menu, 0, 600);
        return new MenuPage(driver);
    }


    @FindBy(xpath = "//span[.='Slider']")
    WebElement slider;

    public SliderPage selectSlider() {
        click(slider);
        return new SliderPage(driver);
    }


    @FindBy(xpath = "//span[.='Droppable']")
    WebElement droppable;

    public DroppablePage selectDroppable() {
        click(droppable);
        return new DroppablePage(driver);
    }

    @FindBy(xpath = "//span[.='Tool Tips']")
    WebElement toolTips;

    public ToolTipsPage selectToolTips() {
        clickWithJS(toolTips, 0, 200);
        return new ToolTipsPage(driver);
    }

    @FindBy(xpath = "//span[.='Text Box']")
    WebElement textBox;

    public TextBoxPage selectTextBox() {
        click(textBox);
        return new TextBoxPage(driver);
    }


    @FindBy(xpath = "//span[.='Links']")
    WebElement links;

    public SidePanel selectLinks() {
        click(links);
        return new SidePanel(driver);
    }


    @FindBy(xpath = "//span[.='Broken Links - Images']")
    WebElement broken;

    public LinksImagesPage selecBrokenLinksImages() {
        click(broken);
        return new LinksImagesPage(driver);
    }


    @FindBy(xpath = "//span[.='Practice Form']")
    WebElement practiceForm;
    public PracticeFormPage selectPracticeForm() {
    click(practiceForm);
        return new PracticeFormPage(driver);
    }
}
