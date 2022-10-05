package tasks.shop;

import actions.Click;
import actions.Enter;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.shop.DetailShop;

public class AddDetailShop {

    public static boolean isVisibleIsDetailShop(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, DetailShop.inputAddress);
    }

    public static void withTheData(WebDriver webDriver, String address, String apartment){
        Enter.text(webDriver, DetailShop.inputAddress,address);
        Enter.text(webDriver,DetailShop.inputDepart,apartment);
        Click.on(webDriver,DetailShop.btnUseAddress);
        WaitUntilElement.isPresent(webDriver, DetailShop.btnToPay);
        Click.on(webDriver,DetailShop.btnToPay);
    }
}
