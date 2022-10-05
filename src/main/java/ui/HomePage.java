package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    private By nameSearchInput = By.id("testId-SearchBar-Input");
    private By searchBtn = By.xpath("//*[@id=\"testId-search-wrapper\"]/div/button");

    private By productSelectCar= By.xpath("//*[@id=\"testId-Pod-action-30074792\"]/div/div");

    private By selectElement = By.xpath("(//b[contains(text(),\'Consola Sony PS5 con Disco 825GB\')]/ancestor::a)[1]");

    String producto = "Consola Sony PS5 con Disco 825GB";

    public HomePage(WebDriver webDriver){
        super(webDriver);
    }

    public void typeDatoSearch(String nameSearch){
        WebElement element = webDriver.findElement(nameSearchInput);
        element.sendKeys(nameSearch);
    }

    public HomePage clickOnSearchButton(){
        WebElement element = webDriver.findElement(searchBtn);
        element.click();
        return new HomePage(webDriver);
    }

    public HomePage clickOnButton(String nameSearch){
        typeDatoSearch(nameSearch);
        return clickOnSearchButton();
    }

    public HomePage clickFirstProduct(){
        WebElement elementCar = webDriver.findElement(selectElement);
        elementCar.click();
        return new HomePage(webDriver);
    }

}
