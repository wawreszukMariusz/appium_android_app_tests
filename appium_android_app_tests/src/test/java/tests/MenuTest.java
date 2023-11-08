package tests;

import io.appium.java_client.TouchAction;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MenuPage;

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

    }

    @Test
    public void goBlogTest(){

    }

    @Test
    public void goContactUsTest(){

    }

    @Test
    public void goOffersTest(){

    }

    @Test
    public void goSettingsTest(){

    }

    @Test
    public void leaveMenuWithButtonTest(){

    }

    @Test
    public void leaveMenuWithClickingBackgroundTest(){

    }

}
