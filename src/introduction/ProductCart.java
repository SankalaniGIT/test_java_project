package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class ProductCart {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        String[] itemsNeeded={"Cucumber","Brocolli","Beetroot"};
        addItems(driver,itemsNeeded);
    }

    public static void addItems(WebDriver driver, String[] itemsNeeded){
        int k=0;
        List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < products.size(); i++) {
            //Brocolli - 1Kg
            String[] name=products.get(i).getText().split("-");
            String formattedName=name[0].trim();
            System.out.println("Matched : " + formattedName +"-----------------------------  "+i);
            //format it to get actual vegetable name
            //Convert array into array list for easy search
            //Check whether name you extracted is present in arrayList or not.

            List itemsNeededList = Arrays.asList(itemsNeeded);
            if (itemsNeededList.contains(formattedName)) {
                //click on add to cart
//                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); (dont rely on text when writing xpath)
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
