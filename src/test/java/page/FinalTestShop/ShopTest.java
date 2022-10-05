package page.FinalTestShop;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.google.SearchGoogle;
import tasks.product.DetailProduct;
import tasks.searchProduct.SearchProduct;
import tasks.shop.*;

public class ShopTest extends BaseTest {

    String productName = "Televisor 32 LG";
    String message = "El número de tarjeta o código de seguridad que ingresaste no es válido. Por favor verifica los datos e intenta de nuevo.";

    @Test
    public void testShopProduct() {
        //Search Page
        SearchGoogle.entryTheData(webDriver, "Falabella.co");
        SearchProduct.entryTheData(webDriver, productName);
        //Product
        AddDetailCar.isVisibleProductSearch(webDriver);
        DetailProduct.onClickProduct(webDriver);
        DetailProduct.onClickCarShop(webDriver);
        AddProductQ.onClickQuantity(webDriver);
        AddWarrantyProduct.onClickWarrantyProduct(webDriver);
        ShopProduct.isVisibleButtonGoShop(webDriver);
        ShopProduct.onClickToShop(webDriver);
        AddShop.isVisibleIsDeliveryPage(webDriver);
        AddShop.withTheData(webDriver, "ATLANTICO", "BARANOA", "BARANOA");

        AddDetailShop.isVisibleIsDetailShop(webDriver);
        AddDetailShop.withTheData(webDriver,"Zona Periferica Avenida Siempre Viva Nro. 1012","1A");

        AddPayment.isVisibleIsPaymentPage(webDriver);
        AddPayment.entryTheData(webDriver,"9876543321","password123");
        ViewMessage.isVisibleIsDeliveryPage(webDriver);

        Assert.assertEquals(ViewMessage.getTextMessage(webDriver),message);

    }
}