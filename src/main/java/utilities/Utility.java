package utilities;

import java.util.Random;
import org.openqa.selenium.WebDriver;
import zilch.pages.BasePage;

public class Utility {

    public static WebDriver driver;

    public static void setUtilityDriver() {
        driver = BasePage.driver;
    }

    public static String getRandomString(int length) {
        /*
         * Get a random alphanumeric string - alternative, use UUID
         */
        String uppercaseAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";

        String alphaNumeric = uppercaseAlphabet + lowercaseAlphabet + numbers;

        StringBuilder stringBuilderRandString = new StringBuilder();

        Random random = new Random();

        for(int i = 0; i < length; i++) {

            int index = random.nextInt(alphaNumeric.length());
            char randomChar = alphaNumeric.charAt(index);
            stringBuilderRandString.append(randomChar);
        }

        return stringBuilderRandString.toString();
    }
}
