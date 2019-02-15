package com.shail.core;

import org.openqa.selenium.WebDriver;

public class BasePage {

    private WebDriver webDriver;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    protected void openHome(String url) {
        this.webDriver.get(url);
    }


}
