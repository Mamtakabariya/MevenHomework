package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.By.*;

public class Product {
    //protected web driver
    protected static WebDriver driver;

//create main class to register url

    public static void main(String[] args) {
        //creating object to connect with chrome web-driver
        System.setProperty("webdriver.chrome.driver", "src/test/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        //creating object to maximize the browser
        driver.manage().window().maximize();
        //command for the open https://demo.nopcommerce.com/
        driver.get("https://demo.nopcommerce.com/");
        //command to enter for details
        driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]")).click();
        driver.findElement(By.xpath("//h2[@class=\"title\"]//a[@href=\"/desktops\"]")).click();
        //command
        String regMsg = driver.findElement(By.xpath("//h2[@class=\"product-title\"]/a[@href=\"/build-your-own-computer\"]")).getText();

        System.out.println(regMsg);
        driver.quit();
    }
    }

