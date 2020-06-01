package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

public class AnsesSearchResulPage extends PageBaseAnses{





    public AnsesSearchResulPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }


    public boolean verificarValor(String criterio) {
        List<WebElement> lista =driver.findElements(By.xpath("//div/section/div/div/div/div[2]/div/div/span/a"));

        boolean flag =false;

        for(WebElement item: lista){
            if(item.getAttribute("innerHTML").contains(criterio)){
                flag=true;
            }
        }
        return flag;
    }

    public boolean verificarMenu(String resultado) {
        boolean flag=false;
        WebElement element= driver.findElement(By.cssSelector("div.title > h1"));
        if (element.getText().contains(resultado)) {
            flag = true;
        }
        return flag;
    }


}

