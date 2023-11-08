package tests;

import io.appium.java_client.TouchAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;
import pages.MainPage;

public class MainScreenTest extends BaseTest {

    @Test
    public void clickOnAllButtons(){
        TouchAction touchAction = new TouchAction(driver);

        MainPage mainPage = new MainPage(driver);
        mainPage.checkPageElements(driver, touchAction);

    }
}
