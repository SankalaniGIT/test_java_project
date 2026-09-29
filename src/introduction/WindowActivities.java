package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        driver.get("https://google.com/");//in here using get its driver wait all the componenet of this url fully loaded
        driver.navigate().to("https://rahulshettyacademy.com/");//in here its not wait until fully elements are loaded ( inbuilt wait machanism is not there)
        driver.navigate().back();
        driver.navigate().forward();
        driver.close();
    }
}
