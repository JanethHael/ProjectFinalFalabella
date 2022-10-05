package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    protected WebDriver webDriver;
    private String url = "https://www.google.com/";
    private String browser = "chrome";

    @BeforeMethod
    public void setUp() throws Exception {
        switch (browser){
            case "chrome":
                System.setProperty("webdriver.chrome.driver","resource/chromedriver");
                webDriver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver","resource/geckodriver");
                webDriver = new FirefoxDriver();
                break;
            default:
                throw new Exception(browser + " no soportado");
        }
        webDriver.get(url);
       // webDriver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){
       //if(webDriver != null)
            //webDriver.quit();
    }
}
