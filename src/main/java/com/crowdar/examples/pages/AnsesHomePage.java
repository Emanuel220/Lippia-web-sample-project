package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.util.List;

public class AnsesHomePage extends PageBaseAnses {
    private static final String COMPLETE_BUSQUEDAD_ID = "edit-search-api-fulltext";
    private static final String ENTER_BUSQUEDA_XPATH ="//*[@id=\"edit-submit-buscador\"]/span";
    private static final String CLICK_CSS_SELECTOR ="#block-mainnavigation > ul > li > a";

    public AnsesHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }
    public void ir() {
        navigateToCompleteURL();
    }

    public void completarBuscarCriterio(String criterio) {
        completeField(By.id(COMPLETE_BUSQUEDAD_ID),criterio);
    }

    public void enterBuscarCriterio() {
        clickElement(By.xpath(ENTER_BUSQUEDA_XPATH));
        sleep(5000);
    }

    public void clickMenu(String valor) {

        List<WebElement>menu = driver.findElements(By.cssSelector(CLICK_CSS_SELECTOR));
        for(WebElement item: menu){
            if (item.getText().equals(valor)){
                item.click();
                break;
            }
        }
    }


}
