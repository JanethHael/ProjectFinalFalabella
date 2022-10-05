package page.product;

import base.BaseTest;
import org.testng.annotations.Test;
import tasks.google.SearchGoogle;
import tasks.shop.AddDetailCar;
import tasks.searchProduct.SearchProduct;

public class ProductTest extends BaseTest {
    String productName = "Televisor 32 LG";
    @Test
    public void testAddProduct(){
        SearchGoogle.entryTheData(webDriver, "Falabella.co");
        SearchProduct.entryTheData(webDriver, productName);
        AddDetailCar.isVisibleProductSearch(webDriver);
        SearchProduct.onClickProductPage(webDriver);
    }

}
