package ui.product;

import org.openqa.selenium.By;

public class SearchProductUI {

    static String product ="Televisor LG 32 pulgadas LED HD Smart TV";
    public static By resultListProductSearch = By.id("testId-searchResults-products");
    //public static By productSelect= By.id("(//b[contains(text(),\'Monitor para PC HP 22f 22 Pulgadas Full HD IPS\')]/ancestor::a)[1]");
    public static By productSelect = By.cssSelector("div[class='jsx-4001457643 search-results-4-grid grid-pod']");
    public static By inputSearchProduct = By.id("testId-SearchBar-Input");
    public static By informationProduct = By.id("productInfoContainer");

}
