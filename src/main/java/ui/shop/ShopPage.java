package ui.shop;

import org.openqa.selenium.By;

public class ShopPage {
    public static By selectDepartment = By.id("region");
    public static By selectCity = By.id("ciudad");
    public static By selectComuna = By.id("comuna");
    public static By btnContinueCheckout = By.cssSelector("button[class='fbra_button fbra_test_button fbra_formItem__field04']");
}
