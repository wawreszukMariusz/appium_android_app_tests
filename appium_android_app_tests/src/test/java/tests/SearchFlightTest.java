package tests;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ChooseFlightPage;
import pages.FlightDatePage;
import pages.HomePage;
import pages.SearchFlightModalPage;

public class SearchFlightTest extends BaseTest{

    @Test
    public void searchOneWayFlight(){
        HomePage homePage = new HomePage(driver);
        homePage.checkPageElements(driver);
        homePage.flightsButton.click();

        SearchFlightModalPage searchFlightModalPage = new SearchFlightModalPage(driver);
        searchFlightModalPage.checkPageElements();

        searchFlightModalPage.fromSelectButton.click();

        ChooseFlightPage chooseFlightPage = new ChooseFlightPage(driver);
        chooseFlightPage.checkFlightFromPageElements();
        String cityIso = chooseFlightPage.cityIsoFromText.get(0).getText();
        chooseFlightPage.flightsList.get(0).click();
        Assert.assertEquals(searchFlightModalPage.fromSelectButton.getText(), cityIso);

        searchFlightModalPage.toSelectButton.click();
        chooseFlightPage.checkFlightToPageElements();
        cityIso = chooseFlightPage.cityIsoToText.get(0).getText();
        chooseFlightPage.flightsList.get(0).click();
        Assert.assertEquals(searchFlightModalPage.toSelectButton.getText(), cityIso);

        searchFlightModalPage.dateSelectButton.click();

        FlightDatePage flightDatePage = new FlightDatePage(driver);
        flightDatePage.chooseDate(5, driver);

        searchFlightModalPage.classSelectButton.click();

        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(120, 1456)).perform();

        searchFlightModalPage.travellersSelectButton.click();

        int numberOfAdult = Integer.parseInt(searchFlightModalPage.adultNumber.getText());
        int numberOfChild =  Integer.parseInt(searchFlightModalPage.childNumber.getText());
        int numberOfInfant =  Integer.parseInt(searchFlightModalPage.infantNumber.getText());

        searchFlightModalPage.adultPlusButton.click();
        Assert.assertEquals(numberOfAdult+1, Integer.parseInt(searchFlightModalPage.adultNumber.getText()));

        searchFlightModalPage.childPlusButton.click();
        Assert.assertEquals(numberOfChild+1, Integer.parseInt(searchFlightModalPage.childNumber.getText()));

        searchFlightModalPage.infantPlusButton.click();
        Assert.assertEquals(numberOfChild+1, Integer.parseInt(searchFlightModalPage.childNumber.getText()));

        searchFlightModalPage.doneButton.click();
        searchFlightModalPage.searchButton.click();
    }


}
