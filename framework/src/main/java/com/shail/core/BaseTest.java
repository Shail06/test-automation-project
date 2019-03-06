package com.shail.core;

import com.shail.utility.DriverSelector;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    private DriverSelector driverSelector;

    @BeforeSuite
    public void setup() {
        driverSelector = new DriverSelector();
    }

    @AfterSuite
    public void tearDown() {
        driverSelector.quitDriver();
    }

    protected WebDriver getWebDriver() throws Exception {
        return driverSelector.getWebDriver();
    }
}
