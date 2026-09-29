package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Locators3 {

    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //****** this is not posible in css its only can traverse from elements only xpaths ********
        //parent -> child & siblings -> siblings traverse
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
        // traverse back from child -> parent
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[1]")).getText());
    }
}
