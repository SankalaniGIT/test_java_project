package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        driver.findElement(By.name("name")).sendKeys("Name Madu");
        driver.findElement(By.name("email")).sendKeys("maa@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234567489");
        driver.findElement(By.id("exampleCheck1")).click();

//        driver.findElement(By.id("exampleFormControlSelect1")).click();
//        driver.findElement(By.xpath("//select/option[text()='Female']")).click();
        WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select abc = new Select(dropdown);
        abc.selectByVisibleText("Female");

        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.name("bday")).sendKeys("02/02/1992");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//div/strong")).getText(),"Success!");
    }
}
