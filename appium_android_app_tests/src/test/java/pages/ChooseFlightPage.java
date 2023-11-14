package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class ChooseFlightPage {

    @FindBy(id = "llback")
    public WebElement backButton;

    @FindBy(id = "search_plate")
    public WebElement searchInput;

    @FindBy(id = "mainlayout")
    public List<WebElement> flightsList;

    @FindBy(id = "cityAirportCodefrom")
    public List<WebElement> cityIsoFromText;

    @FindBy(id = "cityAirportCodeto")
    public List<WebElement> cityIsoToText;

    public ChooseFlightPage(AndroidDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void checkFlightFromPageElements(){
        Assert.assertTrue(backButton.isDisplayed());
        Assert.assertTrue(searchInput.isDisplayed());
        //Assert.assertTrue(!flightsList.isEmpty());
        Assert.assertTrue(!cityIsoFromText.isEmpty());
        //Assert.assertEquals(flightsList.size(), cityIsoFromText.size());
    }

    public void checkFlightToPageElements(){
        Assert.assertTrue(backButton.isDisplayed());
        Assert.assertTrue(searchInput.isDisplayed());
        //Assert.assertTrue(!flightsList.isEmpty());
        Assert.assertTrue(!cityIsoToText.isEmpty());
        //Assert.assertEquals(flightsList.size(), cityIsoFromText.size());
    }

}
