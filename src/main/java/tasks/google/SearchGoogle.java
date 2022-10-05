package tasks.google;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.google.GooglePage;

public class SearchGoogle {
    public static void entryTheData(WebDriver webDriver, String word){
        Enter.textWitEnter(webDriver, GooglePage.inputSearch, word);
        Click.on(webDriver, GooglePage.linkPageFalabella);
    }
}
