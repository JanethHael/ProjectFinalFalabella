package tasks.shop;

import actions.Click;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.shop.WarrantyExtendedProduct;

public class AddWarrantyProduct {

    public static void onClickWarrantyProduct(WebDriver webDriver){
        WaitUntilElement.isInVisibility(webDriver, WarrantyExtendedProduct.btnShowCar);
        //Click.on(webDriver, WarrantyExtendedProduct.btnWarrantyOption);
        Click.on(webDriver, WarrantyExtendedProduct.btnShowCar);
    }
}
