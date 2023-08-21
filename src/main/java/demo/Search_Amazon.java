package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Search_Amazon {
    ChromeDriver driver;

    public Search_Amazon() {
        System.out.println("Constructor: Search Amazon");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void searchAmazon() {
        System.out.println("Start Test case: Search Amazon");
        // Navigate to address bar and enter google.com www.google.com
        driver.get("https://www.google.com/");
        // Locate the search box and enter amazon Using Locator "Name" name="q" |
        // sendkeys("amazon")
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("amazon");
        searchbox.sendKeys(Keys.RETURN);
        // Validate the text amazon.in is displayed Using Locator "XPath" text
        // validation | //h3[text()="Amazon.in"] | isDisplayed()
        boolean result = driver.findElement(By.xpath("//span[text()='Amazon.in' or text()='Amazon.com']")).isDisplayed();
        System.out.println("Is Amazon present in results? : " + result);
    }

    public void endTest() {
        System.out.println("End Test: Search Amazon");
        driver.close();
        driver.quit();
    }
}
