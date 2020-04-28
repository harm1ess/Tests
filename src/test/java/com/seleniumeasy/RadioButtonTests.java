package com.seleniumeasy;

import org.junit.*;

public class RadioButtonTests {

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/home/me/IdeaProjects/chromedriver81-69");
    }

    @Test
    public void canGoToHomePage() {
        Pages.homePage().goTo();
        Assert.assertTrue(Pages.homePage().isAt());

    }

    @Test
    public void canGoToDemoWebsite() {
        Pages.pathPages().goTo();
        PathPage pathPage = Pages.pathPages().getPathPage("Demo");
        pathPage.goTo();
        Assert.assertTrue(pathPage.isAtPathPage("Demo"));
    }

    @AfterClass
    public static void cleanup() {
        Browser.close();
    }


}
