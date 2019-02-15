package com.shail.tests;

import com.shail.core.BaseTest;
import com.shail.pages.GoogleHome;
import org.testng.annotations.Test;

public class testGoogleHome extends BaseTest {


    @Test
    public void testGoogleSearchCarrots() throws Exception {
        GoogleHome googleHome = new GoogleHome(getWebDriver());
        googleHome.openGoogleHomePage();
    }

}
