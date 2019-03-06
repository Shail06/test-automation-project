package com.shail.utility;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public enum DriverEnum implements WebDriverInterface {

    CHROME {
        public WebDriver getWebDriver(MutableCapabilities capabilities) {
            ChromeOptions options = (ChromeOptions) capabilities;
            return new ChromeDriver(options);
        }

        @Deprecated
        public DesiredCapabilities getDesiredCapabilities(Proxy proxySettings) {
            ChromeOptions options = new ChromeOptions();
            DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
            desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
            return desiredCapabilities;
        }

        public MutableCapabilities getBrowserOptions() {
            ChromeOptions options = new ChromeOptions();
            return options;
        }
    },


    FIREFOX {
        public WebDriver getWebDriver(MutableCapabilities capabilities) {
            FirefoxOptions options = (FirefoxOptions) capabilities;
            return new FirefoxDriver(options);
        }

        @Deprecated
        public DesiredCapabilities getDesiredCapabilities() {
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            return capabilities;
        }

        public MutableCapabilities getBrowserOptions() {
            FirefoxOptions options = new FirefoxOptions();
            return options;
        }

    };
}
