package tasks.shop;

import actions.Click;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;

import ui.product.DetailProductUI;
import ui.product.SearchProductUI;

public class AddDetailCar {

    public static boolean isVisibleAddButton(WebDriver webDriver){
        return WaitUntilElement.isInVisibility(webDriver, DetailProductUI.btnAddBug);
    }
    public static boolean isVisibleProductSearch(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, SearchProductUI.resultListProductSearch);
    }



}
