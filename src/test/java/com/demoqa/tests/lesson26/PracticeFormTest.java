package com.demoqa.tests.lesson26;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.forms.PracticeFormPage;
import com.demoqa.tests.TestBase;
import com.demoqa.utils.DataProviders;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPracticeForm().hideIframes();
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "addNewStudentWithCsv")
    public void createStudentAccount(String name, String lastName, String email, String phone){
        new PracticeFormPage(driver)
                .enterPersonalData(name, lastName, email, phone)
                .selectGender("Male")
                .enterDateOfBDay("16 Jan 2001")
                .addSubjects(new String[]{"Math", "Chemistry"})
                .selectHobby(new String[]{"Sports", "Music"})
                .uploadFile("E:/Java/Tools/1.jpg")
                .inputState("NCR")
                .inputCity("Delhi")
                .submit()
                .verifySeccessRegistration("Thanks for submitting the form")
                ;
    }

    @Test
    public void createStudentAccountWithSelectDate(){
        new PracticeFormPage(driver)
                .enterPersonalData("Boris", "Kanaval", "borchik@mail.ru", "0123456789")
                .selectGender("Male")
                .selectDate("January", "2001", "16")
                .addSubjects(new String[]{"Math", "Chemistry"})
                .selectHobby(new String[]{"Sports", "Music"})
                .uploadFile("E:/Java/Tools/1.jpg")
                .inputState("NCR")
                .inputCity("Delhi")
                .submit()
                .verifySeccessRegistration("Thanks for submitting the form")
        ;
    }
}