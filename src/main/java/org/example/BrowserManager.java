package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils {

    //Keep anything related to browser here.


    LoadProp loadProp = new LoadProp();
    String browser = System.getProperty("browser");
    String sauceUrl = "https://oauth-darshanparmar1535-23692:de8f21a2-5ac1-4e43-af6c-3420cd34d1f3@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

    boolean cloud = Boolean.parseBoolean(System.getProperty("cloud"));


    public void openBrowser() {
        //running in cloud if cloud is true
        if (cloud) {
            System.out.println("Running in cloud.....");

            if (browser.equalsIgnoreCase("Chrome")) {
                System.out.println("Your browser is Chrome");
                ChromeOptions browserOptions = new ChromeOptions();
                browserOptions.setPlatformName("Windows 11");
                browserOptions.setBrowserVersion("latest");

                try {
                    driver = new RemoteWebDriver(new URL(sauceUrl), browserOptions);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            } else if (browser.equalsIgnoreCase("Firefox")) {
                System.out.println("Your browser is Firefox");
                FirefoxOptions browserOptions = new FirefoxOptions();
                browserOptions.setCapability("platformName", "Windows 11");
                browserOptions.setCapability("browserVersion", "latest");
                try {
                    driver = new RemoteWebDriver(new URL(sauceUrl), browserOptions);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            } else if (browser.equalsIgnoreCase("Safari")) {
                System.out.println("Your browser is Safari");
                SafariOptions browserOptions = new SafariOptions();
                browserOptions.setPlatformName("macOS 10.15");
                browserOptions.setBrowserVersion("latest");

                try {
                    driver = new RemoteWebDriver(new URL(sauceUrl), browserOptions);

                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("Your browser name is wrong:" + browser);
            }
            //running in local
        } else {
            System.out.println("Running browser in Local");
            if (browser.equalsIgnoreCase(
                    "Chrome")) {
                System.out.println("Your browser is Chrome");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("Firefox")) {
                System.out.println("Your browser is Firefox");
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("edge")) {
                System.out.println("Your browser is edge");
                driver = new EdgeDriver();

            } else {
                System.out.println("Your browser name is wrong:" + browser);
            }
        }


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(loadProp.getProperty("url"));


    }

    public void closeBrowser() {
        driver.quit();

    }
}




