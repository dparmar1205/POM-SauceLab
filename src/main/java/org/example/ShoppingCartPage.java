package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils {

    LoadProp loadProp = new LoadProp();
    //verifying expected add to cart matches with product present in shopping cart
    public void verifyShoppingCartPage() {
        String expectedMsg = loadProp.getProperty("expectedResultForComputer");
        String actualMsg = getText(By.className("product-name"));

        clickOnElement(By.className("ico-cart"));
        //      Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='attributes']")), loadProp.getProperty("expectedResultForComputer"));
        Assert.assertEquals(actualMsg, expectedMsg, "Different Product");
    }
}
