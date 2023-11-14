package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class SearchFlightModalPage {

    @FindBy(id = "flightTitle")
    public WebElement title;

    @FindBy(id = "onewaytripe")
    public WebElement oneWayFlightButton;
    @FindBy(id = "roundtripe")
    public WebElement twoWaysFlightButton;

    @FindBy(id = "txtFrom")
    public WebElement fromText;

    @FindBy(id = "txtTo")
    public WebElement toText;

    @FindBy(id = "fromcitycode")
    public WebElement fromSelectButton;

    @FindBy(id = "tocitycode")
    public WebElement toSelectButton;

    @FindBy(id = "deparDate")
    public WebElement dateSelectButton;

    @FindBy(id = "slctFlightClass")
    public WebElement classSelectButton;

    @FindBy(id = "numberofadultss")
    public WebElement travellersSelectButton;

    @FindBy(id = "search_flight")
    public WebElement searchButton;

    @FindBy(id = "a_decrease")
    public WebElement adultMinusButton;

    @FindBy(id = "c_decrease")
    public WebElement childMinusButton;

    @FindBy(id = "f_decrease")
    public WebElement infantMinusButton;

    @FindBy(id = "a_increase")
    public WebElement adultPlusButton;

    @FindBy(id = "c_increase")
    public WebElement childPlusButton;

    @FindBy(id = "f_increase")
    public WebElement infantPlusButton;

    @FindBy(id = "a_number")
    public WebElement adultNumber;

    @FindBy(id = "c_number")
    public WebElement childNumber;

    @FindBy(id = "f_number")
    public WebElement infantNumber;

    @FindBy(id = "done")
    public WebElement doneButton;

    public SearchFlightModalPage(AndroidDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void checkPageElements(){
        Assert.assertTrue(title.isDisplayed());
        Assert.assertTrue(oneWayFlightButton.isDisplayed());
        Assert.assertTrue(twoWaysFlightButton.isDisplayed());
        Assert.assertTrue(fromText.isDisplayed());
        Assert.assertTrue(toText.isDisplayed());
        Assert.assertTrue(fromSelectButton.isDisplayed());
        Assert.assertTrue(toSelectButton.isDisplayed());
        Assert.assertTrue(dateSelectButton.isDisplayed());
        Assert.assertTrue(classSelectButton.isDisplayed());
        Assert.assertTrue(travellersSelectButton.isDisplayed());
        Assert.assertTrue(searchButton.isDisplayed());
    }


}
