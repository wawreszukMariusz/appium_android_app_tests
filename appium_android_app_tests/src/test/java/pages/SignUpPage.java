package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class SignUpPage {

    @FindBy(id = "first_name")
    public WebElement firstNameInput;

    @FindBy(id = "Last_name")
    public WebElement lastNameInput;

    @FindBy(id = "input_country")
    public WebElement countryInput;

    @FindBy(id = "input_phone")
    public WebElement phoneInput;

    @FindBy(id = "input_email")
    public WebElement emailInput;

    @FindBy(id = "input_password")
    public WebElement passwordInput;

    @FindBy(id = "btn_signup")
    public WebElement signUpButton;

    @FindBy(id = "link_login")
    public WebElement loginButton;

    @FindBy(id = "country_picker_search")
    public WebElement countryModalSearch;

    @FindBy(id = "row_icon")
    public List<WebElement> countryModalIconList;

    @FindBy(id = "row_title")
    public List<WebElement> countryModalTitleList;

    @FindBy(id = "parentPanel")
    public WebElement successSignUpModalBackground;

    @FindBy(id = "alertTitle")
    public WebElement successSignUpModalTitle;

    @FindBy(id = "message")
    public WebElement successSignUpModalMessage;

    @FindBy(id = "button1")
    public WebElement successSignUpModalOkButton;

    public SignUpPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void checkPageElements() {
        Assert.assertTrue(firstNameInput.isDisplayed());
        Assert.assertTrue(lastNameInput.isDisplayed());
        Assert.assertTrue(countryInput.isDisplayed());
        Assert.assertTrue(phoneInput.isDisplayed());
        Assert.assertTrue(emailInput.isDisplayed());
        Assert.assertTrue(passwordInput.isDisplayed());
        Assert.assertTrue(signUpButton.isDisplayed());
        Assert.assertTrue(loginButton.isDisplayed());
    }

    public void checkCountryModalElements(){
        Assert.assertTrue(countryModalSearch.isDisplayed());
        Assert.assertTrue(checkNumberOfIconsAndTitlesOfCountries());
    }

    public boolean checkNumberOfIconsAndTitlesOfCountries(){
        return ((countryModalIconList.size() == countryModalTitleList.size()) && (countryModalIconList.size()>0) && (countryModalTitleList.size()>0));
    }

    public void checkSuccessSignUpModalElements(){
        Assert.assertTrue(successSignUpModalBackground.isDisplayed());
        Assert.assertTrue(successSignUpModalTitle.isDisplayed());
        Assert.assertTrue(successSignUpModalMessage.isDisplayed());
        Assert.assertTrue(successSignUpModalOkButton.isDisplayed());
    }


}
