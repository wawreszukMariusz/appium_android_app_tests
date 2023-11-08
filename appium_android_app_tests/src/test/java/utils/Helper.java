package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

public class Helper {

    public static WebElement scrollToElement(WebElement locator, AndroidDriver driver) {
        String selector = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector()." + locator +".instance(0)";
        return driver.findElementByAndroidUIAutomator(selector);
    }
}
