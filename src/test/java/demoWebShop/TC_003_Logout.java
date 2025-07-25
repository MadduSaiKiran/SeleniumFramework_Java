package demoWebShop;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;

public class TC_003_Logout extends BaseDriver {

    @Test
    public void LogoutTest() {
        driver.get("https://demowebshop.tricentis.com/");
        Assert.assertEquals("The website could not be accessed...", "https://demowebshop.tricentis.com/", driver.getCurrentUrl());

        Login();
        Logout();

        TearDown();
    }
}