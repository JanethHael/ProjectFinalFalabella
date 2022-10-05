package tasks.shop;

import actions.Click;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.shop.ShopPage;

public class AddShop {

    public static boolean isVisibleIsDeliveryPage(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, ShopPage.selectDepartment);
    }

    public static void withTheData(WebDriver webDriver, String department, String province, String district){
        Click.selByVisibleDat(webDriver,ShopPage.selectDepartment, department);
        WaitUntilElement.isPresent(webDriver, ShopPage.selectCity);
        Click.selByVisibleDat(webDriver,ShopPage.selectCity, province);
        WaitUntilElement.isPresent(webDriver, ShopPage.selectComuna);
        Click.selByVisibleDat(webDriver,ShopPage.selectComuna, district);
        Click.on(webDriver,ShopPage.btnContinueCheckout);
    }
}
