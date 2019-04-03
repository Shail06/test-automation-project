package stepdefs;

import com.shail.pages.GoogleHome;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

/**
 * This class contains Unit Tests and is executed by Maven Surefire plugin
 */
public class GoogleTests {

    private WebDriver webDriver;
    public GoogleTests(ServiceHooks hooks) throws Exception {
        webDriver = hooks.getWebDriver();
    }

    @Given("^I open the google website$")
    public void iOpenTheGoogleWebsite() throws Exception {
        GoogleHome googleHome = new GoogleHome(webDriver);
        googleHome.openGoogleHomePage();
    }

}
