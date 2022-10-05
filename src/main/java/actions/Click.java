package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Click {

    public static void on(WebDriver webDriver, By locator){
        webDriver.findElement(locator).click();
    }

    public static void onClickElement(WebDriver webDriver, By locator,int element){
        webDriver.findElements(locator).get(element).click();
    }

    public static void selByVisibleDat(WebDriver webDriver, By locator, String inDato){
        Select select = new Select(webDriver.findElement(locator));
        select.selectByVisibleText(inDato);
    }

}
