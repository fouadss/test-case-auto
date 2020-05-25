package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromePractice {


    public static String chromedriver= "webdriver.chrome.driver";
    public static String chromedriverpath = "BrowserDriver\\windows\\chromedriver.exe";
    //create object for chrome driver
    public static WebDriver driver = new ChromeDriver();


    public static void main(String[] args) throws InterruptedException {
        driver.navigate().to("http://www.amazon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("hand sanitizer");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[contains(text(),'Artnaturals Alcohol Based Hand Sanitizer Gel (12 Pack x 8 Fl Oz')]")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"quantity_6\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(4000);
        driver.close();
    }

}
