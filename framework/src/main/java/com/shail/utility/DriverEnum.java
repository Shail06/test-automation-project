package com.shail.utility;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


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

    },

    GRIDFOX{
        public RemoteWebDriver getWebDriver(MutableCapabilities capabilities) {
            try {
                //ChromeOptions options = (ChromeOptions) capabilities;
                //
                //capabilities = DesiredCapabilities.chrome();
                //((DesiredCapabilities) capabilities).setPlatform(Platform.LINUX);
                //capabilities.setCapability(ChromeOptions.CAPABILITY, options);
                return new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            return null;
        }

        public MutableCapabilities getBrowserOptions() {
            ChromeOptions options = new ChromeOptions();
            FirefoxOptions options1 = new FirefoxOptions();
            return options;
        }
    };
}
