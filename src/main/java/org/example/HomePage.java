package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    RegisterPage registerPage = new RegisterPage();

    LoadProp loadProp = new LoadProp();

    //created a method to click on Register button
    public void clickOnRegisterButton() {
        clickOnElement(By.linkText("Register"));
    }

    //created a method to click on login user
    public void logInUser() {

        clickOnElement(By.className("ico-login"));
        typeIn(By.id("Email"), loadProp.getProperty("emailForLogin"));
        typeIn(By.id("Password"), loadProp.getProperty("password"));
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
    }

    //to navigate to product from home page.
    public void clickOnBuildMyOwnComputer() {
        clickOnElement(By.xpath("//h2[@class='product-title']/a[@href='/build-your-own-computer']"));


    }

}
