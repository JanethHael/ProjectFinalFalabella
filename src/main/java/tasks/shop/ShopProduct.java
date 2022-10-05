package tasks.shop;

import actions.Click;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.shop.BasketProduct;

public class ShopProduct {

    public static boolean isVisibleButtonGoShop(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, BasketProduct.btnToShop);
    }

    public static void onClickToShop(WebDriver webDriver){
        Click.on(webDriver, BasketProduct.btnToShop);
    }


}
