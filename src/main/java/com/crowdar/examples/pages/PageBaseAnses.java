package com.crowdar.examples.pages;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.pageObjects.PageBaseWeb;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PageBaseAnses extends PageBaseWeb {
    public  PageBaseAnses(RemoteWebDriver driver){
        super(driver);
        BASE_URL = PropertyManager.getProperty("base.url");
    }
}
