package com.seleniumeasy;

import org.junit.*;

import static com.seleniumeasy.PathPage.TITLE_DEMOPAGE;
import static com.seleniumeasy.PathPage.TITLE_HOMEPAGE;

public class WebPageTests {

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/home/me/IdeaProjects/chromedriver81-69");
    }

    @Test
    public void canGoToHomePage() {
        // goto homepage in PathPages which creates a new HomePage instance
        Pages.homePage().goTo();
        // using isAt from HomePage
        Assert.assertTrue(Pages.homePage().isAt());

    }

    @Test
    public void canGoToDemoWebsite() {
        //goto homepage in PathPages which creates a new PathPages instance
        Pages.pathPages().goTo();
        // Using PageFactory to get the reference to the DemoWebSitePage
        PathPage pathPage = Pages.pathPages().getPathPage("Demo-ref");
        // use overridden goTo in chosen page
        pathPage.goTo();
        // Tests
        // Using abstract method in the DemoWebsitePagePath to get the string for Tests
        // This is done via WebElement pageElement dressing it up with a @FindBy annotation
        //Assert.assertTrue(Boolean.parseBoolean(TITLE_DEMOPAGE));
        Assert.assertTrue(pathPage.isAtPathPage("Demo"));
    }

    @Test
    public void canGoToRadioButtonPage() {
        Pages.pathPages().goTo();
        PathPage pathPage = Pages.pathPages().getPathPage("Radio-ref");
        pathPage.goTo();
        Assert.assertTrue(pathPage.isAtPathPage("Selenium Easy - Best Demo website to practice Selenium Webdriver Online"));
        //Assert.assertTrue(pathPage.isAtPathPage("Selenium Easy Demo - Radio buttons demo for Automation"));
    }

    //@AfterClass
    //public static void cleanup() {
    //    Browser.close();
    //}


}
