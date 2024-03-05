package tests;

import config.BaseTest;
import helpers.TopMenuItem;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SignupPage;


public class RegistrationTests extends BaseTest {
   @Test
    @Parameters("browser")
    public void RegistrationTest_001(@Optional("chrome") String browser) throws InterruptedException{
       MainPage mainPage = new MainPage(getDriver());
       SignupPage signupPage = mainPage.openSignupPage();

       signupPage
               .fillFirstNameField("Joe")
               .fillLastNameField("Looo")
               .fillEmailField("email@gmail.com")
               .fillPasswordField("G$122344rgrgr")
               .clickByCheckBox()
               .clickByYallaButton();

   }
}