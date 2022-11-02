package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageCategories
{
    protected static WebDriver driver;
    //create main class to register url
    public static void main(String[] args) {
        //creating object to connect with chrome web-driver
        System.setProperty("webdriver.chrome.driver", "src/test/Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        //creating object to maximize the browser
        driver.manage().window().maximize();
        //command for the open https://demo.nopcommerce.com
        driver.get("https://demo.nopcommerce.com/");
        //command for computer category
        driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]")).click();
        // command for electronics category
       driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/electronics\"]")).click();
        // command for apparel category
       driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/apparel\"]")).click();
        // command for digital download category
       driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/digital-downloads\"]")).click();
        // command for books category
       driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/books\"]")).click();
        // command for jewelery category
       driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/jewelry\"]")).click();
        // command for gift-card category
       driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/gift-cards\"]")).click();
       driver.quit();






    }
}
