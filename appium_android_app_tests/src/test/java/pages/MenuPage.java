package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MenuPage {

    @FindBy(id = "design_navigation_view")
    public WebElement navigationLayout;
    @FindBy(id = "home")
    public WebElement homeButton;

    @FindBy(id = "loginreg")
    public WebElement loginAndRegisterButton;

    @FindBy(id = "blog")
    public WebElement blogButton;

    @FindBy(id = "contactus")
    public WebElement contactUsButton;

    @FindBy(id = "offers")
    public WebElement offersButton;

    @FindBy(id = "setting")
    public WebElement settingsButton;

    public MenuPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void checkPageElements() {
        Assert.assertTrue(navigationLayout.isDisplayed());
        Assert.assertTrue(homeButton.isDisplayed());
        Assert.assertTrue(loginAndRegisterButton.isDisplayed());
        Assert.assertTrue(blogButton.isDisplayed());
        Assert.assertTrue(contactUsButton.isDisplayed());
        Assert.assertTrue(offersButton.isDisplayed());
        Assert.assertTrue(settingsButton.isDisplayed());
    }
}
