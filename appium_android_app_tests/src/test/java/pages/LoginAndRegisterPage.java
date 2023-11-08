package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginAndRegisterPage {

    @FindBy(id = "input_email")
    public WebElement emailInput;

    @FindBy(id = "input_password")
    public WebElement passwordInput;

    @FindBy(id = "text_input_end_icon")
    public WebElement showPasswordButton;

    @FindBy(id = "forget_password")
    public WebElement resetPaswordButton;

    @FindBy(id = "btn_login")
    public WebElement loginButton;

    @FindBy(id = "link_signup")
    public WebElement signUpButton;

    public LoginAndRegisterPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void checkPageElements() {
        Assert.assertTrue(emailInput.isDisplayed());
        Assert.assertTrue(passwordInput.isDisplayed());
        Assert.assertTrue(showPasswordButton.isDisplayed());
        Assert.assertTrue(resetPaswordButton.isDisplayed());
        Assert.assertTrue(loginButton.isDisplayed());
        Assert.assertTrue(signUpButton.isDisplayed());
    }

}
