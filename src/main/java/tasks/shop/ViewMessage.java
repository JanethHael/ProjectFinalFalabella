package tasks.shop;

import actions.Get;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.shop.MessageUI;

public class ViewMessage {

    public static boolean isVisibleIsDeliveryPage(WebDriver webDriver){
        return WaitUntilElement.isPresent(webDriver, MessageUI.message);
    }

    public static String getTextMessage(WebDriver webDriver){
        return Get.getText(webDriver, MessageUI.message);

    }


}
