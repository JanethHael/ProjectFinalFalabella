package page.product;

import base.BaseTest;
import org.testng.annotations.Test;
import tasks.google.SearchGoogle;
import tasks.shop.AddDetailCar;
import tasks.searchProduct.SearchProduct;

public class ProductTest extends BaseTest {
    @Test
    public void testAddProduct(){
        SearchGoogle.entryTheData(webDriver, "Falabella.co");
        SearchProduct.entryTheData(webDriver, "Monitor para PC HP 22f 22 Pulgadas Full HD IPS (2XN58AA)");
        AddDetailCar.isVisibleProductSearch(webDriver);
        SearchProduct.onClickProductPage(webDriver);
    }

}
