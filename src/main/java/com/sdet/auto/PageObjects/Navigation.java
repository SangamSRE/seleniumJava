package com.sdet.auto.PageObjects;

import com.sdet.auto.SeleniumExtensions.WebDriverBase;
import com.sdet.auto.TestHelper.ConfigSettings;

public class Navigation extends WebDriverBase{
   
	//navigating to the main class
    public static void navToWebPageUnderTest(){
        driver.navigate().to(ConfigSettings.getWebUrl());
    }
}
