package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.By.id;

public class BuildYourOwnSelection extends Utils {

    //Build your own Computer page

    public void computerAdding(){
        //creating object for dropdown option
        Select processorDropDown = new Select(driver.findElement(By.name("product_attribute_1")));
        Select ramDropDown = new Select(driver.findElement(id("product_attribute_2")));

        //selecting option 2 of respective category
        processorDropDown.selectByIndex(2);
        ramDropDown.selectByVisibleText("4GB [+$20.00]");
        clickOnElement(By.id("product_attribute_3_7"));
        //add to cart
        clickOnElement(By.id("add-to-cart-button-1"));
    }

}
