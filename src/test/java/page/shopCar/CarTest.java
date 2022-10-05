package page.shopCar;

import base.BaseTest;
import org.testng.annotations.Test;
import tasks.google.SearchGoogle;
import tasks.product.DetailProduct;
import tasks.shop.*;
import tasks.searchProduct.SearchProduct;

public class CarTest extends BaseTest {
    String productName="Televisor 32 LG";


    @Test
    public void testAddProduct(){

        SearchGoogle.entryTheData(webDriver, "Falabella.co");
        SearchProduct.entryTheData(webDriver, productName);
        AddDetailCar.isVisibleProductSearch(webDriver);
        SearchProduct.onClickProductPage(webDriver);
        DetailProduct.onClickProduct(webDriver);
        //AddDetailCar.onClickCarShop(webDriver);


    }



}
