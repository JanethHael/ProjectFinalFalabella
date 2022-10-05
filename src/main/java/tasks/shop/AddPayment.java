package tasks.shop;

import actions.Click;
import actions.Enter;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.shop.PaymentUI;

public class AddPayment {

    public static boolean isVisibleIsPaymentPage(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, PaymentUI.selGiftCard);
    }

    public static void entryTheData(WebDriver webDriver, String cardNumber, String password){
        Click.on(webDriver, PaymentUI.selGiftCard);
        Enter.text(webDriver,PaymentUI.inputGiftCardNumber,cardNumber);
        Enter.text(webDriver,PaymentUI.inputGiftCardSecurityCode,password);
        Click.on(webDriver,PaymentUI.btnGiftCard);
    }
}
