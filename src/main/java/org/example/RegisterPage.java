package org.example;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class RegisterPage extends Utils {

    //to call test data in this method.
    LoadProp loadProp = new LoadProp();



    //enter registration details
    public void enterRegistrationDetails() {

            //wait for safari driver
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        typeIn(By.id("FirstName"), loadProp.getProperty("firstName"));
        typeIn(By.id("LastName"), loadProp.getProperty("lastName"));
        typeIn(By.id("Email"), loadProp.getProperty("emailA"));
        typeIn(By.id("Email"), randomDate()); // to have random date in between to make sure uniqueness.
        typeIn(By.id("Email"), loadProp.getProperty("emailB"));
        typeIn(By.name("Password"), loadProp.getProperty("password"));
        typeIn(By.name("ConfirmPassword"), loadProp.getProperty("confirmPassword"));
        clickOnElement(By.id("register-button"));
    }
    public void registrationForLogin(){

        clickOnElement(By.linkText("Register"));
        clickOnElement(By.linkText("Register"));
        typeIn(By.id("FirstName"), loadProp.getProperty("firstName"));
        typeIn(By.id("LastName"), loadProp.getProperty("lastName"));
        typeIn(By.id("Email"), loadProp.getProperty("emailForLogin"));
        typeIn(By.name("Password"), loadProp.getProperty("password"));
        typeIn(By.name("ConfirmPassword"), loadProp.getProperty("confirmPassword"));
        clickOnElement(By.id("register-button"));

    }
}
