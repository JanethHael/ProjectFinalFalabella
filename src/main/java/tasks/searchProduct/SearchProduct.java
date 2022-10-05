package tasks.searchProduct;

import actions.Click;
import actions.Enter;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.product.SearchProductUI;

public class SearchProduct {

    public static void onClickProductPage(WebDriver webDriver) {
        WaitUntilElement.isInVisibility(webDriver, SearchProductUI.productSelect);
        Click.onClickElement(webDriver, SearchProductUI.productSelect,0);
    }
    public static void entryTheData(WebDriver webDriver, String word){
        Enter.textWitEnter(webDriver, SearchProductUI.inputSearchProduct, word);
    }
}
