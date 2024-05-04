package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils {
    LoadProp loadProp = new LoadProp();

    // adding assert point for comparison between actual and expected
//    String expectedRegisterSuccessMessage = "Your registration completed";


    public void verifyUserRegisteredSuccessfully() {

        //waitUntilElementIsVisible(5);

        Assert.assertEquals(getText(By.xpath("//div[@class='result']")), loadProp.getProperty("expectedRegisterSuccessMessage"));
    }
}
