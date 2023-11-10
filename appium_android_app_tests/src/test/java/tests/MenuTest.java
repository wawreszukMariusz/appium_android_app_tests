package tests;

import org.testng.annotations.Test;
import pages.*;

public class MenuTest extends BaseTest {
    @Test
    public void goHomeTest(){
        HomePage homePage = new HomePage(driver);
        homePage.checkPageElements(driver);
        homePage.menuButton.click();
        MenuPage menuPage = new MenuPage(driver);
        menuPage.checkPageElements();
        menuPage.homeButton.click();
        homePage.checkPageElements(driver);
    }

    @Test
    public void goLoginAndRegisterTest(){
        HomePage homePage = new HomePage(driver);
        homePage.checkPageElements(driver);
        homePage.menuButton.click();

        MenuPage menuPage = new MenuPage(driver);
        menuPage.checkPageElements();
        menuPage.loginAndRegisterButton.click();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.checkPageElements();
    }

    @Test
    public void goBlogTest(){
        HomePage homePage = new HomePage(driver);
        homePage.checkPageElements(driver);
        homePage.menuButton.click();

        MenuPage menuPage = new MenuPage(driver);
        menuPage.checkPageElements();
        menuPage.blogButton.click();
        homePage.checkPageElements(driver);
    }

    @Test
    public void goContactUsTest(){
        HomePage homePage = new HomePage(driver);
        homePage.checkPageElements(driver);
        homePage.menuButton.click();

        MenuPage menuPage = new MenuPage(driver);
        menuPage.checkPageElements();
        menuPage.contactUsButton.click();

        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.checkPageElements();
    }

    @Test
    public void goOffersTest(){
        HomePage homePage = new HomePage(driver);
        homePage.checkPageElements(driver);
        homePage.menuButton.click();

        MenuPage menuPage = new MenuPage(driver);
        menuPage.checkPageElements();
        menuPage.offersButton.click();
        homePage.checkPageElements(driver);
    }

    @Test
    public void goSettingsTest(){
        HomePage homePage = new HomePage(driver);
        homePage.checkPageElements(driver);
        homePage.menuButton.click();

        MenuPage menuPage = new MenuPage(driver);
        menuPage.checkPageElements();
        menuPage.settingsButton.click();

        SettingsPage settingsPage = new SettingsPage(driver);
        settingsPage.checkPageElements();

    }

    @Test
    public void leaveMenuWithClickingBackgroundTest(){
        HomePage homePage = new HomePage(driver);
        homePage.checkPageElements(driver);
        homePage.menuButton.click();

        MenuPage menuPage = new MenuPage(driver);
        menuPage.checkPageElements();

        homePage.carsButton.click();

    }

}
