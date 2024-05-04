package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Utils extends BasePage {

    //any reusable method will come here
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void typeIn(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getText(By by) {
        return driver.findElement(by).getText();
    }

    public static void verifyURLContains(String url) {
        Assert.assertTrue(driver.getCurrentUrl().contains(url));
    }

    public static void addToCart() {
        clickOnElement(By.id("add-to-cart-button-1"));
    }



    public static void takeScreenshot(String text) {
        //convert web-driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        //call getScreenshotAs method to create image file
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        //move image file to new destination
        //copy file at destination
        try {
            FileUtils.copyFile(SrcFile, new File("src\\Screenshots\\" + text + randomDate() + ".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String randomDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyMMddhhmmss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    //method to use explicit wait
    public static void waitForElementToBeClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    // method to use explicit wait
    public static void textToBePresentInElement(By by, String text, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(by, text));

    }

    //method to use explicit wait using WebDriver
    public static void alertNotification(By by, String text, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofHours(time));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    //method to use explicit wait using WebDriver
    public static void visibilityOfTitle(By by, String text, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.titleContains("something"));
    }

    //method to use explicit wait
    public static void invisibilityOfText(By by, String text, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.invisibilityOfElementWithText(by, text));
    }

    //method to get after visibility of text
    public static void getTextUsingWebDriver(By by, String text, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id")));

    }

    //method to use for a selected text
    public static void waitForElementToBeText(By by, String text, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.textToBe(by, text));
    }

    //method to find selected attribute
    public static void waitForSameAttribute(By by, String text, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.attributeContains(by, text, text));
    }

    //method to use find text by id
    public static void waitToTypeIn(By by, String text, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(text)));
    }

    //method to use find text by class
    public static void waitToGetTextByClass(By by, String text, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(text)));
    }

}
