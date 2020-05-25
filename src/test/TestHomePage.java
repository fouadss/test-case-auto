package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestHomePage {
    public static String chromedriver= "webdriver.chrome.driver";
    public static String chromedriverpath = "BrowserDriver\\windows\\chromedriver.exe";
   public static String fxdriver = "webdriver.gecko.driver";
   public static String fxdriverpath = "BrowserDriver\\windows\\geckodriver.exe";

   public static String url = "http://amazon.com/";
    //create object for chrome driver
  public static WebDriver driver = new ChromeDriver();
    // create object for firefox driver
    public static WebDriver ffdriver = new FirefoxDriver();

    public static void main(String[] args) throws InterruptedException {

          runFireFoxDriver(ffdriver,fxdriver,fxdriverpath,url);

          waitfor(6000);
          closebrowser(ffdriver);
        runChromeDriver(driver,chromedriver,chromedriverpath,url);
        waitfor(6000);
        closebrowser(driver);

    }

    public static void runChromeDriver(WebDriver driver,String chromedriver,String chromedriverpath,String url){
        // browser driver property
        System.setProperty(chromedriver,chromedriverpath);

        // navigate url
        driver.get(url);
        driver.manage().window().maximize();

    }

public static void runFireFoxDriver(WebDriver driver, String fxdriver,String fxdriverpath,String url){
        //browser driver property
    System.setProperty(fxdriver,fxdriverpath);
    ffdriver.manage().window().maximize();
    // navigate url
    driver.get(url);

}
public static void waitfor(int miliseconds) throws InterruptedException {
        Thread.sleep(miliseconds);
}
public static void closebrowser(WebDriver driver){
        ffdriver.close();
        driver.close();

}




}
