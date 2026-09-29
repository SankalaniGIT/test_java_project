package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Assignment2 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(5));


        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("Learning@830$3mK2");
        driver.findElement(By.xpath("//span[contains(text(),' User')]/following-sibling::span")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn"))).click();
        WebElement drpdown= driver.findElement(By.xpath("//select[@class='form-control']"));
        Select drp =new Select(drpdown);
        drp.selectByValue("consult");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        w.until(ExpectedConditions.urlToBe("https://rahulshettyacademy.com/angularpractice/shop"));
        List<WebElement> item=driver.findElements(By.xpath("//button[@class='btn btn-info']"));
        for (int i = 0; i < item.size(); i++) {
            item.get(i).click();
        }
        driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'ProtoCommerce Home')]")));

    }
}
