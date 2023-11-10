package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.util.Random;

public class Helper {

    public static WebElement scrollToElement(WebElement locator, AndroidDriver driver) {
        String selector = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector()." + locator + ".instance(0)";
        return driver.findElementByAndroidUIAutomator(selector);
    }

    public static String generateRandomEmail(){
        Random rand = new Random();
        int n = rand.nextInt(1000);

        String email = "TESTER"+n+"@TESTING.COM";
        return email;
    }

    public static void typeTextByKeyboard(String phrase, AndroidDriver driver) {
        char[] phraseToLetters = phrase.toCharArray();

        for (int i = 0; i < phrase.length(); i++) {
            switch (phraseToLetters[i]) {
                case 'A':
                    driver.pressKey(new KeyEvent(AndroidKey.A));
                    break;
                case 'B':
                    driver.pressKey(new KeyEvent(AndroidKey.B));
                    break;
                case 'C':
                    driver.pressKey(new KeyEvent(AndroidKey.C));
                    break;
                case 'D':
                    driver.pressKey(new KeyEvent(AndroidKey.D));
                    break;
                case 'E':
                    driver.pressKey(new KeyEvent(AndroidKey.E));
                    break;
                case 'F':
                    driver.pressKey(new KeyEvent(AndroidKey.F));
                    break;
                case 'G':
                    driver.pressKey(new KeyEvent(AndroidKey.G));
                    break;
                case 'H':
                    driver.pressKey(new KeyEvent(AndroidKey.H));
                    break;
                case 'I':
                    driver.pressKey(new KeyEvent(AndroidKey.I));
                    break;
                case 'J':
                    driver.pressKey(new KeyEvent(AndroidKey.J));
                    break;
                case 'K':
                    driver.pressKey(new KeyEvent(AndroidKey.K));
                    break;
                case 'L':
                    driver.pressKey(new KeyEvent(AndroidKey.L));
                    break;
                case 'M':
                    driver.pressKey(new KeyEvent(AndroidKey.M));
                    break;
                case 'N':
                    driver.pressKey(new KeyEvent(AndroidKey.N));
                    break;
                case 'O':
                    driver.pressKey(new KeyEvent(AndroidKey.O));
                    break;
                case 'P':
                    driver.pressKey(new KeyEvent(AndroidKey.P));
                    break;
                case 'R':
                    driver.pressKey(new KeyEvent(AndroidKey.R));
                    break;
                case 'S':
                    driver.pressKey(new KeyEvent(AndroidKey.S));
                    break;
                case 'T':
                    driver.pressKey(new KeyEvent(AndroidKey.T));
                    break;
                case 'W':
                    driver.pressKey(new KeyEvent(AndroidKey.W));
                    break;
                case 'X':
                    driver.pressKey(new KeyEvent(AndroidKey.X));
                    break;
                case 'Y':
                    driver.pressKey(new KeyEvent(AndroidKey.Y));
                    break;
                case 'Z':
                    driver.pressKey(new KeyEvent(AndroidKey.Z));
                    break;
                case '@':
                    driver.pressKey(new KeyEvent(AndroidKey.AT));
                    break;
                case '1':
                    driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
                    break;
                case '2':
                    driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2));
                    break;
                case '3':
                    driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3));
                    break;
                case '4':
                    driver.pressKey(new KeyEvent(AndroidKey.DIGIT_4));
                    break;
                case '5':
                    driver.pressKey(new KeyEvent(AndroidKey.DIGIT_5));
                    break;
                case '6':
                    driver.pressKey(new KeyEvent(AndroidKey.DIGIT_6));
                    break;
                case '7':
                    driver.pressKey(new KeyEvent(AndroidKey.DIGIT_7));
                    break;
                case '8':
                    driver.pressKey(new KeyEvent(AndroidKey.DIGIT_8));
                    break;
                case '9':
                    driver.pressKey(new KeyEvent(AndroidKey.DIGIT_9));
                    break;
                case '.':
                    driver.pressKey(new KeyEvent(AndroidKey.PERIOD));
                    break;
                default:
                    driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
                    break;
            }
        }
    }
}
