package com.shail.utility;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverSelector {

    private WebDriver webDriver;
    private DriverEnum selectedDriverType;
    private final DriverEnum DEFAULT_DRIVER = DriverEnum.GRIDFOX;


    /**
     * Gets the WebDriver with capabilities
     * The Failsafe plugin sets the System Property of Browser Driver executable
     *
     * @return Webdriver
     * @throws Exception
     */
    public WebDriver getWebDriver() throws Exception {
        if (null == webDriver) {
            determineDriverType();
            MutableCapabilities capabilities = selectedDriverType.getBrowserOptions();
            webDriver = selectedDriverType.getWebDriver(capabilities);
        }
        return webDriver;
    }


    public void quitDriver() {
        if (null != webDriver) {
            webDriver.quit();
        }
    }

    private void determineDriverType() {
        DriverEnum driverType = DEFAULT_DRIVER;

        selectedDriverType = driverType;
    }


}
