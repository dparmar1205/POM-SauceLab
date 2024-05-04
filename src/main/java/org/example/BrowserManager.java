package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;                                                                                                                                                                                                                        import org.openqa.selenium.edge.EdgeDriver;
                                                                                                                                                                                                                                    import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils{

    //Keep anything related to browser here.

    String browser = "Chrome";

    public void openBrowser() {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.out.println("Your Browser is Chrome");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.out.println("Your browser is Firefox");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.out.println("Your browser is Edge");
            driver = new EdgeDriver();
        } else {
            System.out.println("Your browser name is wrong" + browser);
        }


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }

    public void closeBrowser(){
        driver.quit();
    }
}
