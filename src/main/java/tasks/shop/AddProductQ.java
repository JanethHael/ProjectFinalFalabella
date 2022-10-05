package tasks.shop;

import actions.Click;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.shop.ShopCarQ;

public class AddProductQ {

    public static void onClickQuantity(WebDriver webDriver){
        WaitUntilElement.isInVisibility(webDriver, ShopCarQ.btnQuantity);
        Click.on(webDriver, ShopCarQ.btnQuantity);
    }


}
