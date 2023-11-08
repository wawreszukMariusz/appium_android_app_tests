package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SettingsPage {

    @FindBy(id = "backpress_Button")
    public WebElement backButton;

    @FindBy(id = "titleTxtSetting")
    public WebElement screenTitle;

    @FindBy(id = "Currencysetting")
    public WebElement currenciesButton;

    @FindBy(id = "selectnamecodesetting")
    public WebElement languagesButton;

    public SettingsPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void checkPageElements() {
        Assert.assertTrue(backButton.isDisplayed());
        Assert.assertTrue(screenTitle.isDisplayed());
        Assert.assertTrue(currenciesButton.isDisplayed());
        Assert.assertTrue(languagesButton.isDisplayed());
    }
}
