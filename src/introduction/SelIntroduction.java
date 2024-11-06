package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoking browser
		//Chrome - chromeDriver ->Methods -- close get
		//Firefox - FirefoxDriver ->Methods -- close get
		//Safari SafariDriver ->Methods -- close get
		
		//Webdriver ->is a interface methods with empty body -- close get
		//Webdriver methods + chromedriver class own methods can implement
		/// ChromeDriver driver = new ChromeDriver();
		/// driver.resetInputState();//only chrome driver class method
		
		//Chromedriver.exe -> Chrome browser selenium manager
		//step to invoke chrome driver 
		//in here selenium manager not working its in disable way because this is not need cos webdriver is downloaded to your loacal computer
		//// System.setProperty("webdriver.chrome.driver", "c:/path to downloaded chrome driver/Chromedriver.exe");
		
		//driver object has access to the methods of chrome driver which are defined in web driver interface
		//cant access the personal chrome driver classes now
		WebDriver driver = new ChromeDriver(); 
		
		//firefox Launch
		//gecodriver
		//// System.setProperty("webdriver.gecko.driver", "c:/path to downloaded Firefox driver/geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		
		//Microsft Edge
		//// System.setProperty("webdriver.edge.driver", "c:/path to downloaded edge driver/msedgedriver.exe");
		// WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.apple.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();//close all associate windows
		
		//test new onecc

	}

}
