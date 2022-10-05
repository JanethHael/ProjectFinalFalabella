package tasks.product;

import actions.Click;
import actions.IsDisplayed;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.product.DetailProductUI;
import ui.product.SearchProductUI;

public class DetailProduct {

    public static boolean isVisibleProductInformation(WebDriver webDriver){
        return IsDisplayed.element(webDriver, SearchProductUI.informationProduct);
    }

    public static void onClickProduct(WebDriver webDriver){
        Click.onClickElement(webDriver, SearchProductUI.productSelect,0);
    }

    public static void onClickCarShop(WebDriver webDriver){
        WaitUntilElement.isPresent(webDriver, DetailProductUI.btnAddBug);
        Click.on(webDriver, DetailProductUI.btnAddBug);
    }

    public static void onClickProductPage(WebDriver webDriver) {
        WaitUntilElement.isInVisibility(webDriver,SearchProductUI.productSelect);
        Click.onClickElement(webDriver, SearchProductUI.productSelect,0);
    }


}
