package org.example;

import org.openqa.selenium.By;

public class EmailAFriend extends Utils {

     LoadProp loadProp = new LoadProp();

    //  to email a friend every now and then.
    public void referFriend() {   //created to use this method for other products
        //  clickOnElement(By.className("email-a-friend"));
        clickOnElement(By.xpath("//button[@class='button-2 email-a-friend-button']"));
        typeIn(By.id("FriendEmail"), loadProp.getProperty("friendEmail"));
        //  typeIn(By.id("YourEmailAddress"), loadProp.getProperty("emailForLogin"));
        clickOnElement(By.xpath("//button[@class='button-1 send-email-a-friend-button']"));
    }
}
