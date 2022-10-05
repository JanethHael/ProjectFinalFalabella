package page.searchCategory;

import base.BaseTest;
import org.testng.annotations.Test;
import tasks.google.SearchGoogle;
import tasks.searchProduct.SearchProduct;

public class SearchCategoryTest extends BaseTest {
    @Test
    public void testSearchCategorie(){
        SearchGoogle.entryTheData(webDriver, "Falabella.co");
        SearchProduct.entryTheData(webDriver, "Monitor para PC HP 22f 22 Pulgadas Full HD IPS (2XN58AA)");



    }

}
