package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        String[] itemsNeeded={"Cucumber","Brocolli","Beetroot"};

    }
}
