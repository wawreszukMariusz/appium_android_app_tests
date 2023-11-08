package pages;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Helper;

import java.time.Duration;
import java.util.List;


public class MainPage {

    @FindBy (id = "sidedrawer")
    public WebElement menuButton;

    @FindBy (id = "titletexthome")
    public WebElement welcomeHeader;

    @FindBy (id = "subtitletexthome")
    public WebElement welcomeSubheader;

    @FindBy (xpath = "(//android.widget.FrameLayout[@resource-id='com.phptravelsnative:id/cardvi'])[1]")
    public WebElement flightsButton;

    @FindBy (xpath = "(//android.widget.FrameLayout[@resource-id='com.phptravelsnative:id/cardvi'])[2]")
    public WebElement hotelsButton;

    @FindBy (xpath = "(//android.widget.FrameLayout[@resource-id='com.phptravelsnative:id/cardvi'])[3]")
    public WebElement toursButton;

    @FindBy (xpath = "(//android.widget.FrameLayout[@resource-id='com.phptravelsnative:id/cardvi'])[4]")
    public WebElement carsButton;

    @FindBy (id = "txtFeaturedHotel")
    public WebElement hotelsListHeader;

    @FindBy (xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.phptravelsnative:id/recyclerViewFeaturedHotels']/android.widget.LinearLayout")
    public List<WebElement> featuredHotelList;

    @FindBy (id = "txtfeaturedFlight")
    public WebElement flightsListHeader;

    @FindBy (xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.phptravelsnative:id/recyclerViewFeaturedFlights']/android.widget.LinearLayout")
    public List<WebElement> featuredFlightList;

    @FindBy (id = "txtFeaturedTour")
    public WebElement toursListHeader;

    @FindBy (xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.phptravelsnative:id/recyclerViewFeaturedTours']/android.widget.LinearLayout")
    public List<WebElement> featuredTourList;

    @FindBy (id = "txtFeaturedCar")
    public WebElement carsListHeader;

    @FindBy (xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.phptravelsnative:id/recyclerViewFeaturedCars']/android.widget.LinearLayout")
    public List<WebElement> featuredCarList;
    public MainPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void checkPageElements(AndroidDriver driver, TouchAction touchAction){

        Assert.assertTrue(menuButton.isDisplayed());
        Assert.assertTrue(welcomeHeader.isDisplayed());
        Assert.assertTrue(welcomeSubheader.isDisplayed());
        Assert.assertTrue(flightsButton.isDisplayed());
        Assert.assertTrue(hotelsButton.isDisplayed());
        Assert.assertTrue(toursButton.isDisplayed());
        Assert.assertTrue(carsButton.isDisplayed());
        Assert.assertTrue(hotelsListHeader.isDisplayed());
        Assert.assertTrue(!featuredHotelList.isEmpty());
        System.out.println(featuredHotelList.size());
        Assert.assertTrue(flightsListHeader.isDisplayed());
        //Assert.assertEquals(driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\""+"Lahore"+"\").instance(0))").getText(), "Lahore");
        swipeVertical(200,1000, touchAction);
        //Assert.assertTrue(!featuredFlightList.isEmpty());
        Assert.assertEquals(driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\""+"Featured Tours"+"\").instance(0))").getText(), "Featured Tours");
        Assert.assertTrue(!featuredTourList.isEmpty());
        Assert.assertTrue(carsListHeader.isDisplayed());
        Assert.assertTrue(!featuredCarList.isEmpty());
        Assert.assertEquals(driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\""+"Your Trip Starts Here!"+"\").instance(0))").getText(), "Your Trip Starts Here!");
    }

    public void swipeVertical(int start, int end, TouchAction touchAction) {
        touchAction.press(PointOption.point(200,200)).moveTo(PointOption.point(start,end)).release().perform();
    }



}
