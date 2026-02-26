package seleniumMav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test; // Add this import
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
    
    @Test // Add this so Maven knows this is the test to run
    public void myFirstTest() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); 
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
        System.out.println("Title : " + driver.getTitle());
        driver.quit();
    }
}
