package com.shail.pages;

import com.shail.core.BasePage;
import org.openqa.selenium.WebDriver;

public class GoogleHome extends BasePage {

    private final String GOOGLE_URL = "https://www.google.com";

    public GoogleHome(WebDriver webDriver) {
        super(webDriver);
    }

    public void openGoogleHomePage() {
        openHome(GOOGLE_URL);
    }
}
