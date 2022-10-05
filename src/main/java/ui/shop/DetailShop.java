package ui.shop;

import org.openqa.selenium.By;

public class DetailShop {
    public static By inputAddress = By.id("address");
    public static By inputDepart = By.id("departmentNumber");
    public static By btnUseAddress = By.cssSelector("button[class='fbra_button fbra_test_button fbra_formItem__useAddress']");
    public static By btnToPay = By.cssSelector("button[class='fbra_button fbra_checkoutComponentDeliveryActions__continueToSecurePaymentButton fbra_test_checkoutComponentDeliveryActions__continueToSecurePaymentButton']");
}
