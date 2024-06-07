package com.vaporware;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImageScraper {


    public void pullImages() {
        System.setProperty("webdriver.chrome.driver", "insert binary path here");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/imghp/");

        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys("emojis", Keys.ENTER);


        //Pause 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
