package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ContactUsPage {

    @FindBy(id ="input_name")
    public WebElement nameInput;

    @FindBy(id ="input_email")
    public WebElement emailInput;

    @FindBy(id ="input_subject")
    public WebElement subjectInput;

    @FindBy(id ="input_message")
    public WebElement messageInput;

    @FindBy(id ="btn_signup")
    public WebElement contactButton;

    public ContactUsPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void checkPageElements() {
        Assert.assertTrue(nameInput.isDisplayed());
        Assert.assertTrue(emailInput.isDisplayed());
        Assert.assertTrue(subjectInput.isDisplayed());
        Assert.assertTrue(messageInput.isDisplayed());
        Assert.assertTrue(contactButton.isDisplayed());
    }
}
