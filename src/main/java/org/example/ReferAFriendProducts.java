package org.example;

import org.openqa.selenium.By;

public class ReferAFriendProducts extends Utils {
// Refer a product to a friend. Current product Camera and photo

        public void referAProductComputer() {
            clickOnElement(By.xpath("//a[contains(@href, '/electronics')]"));
            clickOnElement(By.xpath("//h2[@class='title']/a[@href='/camera-photo']"));
            clickOnElement(By.xpath("//a[contains(@href,'/nikon-d5500-dslr')]"));

        }
}
