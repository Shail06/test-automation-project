package com.shail.utility;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public interface WebDriverInterface {

    WebDriver getWebDriver(MutableCapabilities capabilities);

    MutableCapabilities getBrowserOptions();
}
