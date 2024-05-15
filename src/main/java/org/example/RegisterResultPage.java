package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class RegisterResultPage extends Utils {
    LoadProp loadProp = new LoadProp();

    // adding assert point for comparison between actual and expected


    public void verifyUserIsRegisteredSuccessfully() {

        //wait for safari browser
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String actualMsg = getText(By.className("result"));

        //waitUntilElementIsVisible(5);

        Assert.assertEquals(actualMsg, loadProp.getProperty("expectedRegisterSuccessMessage"));
    }
}
