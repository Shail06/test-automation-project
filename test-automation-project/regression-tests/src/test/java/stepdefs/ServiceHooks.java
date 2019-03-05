package stepdefs;

import com.shail.utility.DriverSelector;
import common.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class ServiceHooks {

    private DriverSelector driverSelector;


    @Before
    public void setup() {
        driverSelector = new DriverSelector();
    }

    protected WebDriver getWebDriver() throws Exception {
        return driverSelector.getWebDriver();
    }

    @After
    public void tearDown() {
        driverSelector.quitDriver();
    }
}
