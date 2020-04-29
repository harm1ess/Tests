package com.seleniumeasy;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ButtonsTests {
    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/home/me/IdeaProjects/chromedriver81-69");
    }

    @AfterClass
    public static void cleanup() {
        Browser.close();
    }

    @Test
    public void radioButtonTests() {
        Pages.pathPages().goTo();
        PathPage pathPage = Pages.pathPages().getPathPage("Demo");


    }



}
