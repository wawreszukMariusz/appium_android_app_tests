package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDate;
import java.util.List;

public class FlightDatePage {

    @FindBy(xpath = "//android.widget.TextView")
    public List<WebElement> daysList;

    public FlightDatePage(AndroidDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void chooseDate(int daysFromToday, AndroidDriver driver){
        driver.findElement(By.xpath("//android.widget.TextView[@text='"+(returnCurrentDay()+daysFromToday)+"']")).click();
    }

    public int returnCurrentDay(){
        LocalDate currentDate = LocalDate.now();
        return currentDate.getDayOfMonth();
    }

}
