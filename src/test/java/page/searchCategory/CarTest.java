package page.searchCategory;

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
        DetailProduct.onClickProductPage(webDriver);
        DetailProduct.onClickCarShop(webDriver);
        //ShopCar.onClickQuantity(webDriver);
        AddWarrantyProduct.onClickWarrantyProduct(webDriver);


    }



}
