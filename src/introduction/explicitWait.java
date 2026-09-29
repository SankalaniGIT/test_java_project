package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class explicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        // Explicit wait is applied targeted elements not for entire code. so no performance issues.
//        WebDriverWait waitOld =new WebDriverWait(driver,5); old virsion wait
        WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(5)); //new version of explicit wait


        String[] itemsNeeded={"Cucumber","Brocolli","Beetroot"};
        Thread.sleep(3000);
        addItems(driver,itemsNeeded);
        driver.findElement(By.cssSelector("img[alt=Cart]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();

        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

    }

    public static void addItems(WebDriver driver, String[] itemsNeeded){
        int k=0;
        List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < products.size(); i++) {
            String[] name=products.get(i).getText().split("-");
            String formattedName=name[0].trim();
            System.out.println("Matched : " + formattedName +"-----------------------------  "+i);


            List itemsNeededList = Arrays.asList(itemsNeeded);
            if (itemsNeededList.contains(formattedName)) {
                driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
                System.out.println("Clicked product : " + driver.findElements(By.cssSelector("h4.product-name")).get(i).getText());
                System.out.println(itemsNeededList.get(k)+"=="+k);
                k++;
                if(k==itemsNeeded.length)
                    break;
            }
        }
    }
}
