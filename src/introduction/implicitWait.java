package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class implicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //New version implisit wait ************
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); (Old way of implisit wait)

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        String[] itemsNeeded={"Cucumber","Brocolli","Beetroot"};
        Thread.sleep(3000);
        addItems(driver,itemsNeeded);
        driver.findElement(By.cssSelector("img[alt=Cart]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
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
