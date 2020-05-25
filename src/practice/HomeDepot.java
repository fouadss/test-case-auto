package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class HomeDepot {
    // create driver object
    public static WebDriver driver = new ChromeDriver();
    public static String chromeDriver = "webdriver.chrome.driver";
    public static String chromeDriverPath = "BrowserDriver\\Windows\\chromedriver.exe";

    public static String url = "https://www.homedepot.com/";


    public static void main(String[] args) throws InterruptedException {

        //test case 1:
         // signInInvalidUser();

        //test case 2:
       // signInInvalidPassword();

       //test case 3:
        signin();


        //test case 4
        searchProduct();
        //test case 5:
        //searchInvalidProduct();

    }

    public static void signin() {
        // test case 3- sign in to home depot account
        // step one: ****Open Browser and Navigate to URL
        browseSetUp(chromeDriver, chromeDriverPath, url);
        // click on my account web element
        driver.findElement(By.cssSelector("#headerMyAccount > div.MyAccount__icon > div > div.HeaderIcon__primary > svg")).click();
        // step two: enter your credentials
             //valid user name:
        driver.findElement(By.cssSelector("#SPSOSignIn > a > span")).click();
        // step three: enter valid  email
        driver.findElement(By.cssSelector("#email")).sendKeys("ibrahimsidisaid@gmail.com");
        // valid passoword:
        driver.findElement(By.id("password-input-field")).sendKeys("java206java206");
        // click on sign in
        driver.findElement(By.cssSelector("#single-signin__body > div > div.col__12-12.col__8-12--xs.u--paddingNone-top.col__4-12--lg.col__4-12--md.col__6-12--sm > form > button > span")).click();




    }
  //test cast 1 sign in with invalid user name
  public static void signInInvalidUser() throws InterruptedException {
      // test case 1- sign in to home depot account
      // step one: ****Open Browser and Navigate to URL
      browseSetUp(chromeDriver, chromeDriverPath, url);
      // click on my account web element
      driver.findElement(By.cssSelector("#headerMyAccount > div.MyAccount__icon > div > div.HeaderIcon__primary > svg")).click();
      // step two: enter your credentials
      //valid user name:
      driver.findElement(By.cssSelector("#SPSOSignIn > a > span")).click();
      // step three: enter valid  email
      driver.findElement(By.cssSelector("#email")).sendKeys("fouadmsidisaid@gmail.com");
      // valid passoword:
      driver.findElement(By.id("password-input-field")).sendKeys("java206java206");
      // click on sign in
      driver.findElement(By.cssSelector("#single-signin__body > div > div.col__12-12.col__8-12--xs.u--paddingNone-top.col__4-12--lg.col__4-12--md.col__6-12--sm > form > button > span")).click();
     Thread.sleep(3000);
     driver.quit();



  }
  //test case 2: sign in with invalid password
  public static void signInInvalidPassword() throws InterruptedException {
      // test case 1- sign in to home depot account
      // step one: ****Open Browser and Navigate to URL
      browseSetUp(chromeDriver, chromeDriverPath, url);
      // click on my account web element
      driver.findElement(By.cssSelector("#headerMyAccount > div.MyAccount__icon > div > div.HeaderIcon__primary > svg")).click();
      // step two: enter your credentials
      //valid user name:
      driver.findElement(By.cssSelector("#SPSOSignIn > a > span")).click();
      // step three: enter valid  email
      driver.findElement(By.cssSelector("#email")).sendKeys("ibrahimsidisaid@gmail.com");
      // valid passoword:
      driver.findElement(By.id("password-input-field")).sendKeys("fouad12345@#");
      // click on sign in
      driver.findElement(By.cssSelector("#single-signin__body > div > div.col__12-12.col__8-12--xs.u--paddingNone-top.col__4-12--lg.col__4-12--md.col__6-12--sm > form > button > span")).click();
      Thread.sleep(3000);
      driver.quit();



  }


    public static void searchProduct() throws InterruptedException {
// 4- test case: search for in search box
//********************************** step 1 open browser and navigate to url***************************
        // Open Browser and Navigate to URL
        browseSetUp(chromeDriver, chromeDriverPath, url);
//****************************************<step 2- enter keyword in search box>**********************
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"headerSearch\"]")).sendKeys("paint roller");
       Thread.sleep(3000);
//*******************************************<step 3- click on the search button>**********************************
        driver.findElement(By.cssSelector(".SearchBox__buttonIcon")).click();
//*******************************************<step 4- select the item>**********************************
        driver.findElement(By.cssSelector("#products > div > div.js-pod.js-pod-0.plp-pod.plp-pod--default.pod-item--0 > div > div.plp-pod__info > div.pod-plp__description.js-podclick-analytics > a")).click();
        Thread.sleep(5000);
//*******************************************<step 5- click to add the item to the cart>**********************************
        driver.findElement(By.xpath("//*[@id=\"atc_pickItUp\"]/span")).click();
        Thread.sleep(6000);
        driver.close();


    }
    //test case five : search invalid item
    public static void searchInvalidProduct() throws InterruptedException {
// 4- test case: search for in search box
//********************************** step 1 open browser and navigate to url***************************
        // Open Browser and Navigate to URL
        browseSetUp(chromeDriver, chromeDriverPath, url);
//****************************************<step 2- enter keyword in search box>**********************
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"headerSearch\"]")).sendKeys("milk ");
        Thread.sleep(3000);
//*******************************************<step 3- click on the search button>**********************************
        driver.findElement(By.cssSelector(".SearchBox__buttonIcon")).click();
//*******************************************<step 4- select the item>**********************************
        driver.findElement(By.cssSelector("#products > div > div.js-pod.js-pod-0.plp-pod.plp-pod--default.pod-item--0 > div > div.plp-pod__info > div.pod-plp__description.js-podclick-analytics > a")).click();
        Thread.sleep(5000);
//*******************************************<step 5- click to add the item to the cart>**********************************
        driver.findElement(By.xpath("//*[@id=\"atc_pickItUp\"]/span")).click();
        Thread.sleep(6000);
        driver.close();


    }

    // create method to open browser and navigate to url
    public static void browseSetUp(String browserDriver, String driverPath, String url) {

       //  connect and open browser
        System.setProperty(browserDriver, driverPath);
        System.setProperty(browserDriver, driverPath);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url);
        driver.navigate().to(url);
    }

//    public static void waitingTime(int waitSeconds) throws InterruptedException {
//        Thread.sleep(waitSeconds);
//    }

//    public static void closeBrowser() {
//
//        driver.quit();
//    }

}