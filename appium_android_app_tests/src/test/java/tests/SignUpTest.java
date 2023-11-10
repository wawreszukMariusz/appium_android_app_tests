package tests;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MenuPage;
import pages.SignUpPage;
import utils.Helper;

public class SignUpTest extends BaseTest {

    @Test
    public void properSignUpTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        //homePage.checkPageElements(driver);
        homePage.menuButton.click();

        MenuPage menuPage = new MenuPage(driver);
        menuPage.checkPageElements();
        menuPage.loginAndRegisterButton.click();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.signUpButton.click();

        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.checkPageElements();

        signUpPage.firstNameInput.click();
        Helper.typeTextByKeyboard("MARK", driver);

        signUpPage.lastNameInput.click();
        Helper.typeTextByKeyboard("TESTER", driver);

        signUpPage.countryInput.click();
        signUpPage.checkCountryModalElements();
        signUpPage.countryModalSearch.click();
        Helper.typeTextByKeyboard("POLAND", driver);
        signUpPage.countryModalIconList.get(0).click();

        signUpPage.phoneInput.click();
        Helper.typeTextByKeyboard("123123123", driver);

        signUpPage.emailInput.click();
        String email = Helper.generateRandomEmail();
        Helper.typeTextByKeyboard(email, driver);

        signUpPage.passwordInput.click();
        String password = "PASS123@";
        Helper.typeTextByKeyboard(password, driver);

        signUpPage.signUpButton.click();

    }



}
