package com.sdet.auto.PageObjects;

import com.sdet.auto.SeleniumExtensions.WebDriverExtensions;
import com.sdet.auto.TestHelper.LoggingLibrary;
import com.sdet.auto.TestHelper.TestAssert;

public class EmailSentPage extends WebDriverExtensions {

    private final static String txtMessage = "#content";
    
    //sangam_singhfgfg
    public static void VerifyEmailSent(TestAssert testAssert, String expectedMsg){
        
        testAssert.setPass(LoggingLibrary.CompareResult(getElementBySelector(txtMessage).getText(), expectedMsg));
    }
}
